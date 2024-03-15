import java.util.*;
public class Prime{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number : ");
         int n = sc.nextInt();

         if(n==2){
            System.out.println("Is a prime number");
         } else{
              boolean isPrime = true;
         for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){    //to check if number n has more factors than 1 and the number itself.
                isPrime = false;
            }
         }
         if(isPrime==true){
            System.out.println("Number is prime");
         } else{
            System.out.println("Not a prime number");
         }
        } 
      sc.close();
       
    
    }
}