package Thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnnumArray {
	public static void main(String[] args)
	 {
		// TODO Auto-generated constructor stub
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(14);
		list.add(2);
		list.add(73);
		Enumeration en= Collections.enumeration(list);
		//getting enumeration over Arraylist list
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
