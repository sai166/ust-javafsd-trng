import java.util.Scanner;
import java.lang.*;
 public class Pangram{
    public static void main(String[] args) {
        int f=0;
    String s="abcdefghijklmnopqrstuvwxya";
    if(s.length()>=26){
    for(char s1='a';s1<='z';s1++){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s1){
                f=1;
                break;
            }
            else{
                f=0;
            }
        }
        if(f==0){
            break;
        }
   }
   }
   if(f==1){
       System.out.println("pangram");
   }
   else{
       System.out.println("Not pangram");
   }



   
}
}