//Program to check whether a given number is prime or not
import java.util.Scanner;
class check_prime
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number which should be checked for prime : ");
		int n=input.nextInt();
		int res=0;
		if (n==1)
		{System.out.println("1 is neither a prime nor a composite number");}
	    if (n==2)
		{System.out.println("2 is a prime number");}
		if (n>2)
		{
			for (int i=2;i<n;i++)
		   {
			if (n%i==0)
			{	
				System.out.println(n+" is not a prime number.");
			    break;
			}
			else
			{
		       res+=n;
			}
		   }
		   if (res!=0)
			   System.out.println(n+" is a prime number.");
		}
	}
}