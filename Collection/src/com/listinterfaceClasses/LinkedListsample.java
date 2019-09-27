package com.listinterfaceClasses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsample {

	public static void main(String[] args) {
	
		List<String> lli= new LinkedList<String>();
		lli.add("siva");
		lli.add("kiran");
		lli.add("sivakiran");
		lli.add("siva");
		lli.add("kimar");
		lli.add("kiran");
		lli.remove(5);
      lli.add(5, "Hi");
      lli.add(6, "HI2");
      lli.add("HI3");
      lli.add(7, "hiii");
      lli.add(7, "me");
		System.out.println(lli.size());
		System.out.println(lli.get(1));
				
		Iterator it=lli.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		

	}

}
