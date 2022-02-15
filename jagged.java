import java.util.*;

class jagged{


	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int[][] num=new int[4][];

		num[0] =new int[3];
		num[1] =new int[2];
		num[2] =new int[3];
		num[3] =new int[4];

		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[1][0]=4;
		num[1][1]=5;
		num[2][0]=6;
		num[2][1]=7;
		num[2][2]=8;
		num[3][0]=9;
		num[3][1]=10;
		num[3][2]=11;
		num[3][3]=12;


		for (int i=0;i<num.length;i++ )
		{
			for (int j=0;j<num[i].length;j++ )
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		String a="yash";

		int b=a.length();

		System.out.println("string = "+b);

		int[] as=new int[4];


		int c=as.length;

		System.out.println("array= "+c);
	}
}