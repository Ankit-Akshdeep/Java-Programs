import java.util.*;
public class SelectionSort{
 
     public static void Sort(int arr[]){
        for(int i= 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1;j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
     }
       public static void Print(int arr[]){
        for(int i= 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
       } 

    public static void main(String[] args) {
        int arr[]= {5,4,2,1,3};
        Sort(arr);
        Print(arr);
    }
} //the time complexity here is again O(n^2), which is not so much better than the bubble sort but here we are not swapping the values in every inner loop.
// Here we are picking the smallest value from the array, and putting it in front, rather than swapping it step by step with checking with every next value in the array.