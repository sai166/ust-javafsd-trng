public class Reverse{

public static void main(String args[]){


String  object="Sai prasath";
String reverse="";

for(int i=object.length()-1;i>=0;i--){

reverse=reverse+object.charAt(i);

}
System.out.println(reverse);
}
}

