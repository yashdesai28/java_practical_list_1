import java.util.*;

public class jpr16{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("enter the arry size = ");
		int n=sc.nextInt();

		int[] arry=new int[n];

		for (int i=0;i<n;i++)
		{
			System.out.print("arry ["+i+"]=");
			arry[i]=sc.nextInt();	
		}

		Arrays.sort(arry);

		System.out.println("________________________________");

		for (int i=0;i<n;i++)
		{
			System.out.println("arry ["+i+"]="+arry[i]);
				
		}


	}
}