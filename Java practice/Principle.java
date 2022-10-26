
import java.util.Scanner; 
public class Principle{




public static void main(String args[]){


double principal,time,rate,compound_intresrt;

Scanner input=new Scanner(System.in);

System.out.println("Enter the Principal rate");

principal=input.nextInt();

System.out.println("Enter the Principal time");

time=input.nextInt();

System.out.println("Enter the Principal rate");

rate=input.nextInt();


compound_intresrt=(principal*time*rate)/100;
System.out.println(compound_intresrt);



}
}