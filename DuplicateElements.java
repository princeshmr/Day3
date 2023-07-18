import java.util.Scanner;
import java.util.Arrays;
class DuplicateElements 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []ar=new int[n];
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=scan.nextInt();
		}
		Arrays.sort(ar);
		for (int i=0;i<ar.length-1 ;i++ )
		{
			if (ar[i]==ar[i+1])
			{
				System.out.print(ar[i]+" ");
			}
		}
		System.out.println();
	}
}
