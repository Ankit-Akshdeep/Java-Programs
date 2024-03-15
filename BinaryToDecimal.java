import java.util.*;
public class BinaryToDecimal{

    public static void BinToDEc(int n){
        int number = n;
        int pow = 0;
        int dec = 0;

        while(n>0){
            int ld = n%10;
            dec = dec + (ld * (int)Math.pow(2,pow));

            pow ++ ;
            n= n/10;

        
        }
        System.out.println("Decimal of the number" + number + "=" + dec);
    }

    public static void DecToBin(int a){
        int num = a;
        int pow = 0;
        int bin = 0;

        while(a>0){

            int rem = a % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            a = a/2;
            pow ++;

        }
        System.out.print("Binary of the number"+ num + "=" + bin);

    }

    public static void main(String[] args) {
        BinToDEc(101);
        DecToBin(5);
    }
}