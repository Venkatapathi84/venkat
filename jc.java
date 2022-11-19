class ex
{
	int a,b;
	public void set(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("THE RESULT="+(a+b));
	}
	public static void main(String args[])
	{
		ex obj=new ex();
		obj.set(10,20);
	}
}
