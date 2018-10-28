import java.util.ArrayList;
import java.util.Random;

public class Problem2 {
	public static ArrayList SoE(int a)
	{
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		for (int i =0;i <= a;i++)
		{
		x.add(0);	
		}

		for (int p=2;p<=a;p++)
		{
			x.set(p,p);
		}
		for (int p = 2;p<=Math.sqrt(a);p++)
		{
			if (x.get(p) != 0)
				
			{
				
				int j = p*p;
				while (j <=a)
				{
					
					x.set(j, 0);
					j=j+p;
				}
			}

		}
		int i =0;
		
		for (int p=2;p<=a;p++)
		{
			if (x.get(p) != 0)
			{
				L.add(x.get(p));
				i+=1;
			}
		}
	
	return L;
}
	public static void main(String[] args) 
	{
		Random r = new Random();
		ArrayList<Integer> test = new ArrayList<Integer>();
		
		
		
		
		
		for (int i =0;i<100;i++)
		{
			long start = System.nanoTime();
		test = SoE(r.nextInt(100)+(i*90));
		long end = System.nanoTime();
		long result = end - start;
		System.out.println(i+1+" )"+"it took: " +result+" nanoseconds to calculate the Sieve of Eratosthenes");
		}

	}
		
}
