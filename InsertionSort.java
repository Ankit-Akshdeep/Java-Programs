import java.util.*;
public class InsertionSort{        //pick an element from the unsorted part and place it in the right place in the sorted part. Inspiration - playing cards.

    public static void Sort(int arr[]){
        for(int i = 1; i<arr.length; i++){     //agar hum 5 elements ki array ke 4 elements bhi sort kar dein, toh humara array automatically sort ho jayega.
            int curr = arr[i];
            int prev = i-1;
                

            //finding out the correct position to insert.
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];                      //yahan jo elements bade ho rhe the current se, unko humne peeche ki taraf shift kar diya.
                prev -- ;
            }
            //insertion
            arr[prev+1] = curr;          //prev+1 because ho sakta hai prev -- main humara index ek kam ho gaya ho during dry run, we can find the same.

        }
    }
       
    public static void Print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
     
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        Sort(arr);
        Print(arr);
    }

} // the time complexity of this code is again O(n^2). but the algorithm is quite important for interviews and college exams.