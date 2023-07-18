import java.util.Scanner;
class ReverseOrder 
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
		for (int i=ar.length-1;i>=0 ;i-- )
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
	}
}
