package skill5;
import java.util.Scanner;
public class Search {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the no of elements in array:");
		n=sc.nextInt();
		int t;
		System.out.println("Enter the element to be searched:");
		t=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements in the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++)
			if(a[i]==t)
				c++;
		System.out.println("The no of times "+t+" appered in the array is "+c);
	}
}