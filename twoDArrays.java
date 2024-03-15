import java.util.*;
public class twoDArrays{
    public static boolean search(int matrix[][], int key){

        for(int i=0; i<matrix.length; i++){         
            for(int j=0; j<matrix[0].length; j++){

                if(matrix[i][j]==key){

                    System.out.print( "found element at cell (" + i + "," + j + " )");
                    return true;
                }
                
            }
            
    }
    System.out.println("key not found");
    return false;
}

    public static void main(String[] args) {

        int matrix[][] = new int[3][3];  //declaration of a 2d array, with the help of two square brackets. the first being the number of rows while the second being the number of columns.
        //the total number of cells in the matrix is equal to rows multiplied by columns.In this case it is 3*3.
        Scanner sc = new Scanner(System.in);
        //the input inside a 2d array starts from row till we complete it, so pehle row se start hota hai and then column wise jaate hain.
         
        int r = matrix.length;  //this gives the number of rows present in the matrix.
        int c = matrix[0].length; // this gives the number of columns present in the matrix.

        for(int i=0; i<r; i++){         //2d arrays also follow the zero index initialisation, like the one D array.
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //for output
        for(int i=0; i<r; i++){         //2d arrays also follow the zero index initialisation, like the one D array.
            for(int j=0; j<c; j++){
                System.out.print( matrix[i][j]+ " ");
            }
            System.out.println();
        }
         search(matrix, 5) ;                                                 
    }
}