
public class Problem1HW2 {
public static int Mystery(int n)
{
	int S = 0;
	for (int i=1;i <=n;i++)
	{
		S=S+(i*i);
		if (i>= n)
		{
			System.out.println("Big O is n");
		}
	}
	
	return S;
}
	public static void main(String[] args) 
	{
		for (int i =0;i <11;i++)
		System.out.println(Mystery(i)+ " ");	
	}
}

