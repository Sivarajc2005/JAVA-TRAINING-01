import java.util.*;
public class LookCode {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        int mid = s.length()/2;
        int fsum,ssum;
        fsum=ssum=0;
        for(int i = 0 ; i < s.length() ; i++){
            if(i < mid){
                fsum+=Character.getNumericValue(s.charAt(i));
            }
            else{
                ssum+=Character.getNumericValue(s.charAt(i));
            }
        }
        if(fsum==ssum){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key Not Found");
        }
    }
}
