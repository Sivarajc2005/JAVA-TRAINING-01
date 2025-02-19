import java.util.*;
public class CetifiedNumber {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        int sum=0;
        
        for(int i = 1 ; i <= s.length() ; i++){
            if(isprime(i)){
                // System.out.println(i+" prime positions");
                sum+=Character.getNumericValue(s.charAt(i-1));
                // System.out.println(s.charAt(i-1));
            }
        }
        if(sum%3!=0){
            System.out.println("Not certified "+sum);
            return;
        }
        System.out.println("Valid Certifivate");
        
    }

    static boolean isprime(int n){
        if(n==1){
            return false;
        }
        for(int i = 2 ; i < n ;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
