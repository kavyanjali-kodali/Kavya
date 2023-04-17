import java.util.Scanner;
class Practice
{
  public static void main(String[] args)
  {
   Scanner input =new Scanner(System.in);
   System.out.print("Enter the number of elements in the array of your favourite numbers : ");
   int n=input.nextInt();
   double fav_num[]=new double[n];
   for (int i=0;i<n;i++)
   {
    System.out.print("Enter your favourite number "+(i+1)+" : ");
    fav_num[i]=input.nextDouble();
   }
   System.out.println("Your favourite number array is "+fav_num);
   //SUM
   double sum=0;
   for (int j=0;j<n;j++)
   {
    sum=sum+fav_num[j];
   }
   //MAX
   double max=fav_num[0];
   for (int i=0;i<n;i++)
   {
    if (fav_num[k]>fav_num[k+1])
    {
     max=fav_num[k];
     }
    else if (fav_num[k]<fav_num[k+1])
     { max=fav_num[k+1];}
    else
    {max=max;}
    }
   System.out.println("Your favorite numbers sum is "+sum);
   System.out.println("Maximum of your favourite numbers is "+max);
   //AVERAGE
   double avg = sum/n;
   System.out.println("Average of your favourite numbers is "+avg);
   //STANDARD DEVIATION
   for (int i=0;i<n;i++)
    {
     fav_num[i]=(fav_num[i]-avg)*(fav_num[i]-avg);
    }
   //SUM OF NEW SERIES 
   double sum_new=0;
   for (int j=0;j<n;j++)
   {
    sum_new=sum_new+fav_num[j];
   }
   double variation= sum_new/n;
   double standard_deviation=variation*0.5;
   System.out.println("Standard deviation : "+standard_deviation);
  }
}