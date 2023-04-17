import java.util.Scanner;
import java.lang.Math;
class Sol_Quadratic
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);
		System.out.println("NOTE:The equation should be in the form of ax^2+bx+c.");
		System.out.print("Enter the value of a : ");
		double a=input.nextDouble();
		System.out.print("Enter the value of b : ");
		double b=input.nextDouble();
		System.out.print("Enter the value of c : ");
		double c=input.nextDouble();
		double det=(b*b)-(4*a*c);
		if (det<0)
		{
			System.out.println("The equation has no real roots");
		}
		else
		{
			double soln1=(-b+Math.sqrt(det))/(2*a);
			double soln2=(-b-Math.sqrt(det))/(2*a);
			System.out.println("The solutions of the equation are "+soln1+" and "+soln2);
		}
	}
}
		