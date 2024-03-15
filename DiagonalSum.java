import java.util.*;
public class DiagonalSum{
    public static int DS(int matrix[][]){

           int sum = 0;
        //brute force method with a time complexity of O(n^2)
        /*for(int i= 0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length;j++){
                
                //for primary diagonal
                if(i==j){
                    sum += matrix[i][j];
                } else if(i+j == matrix.length -1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;*/
            
        //optimised method which takes O(n) times as it uses single loop
        for(int i=0; i<matrix.length; i++){

            //for primary diagonal 
            sum += matrix[i][i];

            //for secondary diagonal
            if(i!=matrix.length -1 -i){                       //condition to check overlapping, there should not be overlapping of elements in the sum for n= odd.
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        System.out.println(DS(matrix));                  
    }
}