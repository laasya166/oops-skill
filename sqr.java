package skill;
import java.util.Scanner;
public class sqr {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		int i;
		for(i=0;i<=n/2;i++)
		{
			if(i*i==n)
			{
				System.out.println("Yes");
				break;
			}
		}
		if(i*i!=n)
		{
			System.out.println("no");
		}
		
	}
}
