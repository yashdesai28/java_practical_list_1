import java.util.*;

public class exam{


public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		//String y=args[0];

		int size=Integer.parseInt(args[0]);

		System.out.println(size);

		//System.out.println(y);


			int[][] ya=new int[size][size];

				int sumcol=0,sumro=0;

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("ya ["+i+"] ["+j+"]=");
				ya[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				sumro+=ya[i][j];
				
			}
			System.out.println("row="+sumro);
		}

			

	}

}
