import java.util.Random;

public class Problem3 {


    private static void russianPeasant(int n, int m)
    {
    	int add = 0;
    	int mult = 0;
    	int y = n;
    	int x = m;
        int sum = 0;  

        while (m > 0)
        {

             if ((m & 1) != 0)
             {
                 sum = sum + n;
                 add++;
             }

            n = n*2;
            m = m /2;
            mult++;
        }
        System.out.println(y+"	"+x+"	"+add+"	"+mult+"	"+Math.abs(sum));
        

        

    }
     
    // driver program
    public static void main (String[] args) 
    {
       Random r = new Random();
       int a = r.nextInt(1000)+1000;
       int b = r.nextInt(1000)+100;
       for (int i = 0;i <= 100000;i+=1000)
    	   russianPeasant(a+i,b+i);
    }
}

