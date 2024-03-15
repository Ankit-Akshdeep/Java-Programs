import java.util.*;
public class Arrays{


        public static int LinearSearch(int numbers[], int key){

            for(int i=0 ; i< numbers.length; i++){
                if(numbers[i]==key){
                    return i;
                }


            }
            return -1;

        }

    /*public static void update(int marks[]) {
        for(int i = 0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
        
    }*/

    public static void main(String[] args) {
      /*   int marks[] = {97, 98, 99};
             
        update(marks);
        //printing updated marks
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks);(marks[i]);
    }
    System.out.println();*/

    int numbers[] = {1,4,6,8,10,89,78,45};
    int key = 10;
    int index = LinearSearch(numbers, key);

    if(index == -1){
        System.out.println("index not found");
    }else{

    System.out.println("index of the key is"+ index);
    }
  }
}
//the time complexity of this program is O(n) [Big O "ou" of n], since the loop is the main factor that determines the time complexity here and in the worst case scenario, 
// the loop runs until the last index and finds no index for the key.