//program to check whether the sub string of a given string is palindrome or not
import java.util.Scanner;
class Sub_String
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String n=input.nextLine();
		System.out.println();
		String a;
		a=n.substring(0,5);
        Check_pal(a);
	}
	static void Check_pal(String a)
	{
        String rev="";int l=a.length();
		for (int i=l-1;i>=0;i--)
		{
			rev=rev+(a.charAt(i));
		}
		if (rev==a)
		{
			System.out.println("The substring "+a+" is a palindrome");
		}
		else 
		{
			System.out.println("The substring "+a+" is not a palindrome ");
		}
		
	}
}