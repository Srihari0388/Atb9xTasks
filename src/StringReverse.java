public class StringReverse{
public static void main(String[] args) {
        String str = "Hello";
        
        String reversedStr = new StringBuilder(str).reverse().toString();
        
        System.out.println("Reversed String: " + reversedStr);
    }
}