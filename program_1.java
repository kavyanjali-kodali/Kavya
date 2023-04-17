class program_1
{
  program_1()
  {
   String branch="CSE";
   System.out.println("Branch : "+branch);
   }


   program_1(int m1,int m2,int m3)
   {
    System.out.println("Marks are : "+m1+" , "+m2+" and "+m3);
   }


   program_1(String sub1, int m1,String sub2,int m2,String sub3,int m3)
   {
    System.out.println("Marks of "+sub1+" are "+m1);
    System.out.println("Marks of "+sub2+" are "+m2);
    System.out.println("Marks of "+sub3+" are "+m3);
    }


  void display()
  {
    System.out.println("This is under void display ");
   }

  public static void main(String [] args)
  {
   String name="K.Kavyanjali";
   String reg_no="22BCE9513";
   System.out.println("Name : "+name);
   System.out.println("Register number : "+reg_no);
   program_1 k=new program_1();
   program_1 m=new program_1(91,94,90);
   program_1 n=new program_1("CSE",91,"ECE",94,"MATHS",90);
   k.display();
   }
}
   