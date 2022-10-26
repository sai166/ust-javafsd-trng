

import java.util.*;
public class Arraystring{

public static void main(String args[]){

ArrayList<String>input=new ArrayList<String>();
input.add("sai");
input.add("prasath");
input.add("naga");
input.add("prince");
input.add("sai");
System.out.println("The list is "+input);
Set<String>temp=new LinkedHashSet<>(input);
List<String>result_List=new ArrayList<>(temp);
System.out.println("The editing after"+result_List);
}
}
