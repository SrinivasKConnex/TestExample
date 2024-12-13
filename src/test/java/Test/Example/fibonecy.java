package Test.Example;

public class fibonecy {

	public static void main(String[] args) {

		int fib = 10;
		int a = 0;
		int b = 1;
		for (int i = 0; i < fib; i++) {

			System.out.print(a + " ");

			int nextTerm = a + b;
			a = b;
			b = nextTerm;
		}

	}
}
