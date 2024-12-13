package Test.Example;

public class reverceAnumber {

	public static void main(String[] args) {

		long number = 123;

		/*
		 * long rev=0; while(number!=0) { rev=rev*10+number%10; number/=10; }
		 */

		StringBuffer numToString = new StringBuffer(String.valueOf(number));
		StringBuffer rev = numToString.reverse();

		System.out.println(rev);
	}

}
