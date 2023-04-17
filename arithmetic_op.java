//Arithmetic operators
import java.util.Scanner;
class arithmetic_op
{
  public static void main(String args[])
  {
   Scanner input=new Scanner(System.in);
   System.out.print("Enter one number : ");
   double a=input.nextDouble();//Taking input a from user
   System.out.print("Enter another number : ");
   double b=input.nextDouble();//Taking b
   double sum=a+b;//Addition
   double difference=a-b;//Subtraction
   double product=a*b;//Multiplication
   double quo=a/b;//Finding Quotient
   double rem=a%b;//Finding Remainder
   System.out.println("Sum of given two numbers is "+sum);
   System.out.println("Difference of given two numbers is "+difference);
   System.out.println("Product of given two numbers is "+product);
   System.out.println("a/b :"+quo);
   System.out.println("Remainder when a is divided by b : "+rem);
   }
}

   