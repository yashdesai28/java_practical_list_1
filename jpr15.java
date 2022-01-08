import java.util.*;

public class jpr15{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int row,col,temp,temp1;

		System.out.print("enter the row = ");
		row=sc.nextInt();

		System.out.print("enter the col = ");
		col=sc.nextInt();

		temp=col;

		for (int i=0;i<row;i++ )
		{
			for(int j=0;j<temp;j++)
			{
				System.out.print("$");
			}	
			temp--;
			System.out.println();
		}



			System.out.println();



		for(int i=0;i<row;i++)
		{
			
			for (int j=0;j<=i;j++)
			{
				if((j+i)%2==0)
				{
					System.out.print("1");
				}
				else{

					System.out.print("0");
				}
			}
			System.out.println();
		}

		System.out.println();


		temp1=col;
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<temp1-1;j++)
			{
				System.out.print(" ");
			}
			temp1--;

			for(int l=1;l<=i;l++)
			{
				System.out.print(i);
			}

			System.out.println();
		}//
	}
}