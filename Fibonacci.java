package skill;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int a=0,b=1,c=0;
		while(n>0 && a <=n)
		{
			System.out.println(a);
			a=b+c;
			c=b;
			b=a;
		}
	}
}
