import java.util.Scanner;
class Magic_show
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		int []ID=new int [10];
		int []dup_ID=new int[9];
		int n=0;
		for (int i=0;i<9;i++)
		{
			System.out.print("Enter the value : ");
			ID[i]=input.nextInt();
		}
		for (int k=0;k<9;k++)
		{
			for (int j=k+1;j<9;j++)
			{
				if (ID[k]==ID[j])
				{
					dup_ID[n]=ID[j];
					n+=1;
				}
			}
		}
		System.out.print("Duplicate ids : ");
		for (int i=0;i<9;i++)
		{
			System.out.print(dup_ID[i]+" ");
		}
	}
}