import java.util.*;

public class jpr5{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int a;
		byte b;
		double d;
		

		System.out.print("enter the int number = ");
		a=sc.nextInt();

		System.out.print("nter the Double number = ");
		d=sc.nextDouble();

		//convert start 

		b=(byte)a;
		System.out.println("int to byte convert = "+b);

		a=(int)d;
		System.out.println("Double to int convert = "+a);

		b=(byte)d;
		System.out.println("Double to byte convert = "+b);




	}
}