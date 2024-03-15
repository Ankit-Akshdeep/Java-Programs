import java.util.*;
public class Hey {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter any number");
        int num=sc.nextInt();
        int i;
        
         if(num==1){
            System.out.print("num is not prime nor composite" +" ");
        }
        if(num==2){
            System.out.print("num is prime" +" ");
        }
        for(i=2; i<=num-1;i++){
            if(num%i==0){
                 System.out.print("num is not prime" +" ");
                 break;
            }
            else{
                 System.out.print("num is prime" +" ");
                 break;
            }
        }
        sc.close();
    }
    
}