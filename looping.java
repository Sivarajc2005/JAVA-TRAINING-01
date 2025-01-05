import java.util.*;
public class looping {
    public static void main(String[] args){
        // oddNumber(30);
        // primeNumber(20);
        // sumNaturalNumber(10);
        // multiplicationTable(10);
        // nNumber(10);
        // num(50);
        // magicNumber(50);
    }
    public static void oddNumber(int n){
        for(int i = 0 ; i < n ; i=i+2){
            System.out.print((i+1) + " ");
        }
    }

    public static void primeNumber(int n){
         Boolean check = true;
         for ( int i =2 ; i < n ; i++){
             if(n%i == 0 ){
                 System.out.println("Not A Prime ");
                 check=!check;
                 break;
             }
         }
         if(check) System.out.println("Prime");
    }
    
    public static void sumNaturalNumber(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
           sum += i; 
        }
        System.out.println(sum);
    }

    public static void multiplicationTable(int n){
        int num =0;
        while(num <= 10){
            System.out.println(num +" * "+n+" = "+ num*n);
            num++;
        }
    }

    //do while 
    public static void nNumber(int n){
        int i =1;
        do { 
            System.out.println(i);
            i++;
        } while (i<n);
    }

    public static void num(int n){
        int odd = 0,even =0;
        int i =0;
        do { 
            if(i%2==0) even+=i;
            else odd+=i;
            i++;
        } while (i<=n);
        System.out.println("i am entered");
        System.out.println("Sum Of Even :"+even);
        System.out.println("Sum of Odd :"+odd);
    }

    public static void magicNumber(int n){
        Boolean check =true;
        while(check){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter Your Gessing :");
            int gess = scan.nextInt();
            if(gess < n) System.out.println("Smaller");
            else if(gess > n) System.out.println("Bigger");
            else {
                System.out.println("You are the Winner");
                check = !check;
            }
        }
    }
}
