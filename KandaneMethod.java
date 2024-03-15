import java.util.*;
public class KandaneMethod{

     public static void KM(int numbers[]){
        int currSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0 ; i<numbers.length; i++){
            currSum = currSum + numbers[i];
            if(currSum<=0){
                currSum = 0;
            } 

            MaxSum = Math.max(MaxSum, currSum);
        }

            for(int j = 0; j<numbers.length; j++){                //to check if all the elements in the array are negative or not. If negative, return -1.
        
                if(numbers[j]>=0){
                    result = 1;
                    break;
                }

            }
            if(result == 0 ){
                System.out.println("-1");
            }
                 
            
        
        System.out.println("Maximum sum of the subarray ="+ MaxSum);
     
    }
public static void main(String[] args) {
    int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
    KM(numbers);
}
     

} // this code takes O(n) time complexity, because we have run the loop only once. This is a simpler code, with the logic of making the current sum to zero, whenever we 
//encounter a sum which is negative. Better algorithm than Brute force and prefix method.