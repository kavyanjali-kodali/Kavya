import java.lang.Math;
public class WrapperEx
{
	  public static void main(String[] args)
	  {
		  //Boxing
		  int a=28;
		  double b=0.8;
		  float c=0.82f;
		  boolean d=true;
		  char e='k';
		  byte f=8;
		  Integer ob1=a;
		  Double ob2=b;
		  Float ob3=c;
		  Boolean ob4=d;
		  Character ob5=e;
		  Byte ob6=f;
		  System.out.println("Variable : "+a+" Object : "+ob1);
		  System.out.println("Variable : "+b+" Object : "+ob2);
		  System.out.println("Variable : "+c+" Object : "+ob3);
		  System.out.println("Variable : "+d+" Object : "+ob4);
		  System.out.println("Variable : "+e+" Object : "+ob5);
		  System.out.println("Variable : "+f+" Object : "+ob6);
		  // Unboxing
		  int unwrapped_Int=ob1;
		  double unwrapped_Double=ob2;
		  float unwrapped_Float=ob3;
		  boolean unwrapped_Boolean=ob4;
		  char unwrapped_Character=ob5;
		  byte unwrapped_Byte=ob6;
		  System.out.println("Object : "+ob1+" Unwrapped_Int"+unwrapped_Int);
		  System.out.println("Object : "+ob2+" Unwrapped_Double"+unwrapped_Double);
		  System.out.println("Object : "+ob3+" Unwrapped_Float"+unwrapped_Float);
		  System.out.println("Object : "+ob4+" Unwrapped_Boolean"+unwrapped_Boolean);
		  System.out.println("Object : "+ob5+" Unwrapped_Character"+unwrapped_Character);
		  System.out.println("Object : "+ob6+" Unwrapped_Byte"+unwrapped_Byte);
		  //Random method 
		  System.out.println("Random value using randam() method : "+Math.random());
		  //Power finding 
		  System.out.println("6 raised to the power of 3 (6^3) : "+Math.pow(6,3));
		  //Finding sine value of an angle by converting it in to radians
		  System.out.println("sine of 30 degrees : "+Math.sin(Math.toRadians(30)));
		  //Finding cosine value of an angle by converting it in to radians
		  System.out.println("cosine of 60 degrees : "+Math.cos(Math.toRadians(60)));
		  //Finding Tangent value of an angle by converting it in to radians
		  System.out.println("tangent of 45 degrees : "+Math.tan(Math.toRadians(45)));
		  //Finding Square root of a number
		  System.out.println("Square root of 64 : "+Math.sqrt(64));
		  //Finding minimum of two numbers
		  System.out.println("Smallest of 2 and 3 : "+Math.min(2,3));
		  //Finding maximum of two numbers 
		  System.out.println("Largest of 2 and 3 : "+Math.max(2,3));
		  //Using ceil method
		  System.out.println("Ceil method of 2.03 gives : "+Math.ceil(2.03));
		  //Using floor method 
		  System.out.println("Floor method of 2.03 gives : "+Math.floor(2.03));
		  }
}