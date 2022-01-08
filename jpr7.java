import java.util.*;

public class jpr7{

	public static void main(String[]args)
	{

		Scanner sc=new Scanner(System.in);

		int u,t,a;
		int distance;

		System.out.print("entre the  u = ");
		u=sc.nextInt();

		System.out.print("enter the t = ");
		t=sc.nextInt();

		System.out.print("enter the a = ");
		a=sc.nextInt();

		distance=((u*t)+(a*t*t)/2);

		System.out.println("distance = "+distance);


	}
}