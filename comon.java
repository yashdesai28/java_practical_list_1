import java.util.*;

class comon
{
	public static void main(String[]args)
	{
		int[] a={1,2,3,4,5,6};
		int[] b={5,2};
		int[] y=new int[5];
		int count=0;
		

		for (int i=0;i<6;i++)
		{
			for (int j=0;j<2;j++)
			{
				if(a[i]==b[j])
				{
					count++;
				}
			}
		}

		 
		
		System.out.println(count);

		if(count==b.length)
		{
			System.out.println("sub set is ");
		}
		else
		{
			System.out.println("sub set is not ");
		}
	}
}