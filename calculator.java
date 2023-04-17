//CALCULATOR
import java.util.Scanner;
class calculator
{
 public static void main(String args[])
  {
   Scanner input=new Scanner(System.in);
   System.out.println("NOTE:This calculator is only for 2 numbers(a and b) ");
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
   switch(op)
   {
    case 1:
       double k1=a+b;
       System.out.print(k1);
       break;
    case 2:
       double k2=a-b;
       System.out.print(k2);
       break;
    case 3:
       double k3=b-a;
       System.out.print(k3);
       break;
    case 4:
       double k4=a*b;
       System.out.print(k4);
       break;
    case 5:
       double k5=a/b;
       System.out.print(k5);
       break;
    case 6:
       double k6=b/a;
       System.out.print(k6);
       break;
    case 7:
       double k7=a%b;
       System.out.print(k7);
       break;
    case 8:
       double k8=b%a;
       System.out.print(k8);
       break;
  }
  }
}