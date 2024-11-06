import java.util.Scanner;
public class StringCompare1 {

	public static void main(String[] args) {
		Scanner str=new Scanner(System.in);
		System.out.println("Enter str");
		String str1=str.nextLine();
		Scanner st=new Scanner(System.in);
		System.out.println("Enter st");
		String str2=st.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		if(str==st)
		{			System.out.println("Given Strings are same");
		}else
		{
			System.out.println("Given Strings are not same");
		}
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		}

}
