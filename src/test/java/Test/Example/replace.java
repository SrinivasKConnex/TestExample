package Test.Example;

public class replace {
	public static void main(String[] args) {
		String text="Today is Saturday";
		
		String result=text.replace("Today","Saturday");
		String result1=text.replace("Saturday","Today");

		System.out.println(result1);
	}

}
