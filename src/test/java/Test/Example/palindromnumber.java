package Test.Example;

public class palindromnumber {
	
	public static void main(String[] args) {
		long number=81100118;
		
		StringBuilder n=new StringBuilder(String.valueOf(number));
		
		int len=n.length();
		boolean s=true;
		for(int i=0;i<len;i++)
		{
		s=n.charAt(i)!=n.charAt(len-i-1)?true:false;
		}
		System.out.println(s?"not palindrom":"palindrom");
	}

}
