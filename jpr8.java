import java.util.*;
import static java.lang.Math.sqrt;

public class jpr8{

	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		float demandrate,setupcost,holdingcost;
		float eoq=0,tbo=0;

		System.out.print("enter the demandrate = ");
		demandrate=sc.nextInt();

		System.out.print("enter the setupcost = ");
		setupcost=sc.nextInt();

		System.out.print("enter the holdingcost = ");
		holdingcost=sc.nextInt();

		//prosess

		eoq=(float) sqrt((2*demandrate*setupcost)/holdingcost);

		tbo=(float) sqrt((2*setupcost)/demandrate*holdingcost);

		System.out.println("eoq = "+eoq);
		System.out.println("tbo = "+tbo);

	}

}