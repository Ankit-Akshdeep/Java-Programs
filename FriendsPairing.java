import java.util.*;
public class FriendsPairing{
    
    public static int FP(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }

        //choice

        //single
        int fnm1 = FP(n-1);

        //pair
        int fnm2 = FP(n-2);
        int pairways = (n-1)* FP(n-2);

        //totalways
        int totalways = fnm1 + pairways;

        return totalways;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(FP(n));
        
    }
}