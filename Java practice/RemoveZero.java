
import java.util.Arrays;
import java.util.List;

public class RemoveZero{

public static void main (String[] args) {
System.out.println("Input");

      String input_string="0000007865356";

System.out.println("The string is defined as: "  + input_string);


int i=0;

while(i<input_string.length()  && input_string.charAt(i)=='0');
i++;

StringBuffer string_buffer= new StringBuffer(input_string);

string_buffer.replace(0,i,"");
input_string=string_buffer.toString();
System.out.println(input_string);
}
}