import java.util.*;

public class jpr9{

	public static void main(String args[]){

		

       

		 
          int amount=Integer.parseInt(args[0]);
		int note500,note100,note50,note20,note10,note5,note2,note1;

		

		note500=amount/500;
		System.out.println("NOTE 500 : "+note500);

		note100=(amount%500)/100;
		System.out.println("NOTE 100 = "+note100);

		note50=(((amount%500)%100)/50);
		System.out.println("NOTE 50 = "+note50);

		note20=((((amount%500)%100)%50)/20);
		System.out.println("NOTE 20 = "+note20);

		note10=(((((amount%500)%100)%50)%20)/10);
		System.out.println("NOTE 10 = "+note10);

		note5=((((((amount%500)%100)%50)%20)%10)/5);
		System.out.println("NOTE 5 = "+note5);

		note2=(((((((amount%500)%100)%50)%20)%10)%5)/2);
		System.out.println("NOTE 2 = "+note2);

		note1=((((((((amount%500)%100)%50)%20)%10)%5)%2)%1);
		System.out.println("NOTE 1 = "+note1);

	}
}