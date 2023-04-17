import java.util.Scanner;
class Theatre1
{
	double cost_2d=120;
	double cost_3d=150;
	double tax_2d=0.2*120;
	double tax_3d=0.25*150;
	public void display(int m,int no_tick_2D,int no_tick_3D)
	{
		if (m==1)
		{
			System.out.println("Movie Name:ABC      Director:Yashu");
		}
		else if (m==2)
		{
			System.out.println("Movie Name:XYZ      Director:Ramya");
		}
		System.out.println("No.of 2D tickects : "+no_tick_2D);
		System.out.println("No.of 3D tickects : "+no_tick_3D);
		double tot_cost_2d=no_tick_2D*cost_2d;
		double tot_cost_3d=no_tick_3D*cost_3d;
		double tot_tax_2d=no_tick_2D*tax_2d;
		double tot_tax_3d=no_tick_3D*tax_3d;
		double bill=tot_cost_2d+tot_cost_3d+tot_tax_2d+tot_tax_3d;
		System.out.println("Cost of total 2D tickects : "+tot_cost_2d);
		System.out.println("Cost of total 3D tickects : "+tot_cost_3d);
		System.out.println("Tax for 2D tickets : "+tot_tax_2d);
		System.out.println("Tax for 3D tickets : "+tot_tax_3d);
		System.out.println("Total amount to be paid : "+bill);
	}
}
class Theatre
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Which movie you want ?(Select an option )");
		System.out.println("(1)ABC   (2) XYZ   ");
		int mov=input.nextInt();
		System.out.println("Which type you want? (Enter an option )");
		System.out.println("(1)2D  (2)3D  (3)Both");
		int view=input.nextInt();
		switch(view)
		{
			case 1:
			{
				System.out.print("How many 2D tickets you want ?");
				int no_tick_2D=input.nextInt();
				int no_tick_3D=0;
				Theatre1 ob=new Theatre1();
		        ob.display(mov,no_tick_2D,no_tick_3D);
				break;
			}
			case 2:
			{
				System.out.print("How many 3D tickets you want ?");
				int no_tick_3D=input.nextInt();
				int no_tick_2D=0;
				Theatre1 ob=new Theatre1();
				ob.display(mov,no_tick_2D,no_tick_3D);
				break;
			}
			case 3:
			{
				System.out.print("How many 2D tickets you want ?");
				int no_tick_2D=input.nextInt();
				System.out.print("How many 3D tickets you want ?");
				int no_tick_3D=input.nextInt();
				Theatre1 ob=new Theatre1();
		        ob.display(mov,no_tick_2D,no_tick_3D);
				break;
			}
		}
		//Theatre1 ob=new Theatre1();
		//ob.display(mov,no_tick_2D,no_tick_3D);
		
	}
}