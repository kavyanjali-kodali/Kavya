import java.io.*;
import java.util.Scanner;
  
class Ar2 {
    public static void main (String[] args) 
	{
      Scanner ob=new Scanner(System.in);
      System.out.println("Enter Size of the array: ");
      int n=ob.nextInt();
      double total=0,avg=0;	  
      double [] m=new double[n]; // 5 is the size of arr
      for(int i = 0; i < n; i++) 
	  {
	     m[i]=ob.nextDouble();
		 System.out.println("The array: "+m[i]);
		 total=total+m[i];
		 avg=total/n; 
	  }
	  System.out.println("Avg mark is: "+avg);
	  System.out.println("The array: "+m);
    }
}