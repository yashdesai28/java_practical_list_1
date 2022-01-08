import java.util.*;

public class jpr13{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int maths,physics,chemistry,sum3,sum2;

		System.out.print("enter the maths mark = ");
		maths=sc.nextInt();

		System.out.print("enter the physics mark = ");
		physics=sc.nextInt();

		System.out.print("enter the chemistry mark = ");
		chemistry=sc.nextInt();

		sum3=maths+chemistry+physics;
		sum2=maths+physics;

		if(maths>=60&&physics>=50&&chemistry>=40&&sum3>=200||sum2>=150)
		{
			System.out.println("Admission eligible candidates");
		}
		else
		{
			System.out.println("Admission  NOT  eligible candidates");
		}




	}
}