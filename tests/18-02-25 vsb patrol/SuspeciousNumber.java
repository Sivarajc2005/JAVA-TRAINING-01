import java.util.*;
public class SuspeciousNumber {
  public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    int last = -1;
    while(n > 0){
        if(last == n%10){
            System.out.println("Suspecious");
            return;
        }
        last =(int) n%10;
        n/=10;
    }
    System.out.println("Safe");
  }  
}
