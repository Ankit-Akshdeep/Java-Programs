import java.util.*;
public class PairsArray{

     /*public static void PrintPairs(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i]; //2,4,6,8,10
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("("+ curr + "," + numbers[j]+ ")");
            }
            System.out.println();
        }
     
     }

    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10};
        PrintPairs(numbers);

    }
} *///if there are total n elements in an array, then the total number of pairs can be calculated by - [n(n-1)] / 2 
// the time complexity of this program is O(n^2). since we have used two loops, the first will run "n" times in the worst case, while the second will run for n-1, n-2 and so on till it becomes 1.
// Using the sum of AP formula, we derived, the time complexity to be O(n^2).

//print subarrays program

/*public static void subarr(int arr[]){
    for(int i = 0; i<arr.length; i++){
        int start = i;
        for(int j = i ; j<arr.length; j++ ){
            int end = j;
            for(int k = start; k<=end ; k++){
                System.out.print(arr[k]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

public static void main(String[] args) {
    int arr[] ={2,4,6,8,10};
    subarr(arr);
}*/


// the total numbers of subarrays comes from the formula of sum of n numbers, which is {n(n+1)}/2 .
 
//program for Maximum sum of subarrays

public static void SumOfSubArr(int numbers[]){
      
    int currSum = 0; 
    int MaxSum = Integer.MIN_VALUE;

    for(int i = 0 ; i< numbers.length; i++){
          int start = i;
          for(int j = i; j<numbers.length; j++){
            int end = j ;
            currSum = 0; //sum to be made zero at the start of every subarray
            for(int k=start; k<=end ; k++){
                currSum = currSum + numbers[k];}

                System.out.println(currSum);
                  if(MaxSum<currSum){
                MaxSum = currSum;
              }
            }
          }
          System.out.println("Maximum sum ="+ MaxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        SumOfSubArr(numbers);
    }
}



