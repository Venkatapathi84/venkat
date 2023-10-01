class compute
{
	int show(int x,int y)
	{
		return(x*y);
	}
}
class solve
{
	public static void main(String args[])
	{
		compute s=new compute();
		System.out.println("THE RESULT="+s.show(20,30));
	}
}
