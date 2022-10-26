public class Char{
public static void main(String args[]){

String input_string="Java practice";
int index =5;
char character='%';
System.out.println("Given sentence is "+input_string);
input_string=input_string.substring(0,index)+character +input_string.substring(index+1);
System.out.println("Modify sentence is " +input_string);
}
}
