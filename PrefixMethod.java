import java.util.*;
public class PrefixMethod{

       public static void PM(int numbers[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //calculate prefix 
        prefix[0] = numbers[0];
        for(int k = 1; k<prefix.length; k++){
                prefix[k]= prefix[k-1] + numbers[k];         
        }

        for(int i = 0;  i<numbers.length; i++){
           int start = i;
            for(int j = i ; j<numbers.length; j++){
              int end = j;
              currSum = start  == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
              
              if(MaxSum<currSum){
                MaxSum = currSum ;
              }
            }
        }
        System.out.println("Maximum sum of subarray:" + MaxSum);
       }



    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        PM(numbers);
    }
} // here the time complexity is O(n^2) and not O(n^3), which was in the brute force method where we were using 3 loops running till n. So this is an optimised method
//to find the maximum sum of subarray.