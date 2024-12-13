package Test.Example;

public class SapTwonumber {

	public static void main(String[] args) {
		int a=10; int b=25;
		
		System.out.println("Before Swapping number:"+"a="+a+" b="+b);
		//method 1
		/*
		 * int t=a; a=b; b=t;
		 */
		
		//method 2
		
		a=a+b; //a=35
		b=a-b;//b=10
		a=a-b;//a=25
		System.out.println("After Swapping number:"+"a="+a+" b="+b);
		
		
		
	}

}
