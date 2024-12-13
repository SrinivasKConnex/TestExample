package Test.Example;

public class ReversString {
	
	public static void main(String[] args) {
		
		
		String s="Shashi";
		String rs="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rs+=s.charAt(i);
			
		}
		System.out.println(rs);
		
		StringBuffer ss=new StringBuffer(s);
		System.out.println(ss.reverse());
	}

}
