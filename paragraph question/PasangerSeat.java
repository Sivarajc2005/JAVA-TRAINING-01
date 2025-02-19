import java.util.*;

public class PasangerSeat {
   public static void main(String[] arg){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int esum , osum;
    esum=osum=0;
    String s = String.valueOf(n);
    for(int i = 0 ; i < s.length() ;i++){
        if(i%2==0){
            esum+=Character.getNumericValue(i);
        }
        else{
            osum+=Character.getNumericValue(i);
        }
    } 

    System.out.println(esum > osum ? "Prime Seats" : "Standard seats");

    scan.close();

   } 
}
