import java.util.*;
public class BubbleSort{
        public static void Sort(int arr[]){
            for(int turn=0; turn<arr.length - 1; turn++){
                for(int j=0; j<arr.length-1-turn; j++){
                    
                    if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    }

                }
            }
        }

        public static void print(int arr[]){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        Sort(arr);
        print(arr);
        
    }
} //in this code we compare the value in the first index with the value in the next index, if the value is bigger, then we swap the values to push the bigger element
// towards the end of the array. turn defines the number of times the above stated logic has to be done. starting from the 0 index going till n - 1 index.
// the time complexity of this code is O(n^2).