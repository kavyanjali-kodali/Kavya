import java.util.Scanner;
class Password
{
	void password(int n)
	{
		System.out.println("Password : "+n+"@VIT-AP");
	}
	void password(String n)
	{
		System.out.println("Password : "+n+"@VIT-AP");
	}
	void password(int n,String m)
	{
		System.out.println("Password : "+n+m+"@VIT-AP");
	}
	void password(String n,int m)
	{
		System.out.println("Password : "+n+m+"@VIT-AP");
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Password ob=new Password();
		System.out.println("What would you want to give as input ?");
		System.out.println("(1)Integer (2) String (3)Integer,String(4)String,Integer ");
		System.out.print("Select an option : ");
		int k=input.nextInt();
		if (k==1)
		{
			System.out.print("Enter the integer : ");
			int n=input.nextInt();
			ob.password(n);
		}
		else if (k==2)
		{
			System.out.print("Enter the String : ");
			String n=input.next();
			ob.password(n);
		}
		else if (k==3)
		{
			System.out.print("Enter the integer : ");
			int m=input.nextInt();
			System.out.print("Enter the String : ");
			String n=input.next();
			ob.password(m,n);
		}
		else if (k==4)
		{
			System.out.println("Enter the integer : ");
			int m=input.nextInt();
			System.out.println("Enter the String : ");
			String n=input.next();
			ob.password(n,m);
		}
	}
}