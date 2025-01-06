import java.util.*;
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // sumEvenAndOdd(n);
        // perfectSquare(n);
        triperfect(n);
    }
    public static void sumEvenAndOdd(int n){
        int rem = 0;
        int even=0;
        int odd =0;
        while(n>0){
            rem = n%10;
            if(rem%2==0) even+=rem;
            else odd+=rem;
            n/=10;
        }
        System.out.println(" Sum of Even :"+even +"\n Sum of Odd :" + odd);
    }

    public static void perfectSquare(int n){
        boolean check=false;
        for(int i =0 ; i < n ; i++){
            if(i*i == n) {
                check=true;
                break;
            }
        }
        if(check){
            System.out.println("Perfect Square");
        }
        else System.out.println("Not Perfect Square");
    }

    public static void triperfect(int n){
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(n%i == 0) sum+=i;
        }
        if((sum*3)==n) System.out.println(" Triperfect");
        else System.out.println("Not Triperfect");
    }
}
