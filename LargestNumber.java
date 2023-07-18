import java.util.Scanner;
class LargestNumber 
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
		int max=ar[0];
		for (int i=1;i<ar.length ;i++ )
		{
			if (ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max);
	}
}
