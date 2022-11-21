//*AREA OF RECTANGLE PROGRAM *//
class Rectangle
{
	int a,int b;
	public void rect(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("THE AREA OF RECTANGLE="+(a*b));
	}
	public static void main(String args[])
	{
		Rectangle obj=new Rectangle();
		obj.rect(10,30);
	}
}
