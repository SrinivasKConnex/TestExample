package Test.Example;

public class findmissingElemntinarray {
	
	public static void main(String[] args) {
		
		int[] b = { 1, 2, 3, 5, 6, 7};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<b.length;i++) {
			sum1+=b[i];
		}
		
		for(int i=0;i<=7;i++)
		{
			sum2+=i;
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println("missing numbe :"+(sum2-sum1));
		
		
	}

}
