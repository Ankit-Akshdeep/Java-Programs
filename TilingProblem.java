import java.util.*;
public class TilingProblem{

    public static int TP(int n){        //n is the breadth of floor (2*n), for a tile of 2*1.
        //base
         if(n==0 || n ==1){
            return 1;
         }
        //kaam
        //choice - vertical
        int fnm1 = TP(n-1);

        //choice - horizontal
        int fnm2 = TP(n-2);

        //totalways
        int totways = fnm1 + fnm2;

        return totways;
    }
    public static void main(String[] args) {
        System.out.println(TP(3));
        
    }
}