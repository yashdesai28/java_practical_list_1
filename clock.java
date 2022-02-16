import java.util.*;

class clock
{
	public static void main(String[]args)
	{
		int[] a={1,2,3,4,5};

		int temp=0,temp2=0,flag=0;
		
		
		for (int i=0;i<a.length-1;i++)
		{
			if(i==2)
			{
				
				temp2=a[i];
				a[i]=temp;
				temp=temp2;
				
			}
			if(i==0)
			{
			temp=a[0];
		
			a[0]=a[a.length-1];
			continue;
			}

			temp2=a[i];
			if(i==1)
			{
			a[i]=temp;
			}
			if(flag==1)
			{
			a[i]=temp;
			}
			temp=temp2;
			flag=1;			
			
		}



		for (int i=0;i<a.length-1;i++)
		{
			System.out.println("a ["+i+"]="+a[i]+" ");
		}
	}
}