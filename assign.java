class assign
{
	public static void main(String[] args )
	{
		Marks k1=new Marks();
		System.out.println("Sum of marks if 3 are given : "+k1.total_marks(84,89,92));
		System.out.println("Sum of marks if 2 are given : "+k1.total_marks(84,92));
	}
}
class Marks
{
	public int total_marks(int m1,int m2,int m3)
	{
		return (m1+m2+m3);
	}
	public int total_marks(int m1,int m2)
	{
		return (m1+m2);
	}
	
}