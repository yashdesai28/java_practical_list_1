import java.util.*;

public class jpr6{


	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int no;
		int year=0;
		int month;
		int day;
		int temp;
		int tmp=0;

		System.out.print("enter the number = ");
		no=sc.nextInt();

		if(no>=365)
		{
			year=no/365;

		}
	
		temp=year*365;
		tmp=no-temp;
		
		if(tmp==0)
		{
			System.out.println("year = "+year);
		}
		else
		{
			month=tmp/30;
			day=tmp%30;

			System.out.println("year = "+year+'\n'+"month = "+month+'\n'+"day = "+day);
		}



	}

}