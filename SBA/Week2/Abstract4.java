package Sba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Abstract4 {
	
	public static void main(String arg []) {
		List<Integer> eid = new ArrayList<>();
		for(int i=1000;i<=1020;i++){
		eid.add(i);
		
	}
		
		System.out.println("Employee Ids: ");
		Iterator itr = eid.iterator();
		while(itr.hasNext())
				System.out.println(itr.next()+" ");
	}

}
