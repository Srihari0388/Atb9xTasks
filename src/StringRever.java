import java.util.Scanner;  // Import the Scanner class

public class StringRever{
public static void main(String args[]){
	String rev = "";
Scanner str = new Scanner(System.in);
System.out.println("Enter the string to be Reverse:");
String str1 =str.nextLine();
System.out.println(str1);
for (int i=0;i<str1.length(); i++) {
	rev=str1.charAt(i)+rev;
	
}
System.out.println("Reverse:"+rev);


	
}
}