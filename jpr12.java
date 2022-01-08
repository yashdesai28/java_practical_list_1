import java.util.*;

public class jpr12{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;

		for (int i=100;i<200;i++)
		{
			if(i%7==0)
			{
				sum+=i;
			}
			
		}

		System.out.println("sum of divisabal 7 = "+sum);

	}
}