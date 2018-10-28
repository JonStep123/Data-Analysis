import java.util.Random;

public class Problem1 {
public static int[] InsertionSort(int[] A)
{
	int v,j,c=0;
	//this is exactly as the book writes but i added the break in the while loop
	//the selection sort works for all but the last term in the list
	for (int i =1; i <A.length-1;i++)
	{
		v= A[i];
		j = i-1;
		c++;
		
	while ((j >=0) & (A[j] > v))
	{
		A[j+1] = A[j];
		j=j-1;
		c++;
		if (j ==-1)
			break;
	}
	A[j+1]=v;
	}
	System.out.println(c +" Comparisons made " + A.length);
	return A;

}
	public static void main(String[] args) 
	{
		Random r = new Random();
		int[] sArray= new int[500];
		for (int i =0;i <sArray.length;i++)
		{
			sArray[i] =r.nextInt(500);
		}

		int[] newArray = InsertionSort(sArray);
		 sArray= new int[1000];
		for (int i =0;i <sArray.length;i++)
		{
			sArray[i] =r.nextInt(500);
		}

		 newArray = InsertionSort(sArray);
		 sArray= new int[1500];
		for (int i =0;i <sArray.length;i++)
		{
			sArray[i] =r.nextInt(500);
		}

		 newArray = InsertionSort(sArray);
		 sArray= new int[2000];
		for (int i =0;i <sArray.length;i++)
		{
			sArray[i] =r.nextInt(500);
		}

		 newArray = InsertionSort(sArray);
		 sArray= new int[2500];
		for (int i =0;i <sArray.length;i++)
		{
			sArray[i] =r.nextInt(500);
		}

		 newArray = InsertionSort(sArray);
		 sArray= new int[3000];
		for (int i =0;i <sArray.length;i++)
		{
			sArray[i] =r.nextInt(500);
		}

		 newArray = InsertionSort(sArray);



	}
}


