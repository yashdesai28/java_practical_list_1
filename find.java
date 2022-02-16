import java.util.*;

class find{

	public static void main(String[]args)
	{
		int[] a={1,3,4,5};
		int set=0,find=a[0];

		for (int i=0;i<a.length-1;i++)
		{
			if(find==a[i])
			{
				find++;
			}
			else
			{
				set=find;
			}	
		}

		System.out.println(set);
	}
}