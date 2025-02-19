import java.util.*;
public class AccountNumber {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = m;
        int sum = 0;
        while(n > 0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum/10==m%10 ? "Valid" : "Not Valid");
    }
}
