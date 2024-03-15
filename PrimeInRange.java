import java.util.*;
public class PrimeInRange{

    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i= 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }

        }
        return true;
    }   
    
        public static void PrintPrime(int a){
            for(int j = 2; j<= a; j++){
                if(isPrime(j)==true){
                    System.out.print(j + " ");
                }
            }
        System.out.println();
        }

    public static void main(String[] args) {
        PrintPrime(20);
        
    }

}
