import java.util.Scanner;
class OddPositionNumber 
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
                for (int i=0;i<ar.length ;i++ )
                {
			if (i%2==0)
			{
				System.out.print(ar[i]+" ");
			}
                }
		System.out.println();
	}
}
