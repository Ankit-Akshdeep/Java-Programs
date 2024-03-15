import java.util.*;
public class SpiralMatrix{
       
    public static void PrintSpiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
           
        while(startRow<=endRow && startCol<=endCol){
        //to print the top of the matrix
        for(int j=0; j<=endCol; j++){
            System.out.print(matrix[startRow][j]+" ");
        }
        //to print the right border
        for(int i=startRow+1; i<=endRow; i++){
            System.out.print(matrix[i][endCol]+" ");
        }
        //to print the bottom border
        for(int j =endCol -1; j>=startCol; j--){

            if(startRow == endRow){                 //this if statement is written because we dont want to print the same top and the bottom, which woll ultimately be the last cell remaining, so it will not print twice.
                break;                                
             }

            System.out.print(matrix[endRow][j]+" ");
        }
        //to print the left border of the matrix
        for(int i = endRow -1; i>=startRow+1; i --){

             if(startCol == endCol){                 //this if statement is written because we dont want to print the same top and the bottom, which woll ultimately be the last cell remaining, so it will not print twice.
                break;                                
             }
            System.out.print(matrix[i][startCol]+" ");
        }

        //updation
        startRow ++;
        startCol ++;
        endRow --;
        endCol -- ;

    }
    System.out.println();
}

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16} };
        PrintSpiral(matrix);                  
    }
}