import java.util.*;
public class Switch{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        // double x =scan.nextInt();
        // double y=scan.nextInt();
        // char c=scan.next().charAt(0);
        // calculator(x, y, c);
        bank();

    }

    public static void bank(){
        Scanner scan=new Scanner(System.in);
        int balance=1000;
        System.out.println(" Balance Enquiry : 1 \n Withdraw : 2 \n Deposite : 3");
        int chose = scan.nextInt();
        switch(chose){
            case 1 :
              System.out.println(balance);
              break;
            case 2:
              System.out.print("Enter Withdraw Amount :");
              int Withdraw =scan.nextInt();
              if(Withdraw < balance){
                balance=balance-Withdraw;
                System.out.println("New Balance :"+balance);
              }
              else System.out.println("Cant Have Necessory Balance");
              break;
            case 3:
              System.out.print("Enter Deposite Amount :");
              int deposite = scan.nextInt();
              balance+=deposite;
              System.out.println("New Balance :"+balance);
              break;
        }
        
        
    }

    public static void calculator(double x,double y ,char c){
        switch(c){
            case '+' -> System.out.println(x+y);           
            case '-' ->System.out.println(x-y);
            case '*' -> System.out.println(x*y);
            case '/' -> System.out.println(x/y);
            default -> System.out.println("Invalid character");
        }
    }
    public static void dayFinder(int day){
        // int day = 5;
        switch(day){
            case 1 -> System.out.println("Monday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("sunday");
        }
    }
}