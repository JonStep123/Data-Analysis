import java.util.Arrays;

public class Problem4HW2 {
public static int Riddle(int[] A)
{
	int BigO= 0;
	int n=A.length;
	int temp;
if (n==1)
{
	System.out.println("The Big O is : "+ BigO);
	return A[0];
}

else 
{
	temp = Riddle(Arrays.copyOf(A, A.length-1));

}
if (temp <= A[n-1])
{

	return temp;
}
else 

	return A[n-1];	
}
		
	



public static void main(String[] args) 
{
	int[] nums = {60,20,30,40,50,10,70,80,90,100};
	System.out.println(Riddle(nums));
}
}
