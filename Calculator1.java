//Calculator
import java.util.Scanner;
class Calculator1
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
        System.out.println("NOTE:This calculator is only for 2 numbers(a and b) ");
		calculate();
	}
	public static void calculate()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Do you want any operation?");
		System.out.println("Select an option : ");
		System.out.println("(1)YES   (2)  NO  ");
		int k=input.nextInt();
		if (k==1)
		{
			System.out.println("Enter the numbers you want for the operation");
		    System.out.print("Enter the number a : ");
		    double a=input.nextDouble();
            System.out.print("Enter the number b : ");
            double b=input.nextDouble();
            System.out.println("Which operation do you want?(Select an option)");
            System.out.print("(1)a+b ");
            System.out.print("(2)a-b ");
            System.out.print("(3)b-a ");
            System.out.print("(4)a*b ");
            System.out.print("(5)a/b ");
            System.out.print("(6)b/a ");
            System.out.print("(7)a%b ");
            System.out.println("(8)b%a ");
            int op=input.nextInt();
			if (op==1)
			{
				double a1=a+b;
				System.out.println("a+b : "+a1);
			}
			else if (op==2)
			{
				double a2=a-b;
				System.out.println("a-b : "+a2);
			}
			else if (op==3)
			{
				double a3=b-a;
				System.out.println("b-a : "+a3);
			}
			else if (op==4)
			{
				double a4=a*b;
				System.out.println("a*b : "+a4);
			}
			else if (op==5)
			{
				double a5=a/b;
				System.out.println("a/b : "+a5);
			}
			else if (op==6)
			{
				double a6=b/a;
				System.out.println("b/a : "+a6);
			}
			else if (op==7)
			{
				double a7=a%b;
				System.out.println("a%b : "+a7);
			}
			else if (op==8)
			{
				double a8=b%a;
				System.out.println("b%a : "+a8);
			}
			else
			{
				System.out.println("INVALID OPTION ");
			}
			calculate();
		}
		else if (k==2)
		{
			System.out.println("YOUR CALCULATION ENDS");
		}
		else 
		{ System.out.println("INVALID OPTION ");
	      calculate();
		}
	}
}
		    