
public class StringRev {

	public static void main(String[] args) {
		String original="Srihari";
		String reverse="";
		for(int i=0; i<original.length();i++)
		{
			reverse=original.charAt(i)+reverse;
		}
		System.out.println(original);
		System.out.println(reverse);
		
		

	}

}
