package skill6;
import java.util.Scanner;
public class Student {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		long id;
		System.out.println("Enter the id of the student:");
		id=sc.nextLong();
		String name;
		System.out.println("Enter the name of the student:");
		name=sc.next();
		int a,b,c;
		System.out.println("Enter the marks of the students:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int total=FindTotal(a,b,c);
		int avg=FindAvarage(a,b,c);
		System.out.println("The name of the student is "+name+"\nThe id of the student is "+id+"\nThe total is "+total+" The avarage is "+avg);
	}
	public static int FindTotal(int a, int b, int c)
	{
		return a+b+c;
	}
	public static int FindAvarage(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		return avg;
	}
}
