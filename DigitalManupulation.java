import java.util.*;
public class  DigitalManupulation{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // countnumDigit(n);
        // reverseNum(n);
        harshadNumber(18);

    }

    public static void countnumDigit(int n){
        int sum=0;
        while(n>0){
            // sum+=n%10;
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
}