import java.util.Scanner;
class PrintElement 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for (int i=0;i<ar.length ;i++ )
		{
			ar[i]=scan.nextInt();
		}
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.print(ar[i]+" ");
		}
                System.out.println();
	}
}
