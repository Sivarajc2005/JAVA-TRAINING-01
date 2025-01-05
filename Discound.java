import java.util.*;
public class Discound{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int price = scan.nextInt();
       Boolean member = scan.nextBoolean();
       discound(price , member);
    }
    public static void  discound(int price , Boolean member){
      float disc=0;
      if(price > 500 ){
         if(member) disc = price*0.5f;
         else disc=price*0.2f;  
      } 
      System.out.println( price - disc);
   }  
}