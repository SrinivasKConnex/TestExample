package Test.Example;

public class fact {
	
	public static void main(String[] args) {
		//5*4*3*2*1
		long fact =8;
		long sumofFact=1;
		for(long i=fact;i>=1;i--)
		{
			sumofFact=sumofFact*i;
			
		}
		System.out.println(sumofFact);
	}

}
