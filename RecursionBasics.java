import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class RecursionBasics{

    public static void PrintDec(int n){         //decreasing order

        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        PrintDec(n-1);
    }

    public static void PrintInc(int n){      //increasing order

        if(n==1){
            System.out.println(n);
            return;
        }
        PrintInc(n-1);
        System.out.println(n);
    }


    public static int Factorial(int n){                 //for calculating factorial of a number
        if(n==0){
            return 1;
        }

        int fnm1 = Factorial(n-1);
        int fn = n * Factorial(n-1);
        return fn;
    }

    public static int Sum(int n){           //calculating sum of n natural numbers

        if(n==1){
            return 1;
        }
        int Snm1 = Sum(n-1);
        int Sn = Sum(n-1) + n;
        return Sn;
    }

    public static int Fib(int n){   //fibonacci of Nth term in the series   //the space complexity will be O(n) but the Time complexity will be exponential which will be O(2^n), because a tree is forming where the calls are getting exponentially increased.
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
      
        int fibnm2 = Fib(n-2);
        int fibnm1 = Fib(n-1);
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }

    public static boolean SortedArray(int arr[], int i){        //to check if the array is sorted or not
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
         return SortedArray(arr, i+1);
     
    }

    public static int FirstOccurence(int arr1[], int i,int key){      //to find the first occurence in an array. Compare with self then look forward.
        if(i == arr1.length -1){
            return -1;
        }
        
        if(arr1[i]==key){
            return i;
        }
        return FirstOccurence(arr1, i+1,key);
    }

    public static int LastOccurence(int arr1[], int key, int i){
        if(i == arr1.length -1){
            return -1;
        }
        
        int isFound = LastOccurence(arr1, key, i+1 );
         
        if(isFound == -1 && arr1[i]==key){
            return i;
        }
        return isFound;
    }

    public static int ToThePower(int n, int pow){       //to calculate to the power of a number.
        if(pow == 0){
            return 1;
        }
        int result = n* ToThePower(n, pow -1);
        return result;
    }

    public static int Power(int n, int pow){           //optimised way of getting to the power of a number. The time complexity if O(log n), because we are exponentially dividing the power in half for each step.
        int result =0;
        int halfpower = Power(n, pow/2);
        if(pow == 0){
            return -1;
        }       
        if(pow%2 == 0){
         result = halfpower * halfpower;
    }
    if(pow%2 != 0){
         result = n * halfpower* halfpower;
    }
    return result;
}

    public static void main(String[] args) {
        int n = 10;

        int arr[] = {1,2,3,4,5};

        int arr1[] = {3,6,8,10,2,1,5,7,6};

        PrintDec(n);

        PrintInc(n);  

        System.out.println(Factorial(n));

        System.out.println(Sum(n));

        System.out.println(Fib(n));

        System.out.println(LastOccurence(arr1, 6, 0));

        System.out.println(SortedArray(arr, 0));

        System.out.println(FirstOccurence(arr1, 0,5));

        System.out.println(ToThePower(2, 10));

        System.out.println(Power(2, 10));
        }
    }
// the time complexity of all these functions are O(n). The space complexity will also be O(n) because even if the main is the only function left at the last, 
//the call stacks do take up memory evertime a function is called for recursion.