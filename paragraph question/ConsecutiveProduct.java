import java.util.*;
public class ConsecutiveProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = String.valueOf(n);
        int sum=0;
        for(int i = 0 ; i < s.length()-1 ; i++){
            sum+=(s.charAt(i)-'0')*(s.charAt(i+1)-'0');
        }
        System.out.println(sum);
    }
}
