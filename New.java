import java.util.Scanner;
interface A
{
	void Cus_det_display(String name,long ph_no);
	void ac_info_display(long ac_no,int bal);
}
interface B
{
	void cal_interest(int prin_am,int years,int ri);
}
class Bank implements A,B
{
	String name;
	long ph_no;
	long ac_no;
	int bal;
	int prin_am;
	int years;
	int ri;
	Bank(String name,long ph_no,long ac_no,int bal,int prin_am,int years,int ri)
	{
		this.name=name;
		this.ph_no=ph_no;
		this.ac_no=ac_no;
		this.bal=bal;
		this.prin_am=prin_am;
		this.years=years;
		this.ri=ri;
		Cus_det_display(name,ph_no);
		ac_info_display(ac_no,bal);
		cal_interest(prin_am,years,ri);
	}
	public void Cus_det_display(String name,long ph_no)
	{
		System.out.println("CUSTOMER DETAILS");
		System.out.println("Name : "+name);
		System.out.println("Phone number : "+ph_no);
	}
	public void ac_info_display(long ac_no,int bal)
	{
		System.out.println("Account details of "+name);
		System.out.println("Account number : "+ac_no);
		System.out.println("Account balance : "+bal);
	}
	public void cal_interest(int prin_am,int years,int ri)
	{
		System.out.println("Principle Amount : "+prin_am);
		System.out.println("No of years : "+years);
		System.out.println("Rate of interest : "+ri);
		double interest=(prin_am*years*ri)/100;
		double amount=prin_am+interest;
		System.out.println("Interest Amount : "+interest);
		System.out.println("Total amount : "+amount);
	}
}
class New
{
	public static void main(String[] args )
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the name of the customer : ");
		String n=input.nextLine();
		System.out.print("Enter their phone number : ");
		long ph=input.nextLong();
		System.out.print("Enter their account number : ");
		long ac=input.nextLong();
		System.out.print("Enter the balance amount in the customer amount : ");
		int bal=input.nextInt();
		System.out.println("Loan amount Calculator ");
		System.out.print("Enter the principle amount : ");
		int am=input.nextInt();
		System.out.print("Enter the no of years : ");
		int y=input.nextInt();
		System.out.print("Enter the rate of interest : ");
		int ri=input.nextInt();
		Bank k=new Bank(n,ph,ac,bal,am,y,ri);
	}
}