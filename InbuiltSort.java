import java.util.Arrays;                  //we use java.util.Arrays to sort and work with arrays, while the *; calls all the methods, functions and classes.
public class InbuiltSort{
    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        Arrays.sort(arr);                    //the other format to write this would be specifying the starting and the ending index - Arrays.sort(arrayname,Starting index,Ending index)
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
            
        }
        
    }
} // the time complexity of using such Arrays.sort directly is O(nlogn), which is much better than the normal sorting that we have learned till now, where we swap elements.


//if we have to get the array sorted in the reverse order, we have to import .Collections like we did for .Arrays

