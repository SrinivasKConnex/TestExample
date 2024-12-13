package Test.Example;

public class largestofthreenumber {

	public static void main(String[] args) {

		int a = 600;
		int b = 300;
		int c = 100;

		/*
		 * if (a > b && a > c) { System.out.println(a + " : a is lorgest number"); }
		 * else if (b > a && b > c) { System.out.println(b + " : b is lorgest number");
		 * } else { System.out.println(c + " : c is lorgest number"); }
		 */
		
	
		int largest=c>(a>b?a:b)?c:a>b?a:b;
		
		System.out.println(largest );
	}

}
