import java.util.Collections;            //Collections is used to reverse an array in the decreasing order.
import java.util.Arrays;             
public class Inbuilt_Sort{
    public static void main(String[] args) {
        Integer arr[] = {5,3,4,1,2};                          //the collection thing works only on the object data type and not the primitive type, therefore we made primitive 'int' to object type 'Integer'.
        Arrays.sort(arr,Collections.reverseOrder());           
         for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
         }
    }
}