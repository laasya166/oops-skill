package skill5;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the length of the array");
		n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the values of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array is :");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
