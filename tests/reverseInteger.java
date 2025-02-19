import java.util.*;
public class reverseInteger{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = 123;
        System.out.println(reverse(n));
    }

    static int reverse(int n){
        return reversehelp(n,0);
    }

    static int reversehelp(int n,int rev){
        if (n == 0)
        return rev;
        return reversehelp(n / 10, rev * 10 + n % 10);
    }
}
