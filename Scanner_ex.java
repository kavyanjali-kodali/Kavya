import java.util.Scanner;//for taking input from user you should import Scanner class
class Scanner_ex
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		//You should create an object related to the scanner class
		//With that object you can take input from user
		int a; double c; float b; char d; String e; String f;
		System.out.print("Enter your int value : ");
		a=input.nextInt();//object.nextInt() for integers
		System.out.print("Enter your float value : ");
		b=input.nextFloat();//object.nextFloat() for float data type values
		System.out.print("Enter your double value : ");
		c=input.nextDouble();//object.nextDouble() for double data type
		System.out.print("Enter your character : ");
		d=input.next().charAt(0);//object.next()charAt(0) for taking first entered character
		System.out.print("Enter your String : ");
		e=input.next();//for taking one string
		//System.out.print("Enter your String : ");
		f=input.nextLine();//for taking the remaining string from above
		//Printing the results
		System.out.println("a is "+a);
		System.out.println("b is "+b);
		System.out.println("c is "+c);
		System.out.println("d is "+d);
		System.out.println("e is "+e);
		System.out.println("f is "+f);
	}
}