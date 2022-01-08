import java.util.*;

public class jpr11 {


	public static void main(String[]args)
	{
		int ch,totaleven=0,totalodd=0,evensum=0,oddsum=0;
		Scanner sc=new Scanner(System.in);

		int[] arry=new int[5];
			
			for (int i=0;i<5;i++ ) 
			{
				System.out.print("enter the ["+i+"]=");
				arry[i]=sc.nextInt();	
			}	

			for (int i=0;i<5;i++ ) 
			{
				if(arry[i]%2==0)
				{
					totaleven++;
					evensum+=arry[i];
				}
				else
				{
					totalodd++;
					oddsum+=arry[i];
				}

			}

			System.out.println("_______________________________________");

			do{

				System.out.println("press 1 totaleven number ");
				System.out.println("press 2 totalodd number ");
				System.out.println("press 3 sumof even number ");
				System.out.println("press 4 sum of odd number ");

				System.out.println("_______________________________________");

				System.out.print("enter the choice = ");
				ch=sc.nextInt();

				System.out.println("_______________________________________");

				switch(ch)
				{
					case 1:
					System.out.println("_______________________________________");
					System.out.println("totaleven number = "+totaleven);
					System.out.println("_______________________________________");

					break;

					case 2:

					System.out.println("_______________________________________");
					System.out.println("totalodd  number = "+totalodd);
					System.out.println("_______________________________________");

					break;

					case 3:

					System.out.println("_______________________________________");
					System.out.println("evensum = "+evensum);
					System.out.println("_______________________________________");
			
					break;

					case 4:

					System.out.println("_______________________________________");
					System.out.println("oddsum = "+oddsum);
					System.out.println("_______________________________________");

					break;	


				}
			}while(ch!=5);

	}

}