import java.util.*;
public class stringAnagrams{

    public static void Anagram(String str1, String str2){
        //convert the strings to lowercase so that we dont have to deal with the cases later.
        str1.toLowerCase();
        str2.toLowerCase();
        
        //checking if the lengths are same

        if(str1.length()==str2.length()){

           //conversion of string to character array

           char[] str1charArray = str1.toCharArray();
           char[] str2charArray = str2.toCharArray();

           //sorting the chararrays
           Arrays.sort(str1charArray);
           Arrays.sort(str2charArray);
        
           //check the equality of the words after sorting them in ascending order.
           
           boolean result = Arrays.equals(str1charArray,str2charArray);
           if(result == true){
            System.out.println(str1 + " "+ "and"+" "+str2 + " "+ "are anagrams of each other");
           }else{
            System.out.println("they are not anagrams");
           }

        }        
        
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        Anagram(str1, str2);
    }
}