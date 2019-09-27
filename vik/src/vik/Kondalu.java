package vik;



public class Kondalu {

	public static void main(String[] args) {
		System.out.println("enter the string");
		String s= " ";
		String [] a= s.split(" ");
		//Array.reverse(a);
		for(int i=0; i<a.length-1;i++)
		{
			System.out.println(a[i]+" "+' ');
		}
	}

}
