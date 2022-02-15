import java.util.*;

class min2larj{


	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);

		int[] arry={9,12,6,8,10};
		int max=0,max2=0;


		for(int i=0;i<5;i++)
		{
			if(max<arry[i])
			{
				max=arry[i];
			}
		}

		System.out.println("max="+max);

		for(int i=0;i<5;i++)
		{
			if(max==arry[i])
			{
				continue;
			}
			else
			{
				if(max2<arry[i])
				{

					max2=arry[i];

				}

			}
		}

		System.out.println("max2="+max2);
	}
}