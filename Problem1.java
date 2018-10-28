import java.util.Random;

public class Problem1 {
	public static int gcd(int a, int b)
	{
		if(b > a)
		{
		if ((b% a) == 0)
			return b;
		
		else
			return gcd(a, b%a);
		}
		else
		{
			if (a%b==0)
				return b;
			else
				return gcd(b,a%b);
		}
	}
	public static int cic(int a, int b)
	{
		int c = Math.min(a, b);
		
		for (;c>0;c--)
		{
			if (a % c == 0)
				if (b % c==0)
					return c;
		}
		return 0;
	
	}
	public static void main(String[] args) 
	{
		
		Random r = new Random();
		
		int num1;
		int num2;
		long start = System.nanoTime();

		for (int i= 0; i < 100;i++)
		{
			num1 = r.nextInt(100000) + 1000000;
			num2= r.nextInt(100000)+ 1000000;
			
			//System.out.println(gcd(num1,num2)+ "\n");
			int y = gcd(num1,num2);
		}
		
	
		long end = System.nanoTime();
		long results = end-start;
		System.out.println("it took: " +(results/100)+" nanoseconds to calculate the GCD 100 times using Euclid's Algorithm");
		start = System.nanoTime();

		for (int i= 0; i < 100;i++)
		{
			num1 = r.nextInt(100000) + 1000000;
			num2= r.nextInt(100000)+ 1000000;
			
			//System.out.println(cic(num1,num2)+ "\n");
			int y = cic(num1,num2);
		}
	
		 end = System.nanoTime();
		 results = end-start;
		
		System.out.println("it took: " +(results/100)+" nanoseconds to calculate the GCD 100 times using the Consecutive integer checking algorithm");
	}

}


