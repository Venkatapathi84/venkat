import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int n,a,sum=0;
		System.out.println("ENTER ANY ONE VALUE....!");
		Scanner v=new Scanner(System.in);
		n=v.nextInt();
		for(a=1;a<=n;a++)
		{
			sum++;
		}
		System.out.println("SUM OF NATURAL NUMBERS="+sum);
	}
}
