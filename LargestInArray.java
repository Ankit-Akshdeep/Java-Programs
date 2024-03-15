import java.util.*;
public class LargestInArray{

    public static int GetLargest(int numbers[]){
        int largest = Integer.MIN_VALUE ; // it gives - infinity value to the 'largest' variable // Integert.MAX_VALUE will initialise the variabel with + infinity( usefull while calculating the smallest value in the array.)

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];

            }
        }
        return largest;


    }
 public static void main(String[] args) {
        int numbers[] = {1,5,6,9,3};
      System.out.println("Largest number in the array is"+" "+ GetLargest(numbers));
        
    }
}