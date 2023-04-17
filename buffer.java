//Buffered reader
import java.io.BufferedReader;
import java.io.InputStreamReader;
class buffer
{
public static void main(String args[])throws Exception
 {
 
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the string : ");
  String s=br.readLine();//Buffered reader takes only strings.
  System.out.println("String value is : "+s);
  System.out.print("Enter the int : ");
  int a =Integer.parseInt(br.readLine());//To take int Use Integer.parseInt
  System.out.println("Integer value is : "+a);
  System.out.print("Enter the float : ");
  float b=Float.parseFloat(br.readLine());//To take float Use Float.parseFloat
  System.out.println("Float value is : "+ b);
  
  }
}