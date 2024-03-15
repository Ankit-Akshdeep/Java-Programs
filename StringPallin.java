import java.util.*;
public class StringPallin{
    
    public static boolean Pallindrome(String str){
    int half = str.length()/2;
    int n = str.length();
    for(int i = 0; i<half; i++){
        if(str.charAt(i)!=str.charAt(n-i-1)){
            
            //not a palindrome
            return false;

        }
    }
    return true;
 }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word you want to check");
    String str = sc.next();

    System.out.println(Pallindrome(str));

 }
}