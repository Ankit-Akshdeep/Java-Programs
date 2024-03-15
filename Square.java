import java.util.*;

public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input side of square
        double s = sc.nextFloat();

        double area = s*s ;
        System.out.println("Area of the square is :" + area);
    }
}