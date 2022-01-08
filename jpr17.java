import java.util.*;

public class jpr17{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int n,sumrow=0,sumcol=0;

		System.out.print("enter the matrix size n = ");
		n=sc.nextInt();


		int[][] matrix=new int[n][n];

		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				System.out.print("matrix ["+i+"]"+"["+j+"] = ");
				matrix[i][j]=sc.nextInt();		
			}	
		}

		System.out.println("------------------------");
		System.out.println();

		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				System.out.print(matrix[i][j]+" ");
						
			}	
			System.out.println();
		}

		System.out.println("------------------------");
		System.out.println();


		//sum of row

		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				sumrow +=matrix[i][j];
						
			}	
			System.out.println();
			System.out.println("sum of  "+i+" row = "+sumrow);
			sumrow=0;
		}

		//sum of col 


		for (int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++) 
			{
				sumcol +=matrix[j][i];
						
			}	
			System.out.println();
			System.out.println("sum of  "+i+" col = "+sumcol);
			sumcol=0;
		}


	}
}