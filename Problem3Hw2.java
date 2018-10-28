
public class Problem3Hw2 {
public static int Q(int n)
{
	if(n==1)
		return 1;
	else
		return Q(n-1)+2*n-1;
}
public static void main(String[] args) 
{
	for (int i =1;i<11;i++)
	System.out.println(Q(i));
}
}
