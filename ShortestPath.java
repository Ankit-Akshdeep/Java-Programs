import java.util.*;
public class ShortestPath{
    public static float SP(String dir){
      int x = 0, y = 0;
       float path;
      for(int i=0; i<dir.length(); i++){
        //north
        if(dir.charAt(i)=='N'){
             y++;
        } 
        //south
        else if(dir.charAt(i)=='S'){
            y--;
        } else if(dir.charAt(i)=='E'){
            x++;
        }else{
            x--;
        }
      }
      int x2 = x*x;
      int y2= y*y;
       path = (float) Math.sqrt(x2+y2);
       return path;
    }
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
      System.out.println("Shortest distance =" + SP(dir));
    }
}