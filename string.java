import java.util.*;

class string{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		String a;

		System.out.print("enter the string = ");
		a=sc.next();

		int b=a.length();

		System.out.println(b);

		for (int i=b-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}
}