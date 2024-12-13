package Test.Example;

public class fib {
	public static void main(String[] args) {

		int fib = 10;

		int a = 0;

		int b = 1;
		
		System.out.print(a+","+b);
		
		for(int i=0;i<fib;i++)
		{
			int num3=a+b;
			System.out.print(","+num3);
			a=b;
			b=num3;
			
		}
	}

}
