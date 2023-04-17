class Test1
{
	public static void Rect()
	{
		System.out.println("1");
	}
	public static void Sqrt()
	{
		System.out.println("2");
	}
}
class Test2 extends Test1
{
	public static void Test2()
	{
		super.Rect();
	}
}
class Test
{
	public static void main(String[] args)
	{
		Test2 k=new Test2();
		k.Test2();
	}
}