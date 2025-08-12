package skill6;
import java.util.Scanner;
public class Prime {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no to be checked");
		n=sc.nextInt();
		boolean b;
		b=check(n);
		if(b)
			System.out.println("The no is prime");
		else
			System.out.println("The no is not prime");
	}
	public static boolean check(int n)
	{
		boolean b=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
}
