import java.util.Random;

public class Problem3 {
public static void BruteForceClosestPair(long[][] P)
{
	double d = Double.POSITIVE_INFINITY;
	for (int i=1;i < P.length-1;i++)
	{
		for (int j = i+1; j <P.length;j++)
		{
			double sqrt = Math.sqrt((P[i][0]-P[j][0])*(P[i][0]-P[j][0])+((P[i][1]-P[j][1])*(P[i][1]-P[j][1])));
			
			d = Math.min(d, sqrt);
		}
	}
	
}

public static void BruteForceClosestPair2(long[][] P)
{
	double d = Double.POSITIVE_INFINITY;
	for (int i=1;i < P.length-1;i++)
	{
		for (int j = i+1; j <P.length;j++)
		{
			double sqrt = ((P[i][0]-P[j][0])*(P[i][0]-P[j][0])+((P[i][1]-P[j][1])*(P[i][1]-P[j][1])));
			
			d = Math.min(d, sqrt);
		}
	}
	
}
public static void main(String[] args) 
{
Random r = new Random();
for (int x=1000;x < 4000;x+=1000)
{
long[][] A = new long[x][x];
	for (int i=0;i < 10;i++)
		
		for (int j = 0; j <10;j++)
		{
			
			A[i][j] = r.nextInt(1000)+1000000000;
			long start = System.nanoTime();
			BruteForceClosestPair(A);
			long end = System.nanoTime();
			long sresult = end - start;
			
			start = System.nanoTime();
			BruteForceClosestPair2(A);
			end = System.nanoTime();
			long nsresult = end - start;
			System.out.println("squareroot function: "+sresult/1000000 + " millisecond runtime."+"\n nonsquareroot function:  " + nsresult/1000000+" millisecond runtime.");
		}
}


}


}
