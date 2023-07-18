import java.util.Scanner;
class SmallestNumber 
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
		int min=ar[0];
		for (int i=0;i<ar.length ;i++ )
		{
			if (ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(min);
	}
}
