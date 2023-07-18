import java.util.Scanner;
class SecondLargeNum 
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
		int first_large=Integer.MIN_VALUE;
		int second_large=Integer.MIN_VALUE;
		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i]>first_large)
			{
				second_large=first_large;
				first_large=ar[i];
			}
			else if (ar[i]>second_large)
			{
				if (ar[i] != first_large)
				{
					second_large=ar[i];
				}
			}
		}
		System.out.println(second_large);
	}
}
