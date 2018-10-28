
public class Problem2HW2 {
public static boolean Enigma(int[][] n)
{
	for (int i =0; i <= n.length-2;i++)
		for (int j=i+1; j <= n.length-1;j++)
		{
			
		
			if (n[i][j] != n[j][i])
				return false;
			if (i >= n.length-2 && j >= n.length-1)
				System.out.println("Big O is n^2");
			else
				System.out.println("Big O is n");
		}
	
	return true;
		
}
	public static void main(String[] args) 
	{
		int[][] y = new int [2][];
		y[0]= new int[2];
		y[1]= new int[2];
		System.out.println(Enigma(y));
		y[1][1]=1;
		System.out.println(Enigma(y));	
		y[0][1]=2;
		y[1][0]=3;
		System.out.println(Enigma(y));	
	}
}

