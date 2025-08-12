package skill5;
import java.util.Scanner;
public class Sum {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of square matrix");
		int n;
		n=sc.nextInt();
		int[][] a=new int[n][n];
		System.out.println("Enter elements in the matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Rows");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Sum is "+sum);
		}
		System.out.println("Column");
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<n;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println("Sum is "+sum);
		}
	}

}
