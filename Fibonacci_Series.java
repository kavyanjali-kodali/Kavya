//Fibonacci Series 0,1,1,2,3,5,8,13,21,34,...,
import java.util.Scanner;
class Fibonacci_Series
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of terms in the series : ");
		int n=input.nextInt();
		if (n==1)
		{ System.out.print(0);}
	    else if (n==2)
		{ System.out.print("0,"+"1");}
	    else 
		{
			int a=0;int b=1;int n3;
			System.out.print(a+" "+b+" ");
			for (int i =2;i<n;i++)
			{
				n3=a+b;
				System.out.print(n3+" ");
				a=b;b=n3;
			}
		}
	}
}