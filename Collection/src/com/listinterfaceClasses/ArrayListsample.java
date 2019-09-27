package com.listinterfaceClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListsample {

	public static void main(String[] args) {

  
   List<String> li = new ArrayList<String>();
   li.add("sivs");
   li.add("kumar");
   li.add("sivskumar");
   li.add("siva");
   li.add("kumar");
   System.out.println("Listsize:"+li.size());
   System.out.println(li.get(1));
   
   Iterator it= li.iterator();
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
   
   



	}

}
