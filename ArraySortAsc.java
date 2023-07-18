import java.util.Scanner;
class ArraySortAsc  
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
		for (int i=0;i<=ar.length-2 ;i++ )
		{
			for (int j=0;j<=ar.length-2 ;j++ )
			{
				if (ar[j]>ar[j+1])
				{
					int temp=ar[j+1];
					ar[j+1]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for (int data:ar)
		{
			System.out.print(data+" ");
		}
		System.out.println();
	}
}
