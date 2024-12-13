package Test.Example;

public class findnoofaddandevendigit {
	public static void main(String[] args) {

		int num=987521463;
		int odd=0;
		int even=0;
		while(num>0)
		{
			int num2=num%10;
			num/=10;
			if(num2%2==0)
			{
				even++;
			}else {
				odd++; 
			}
		}
		System.out.println("Number of even number:"+even);
		System.out.println("Number of odd number:"+odd);
		
		
	}

}
