package vik;

public class hh {

	public static void main(String[] args) {
		
		int x,y,sum;
		x=10;y=11;
		sum=x+y;
		System.out.println(x+" + "+y+" = "+sum);
		
				
		for (int i = 0; i <=4; i++) {
			
			x=y;
			y=sum;
			sum=x+y;
			System.out.println(x+" + "+y+" = "+sum);
			
			System.out.println("\n \n \n");
			int a=5;
			int mul=1;
			
			for (int j = a; j>=1; j--) {
				
				System.out.print(j+"*");
				mul=mul*j;
				
			}System.out.println(" = "+mul);
			
		}
	}

}
