class Student
{
	private  static String name;
	static String Reg_no;
	protected static String email;
	public static int year;
	
	private static void Name()
	{
		name="Kavyanjali";
		System.out.println("Student name : "+name);
	}
	static void show_reg_no()
	{
		Reg_no="22BCE9513";
		System.out.println("Student Reg no : "+Reg_no);
	}
	protected static void Email()
	{
		email="kavyanjali.22bce9513@vitap.ac.in";
		System.out.println("Student email : "+email);
	}
	public static void year()
	{
		year=2026;
		System.out.println("Student Passing out year : "+year);
	}
}
//
class Details extends Student
{
	static void details()
	{
		Name();
		show_reg_no();
		Email();
		year();
	}
	
}
class Main
{
	public static void main(String[] args)
	{
		Details ob=new Details();
		ob.details();
	}
}