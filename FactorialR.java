class Factorial
{
	static int num=5;
	static int find(int num)
	{
		int factorial;
		factorial=5*4*3*2*1;
		return factorial;
	}
}
class FactorialR extends Factorial
{
	static int find(int num)
	{
		int factorial=1;
		if (num>0)
		{
			
			if (num==1)
			{
				return factorial;
			}
			else
			{
				factorial=num*find(num-1);
			}
		}
		return factorial;
	}
	public static void main(String[] args)
	{
		Factorial k=new Factorial();
		int l=find(num);
		int m=k.find(num);
		//System.out.println(find(num));
		//System.out.println(k.find(num));
		if (l==m)
		{
			System.out.println("TEST SUCCESFUL");
		}
		else
		{
			System.out.println("TEST FAILS ");
		}
	}
}