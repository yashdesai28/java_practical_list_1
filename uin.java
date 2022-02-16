import java.util.*;

class uin{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int size,count=0;
		System.out.println("enter the 1st array size = ");
		size=sc.nextInt();

		int flag=0;

		int[] a=new int[size];
		int[] b=new int[size];
		int[] c=new int[100];
		int[] in=new int[100];

		for (int i=0;i<size;i++ )
		{
			System.out.print("enter the valu = [ "+i+"]=");
			a[i]=sc.nextInt();
		}

		for (int i=0;i<size;i++ )
		{
			System.out.print("enter the valu = [ "+i+"]=");
			b[i]=sc.nextInt();
		}

		//inter
		int incount=0;
		for (int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(a[i]==b[j])
				{
					in[incount]=b[j];
					incount++;
				}
			}	
		}


		//union
		c[count]=a[0];
		count=1;
		for(int i=1;i<size;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(c[j]==a[i])
				{
					flag=1;
				}
			}
			System.out.println("f="+flag);
			System.out.println("if ni bar = "+a[i]);
			if(flag==0)
			{
					System.out.println("if ni  = "+a[i]);
				c[count]=a[i];
				count++;
			}
			flag=0;
		}

		int temp=count;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<temp;j++)
			{
				if(c[j]==b[i])
				{
					flag=1;
				}
			}
			
			if(flag==0)
			{
					
				c[count]=b[i];
				count++;
			}
			flag=0;
		}



		
		System.out.println(incount);
		for(int i=0;i<incount;i++)
		{
			System.out.println("uinon in["+i+"]="+in[i]);
		}

		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			System.out.println("uinon c["+i+"]="+c[i]);
		}

	}
}