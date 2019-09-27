package vik;

import com.sun.jna.StringArray;

public class StringReverce {

	public static void main(String[] args) {
	
		String original="siva",reverse="";
		for(int i=original.length()-1;i>=0;i--)
		 {
			 reverse=reverse+original.charAt(i);
			 System.out.println(reverse);
			 
		 }

	}

}
