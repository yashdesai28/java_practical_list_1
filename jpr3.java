import java.util.*;

public class jpr3{

public static void main(String[] args){

int marks1;
int marks2;
int sum;
int avg;

Scanner sc=new Scanner(System.in);

System.out.print("enter the marks1= ");
marks1=sc.nextInt();

System.out.print("enter the marks2= ");
marks2=sc.nextInt();

sum=marks1+marks2;

System.out.println("SUMof TWO SUBJECT = "+sum);

avg=sum/2;

System.out.println("AVG of TWO SUBJECT = "+avg);

if(marks1<marks2)
{
System.out.println(marks1);
}
else
{
System.out.println(marks2);
}

}

}