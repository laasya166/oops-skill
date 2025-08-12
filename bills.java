package skill;
import java.util.Scanner;
public class bills {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		if(a<=100)
		{
			a=a*3;
			System.out.println(a);
		}
		else if(a>100 && a<=300)
		{
			a=a*5+100;
			System.out.println(a);
		}
		else if(a>300 && a<=450)
		{
			a=a*6+200;
			System.out.println(a);
		}
		else if(a>450 )
		{
			a=a*8+250;
			System.out.println(a);
		}
	}

}
