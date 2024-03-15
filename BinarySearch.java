import java.util.*;
public class BinarySearch{

       public static int BinS(int numbers[], int key){

            int start = 0;
            int end = numbers.length -1 ;
             
            while(start<=end){
                int mid = (start+end)/2;

                //comparisons
                if(numbers[mid]==key){
                    return mid;

                }else if(numbers[mid]<key){ // left
                    start = mid + 1;

                }else{
                    end = mid - 1 ;   //right
                }
            }
            return -1;

       }

    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14};
        int key = 10;
      System.out.println("The index of our key is"+ " " + BinS(numbers,key));
    }
}
//the number of iterations determine the time complexity of this binary search. In the worst case scenario, we will go till k+1 iterations. n/2^k th term. Solving this
// the value of k that we get will be - k = log n (base2).  The time complexity will be directly proportional to log n. [O(log n)]. The time complexity is less than linear search, making it a better searching method than the linear search.