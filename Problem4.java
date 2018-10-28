import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem4 {
	/* 
	 * ANSWER
	 * i had the program print an x for every time lomutoPartition ran
	 * and it only printed 3 times despite n being much bigger than that,
	 * and because of that im going to have to refute the claim that
	 * the Big o is N
	 * 
	 */
	
   public static void swap(int i, int j,int iIndex, int jIndex, ArrayList<Integer> A)
    {
        A.set(iIndex, j);
        A.set(jIndex, i);
    }
   public static int Quickselect(ArrayList<Integer> A, int k)
   {
	   int l = 0;
	   int comparisons=0;
	   
	   comparisons ++;
	   int s= LomutoPartition(A);
	   if  (s == k-1)
		   return A.get(s);
	   else if (s > l+k-1)
	   {
		   A.remove(A.size()-1);
		   
		   Quickselect(A,k);
	   }
	   else
	   {
		   A.remove(0);
		   Quickselect(A,k);
	   }
	   System.out.println(comparisons);
	   return A.get(s);
	   
   }
public static int LomutoPartition(ArrayList<Integer> A)
{
	System.out.println("x");
	int l = 0;
	int r =A.size();
	
	int p = A.get(l);
	int s = l;
	
	for (int i = l+1; i < r;i++)
	{
		if (A.get(i) < p)
		{
			s = s+1;
			swap(A.get(s),A.get(i),s,i,A);

		}

	}

	swap(A.get(l),A.get(s),l,s,A);
	for (int x =0;x < A.size();x++)
		System.out.print(A.get(x)+" ");
		System.out.println("");
	return s;
}

public static void main(String[] args){
	ArrayList<Integer> j = new ArrayList<Integer>(Arrays.asList(8,10,2,3,7,12,8,10,2,3,7,12,4));
	System.out.println(LomutoPartition(j));

	System.out.println(Quickselect(j,3));

}

}
