import java.util.*;
public class ReverseArray{

         public static void RevAr(int arr[]){
            int first = 0, last = arr.length - 1;      //first index value in last index and vice versa
             while(first<last){
                int temp = arr[last];
                arr[last] = arr[first];   //swapping
                arr[first] = temp;

                first ++;
                last --;
             }
         }
    
    public static void main(String[] args) {
      int arr[]={2,4,6,8,10};
      
      RevAr(arr); //calling the function (since array can be changed by reference, any change in another function, would change the array in the main function)
      for(int i = 0; i<=arr.length; i ++){
        System.out.print(arr[i]+" ");
      }
      System.out.println(" ");
    }
} //the time complexity is O(n), while the space complexity is not big, its just the constant size required by the variables - first and last.