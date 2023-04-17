class marks 
{
	public static void main(String[] args )
	{
		Marks k=new marks(29,38,49);
		Marks k=new marks(29,24);
	}
}
class Marks
{
	void marks(int m1,int m2,int m3)
	{
		System.out.print("Marks of 3 subjects are "+m1+" , "+m2+" and "+m3);
	}
	int marks(int m1,int m2)
	{
		System.out.print("Marks of 2 subjects are "+m1+" and "+m2);
	}
	
}