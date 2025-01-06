import java.util.*;
public class  DigitalManupulation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // countnumDigit(n);
        // reverseNum(n);
        // harshadNumber(18);
        // palindrome(n);
        // largestDegit(n);
        // amstrong(n);
        frequency(n);

    }

    public static void countnumDigit(int n){
        int sum=0;
        while(n>0){
            n=n/10;
            sum++;
            
        }
        System.out.println(sum);
    }

    public static void sumOfDigit(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
    }

    public static void reverseNum(int n){
        int sum=0;
        int d=0;
        while(n>0){
            sum=n%10;
            d=d*10+sum;
            n=n/10;   
        }
        System.out.println(d);
    }

    public static void harshadNumber(int n){
        int num=n;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        if(num%sum == 0){
            System.out.println("Harsha Number");
        }
        else System.out.println("Not A Harsha Number");
    }

    public static void palindrome(int num){
        for(int i = 11 ; i<=num ;i++){
            int org=i;
            int n =i;
            int sum=0;
            int d=0;
            while(n>0){
                sum=n%10;
                d=d*10+sum;
                n=n/10;   
            }
            if(d==org) {
                // System.out.println("Palindrome");
                System.out.println(org);
            }
            // else System.out.println("Not Palindrome");
        }
    }

    public static void largestDegit(int n){
        int max=0;
        int dig=0;
        while(n>0){
            dig=n%10;
            if(dig > max) max=dig;
            n=n/10;
        }
        System.out.println(max);
    }

    public static void amstrong(int num){
        int n = num;
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        int m = num;

        int sum = 0;
        int dig = 0 ;
        while(m>0){
            dig=m%10;
            sum += Math.pow(dig, count);
            m/=10;
        }
        if(sum==num) System.out.println("Amstrong");
        else System.out.println("Not Amstrong");
    }

    public static void frequency(int num){
        int dig=0;
        for(int i = 9 ; i >=0 ; i--){
            int count = 0;
            int m = num;
            while(m>0){
                dig=m%10;
                if(dig == i) count++;
                m/=10;
            }
            if(count  != 0){
                System.out.println(i+" : " + count);
            }
            count=0;
        }
    }
}