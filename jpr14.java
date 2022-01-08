import java.util.*;

public class jpr14{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int num,rem,rev=0;

		System.out.print("enter the number = ");
		num=sc.nextInt();

		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}

		System.out.println("reverse number  = "+rev);
	}
}