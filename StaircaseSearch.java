import java.util.*;
public class StaircaseSearch{

     public static boolean SS(int matrix[][] , int key){
        int row = 0; int col = matrix[0].length - 1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("The index of the key is ("+ row +","+ col + ")");
                return true;

            }
            else if(key < matrix[row][col]){
                col --;
            }
            else {
                row ++;
            }
        }
                System.out.println("the key was not found");
                return false;
            
       

        }
     

    public static void main(String[] args) {
     int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
     int key = 33;    
     SS(matrix,key);                     
    }
} //the time complexity of this code depends on n and m, it will depend on the number which is significantly larger, for ex - if n>>>m, then TC = O(n).
//for instances like this array having equal n and m, the TC will be = O(n+m).