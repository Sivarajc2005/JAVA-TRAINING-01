import java.util.*;
public class practice {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
         
        System.out.println(" Test - 1 \n Enter the number to know it is +ve , -ve or Zero");
        int checkNum=scan.nextInt();
        //check the given number is +ve , -ve , 0
        checkNumber(checkNum);

        System.out.println(" Test - 2 \n Enter the number to know it is divisible by 2 and 3");
        int checkDiv=scan.nextInt();
        checkDivisible(checkDiv);

        System.out.println(" Test - 3 \n Welcome To Coffe Shop");
        menue();

        System.out.println(" Test - 4 \n Enter the student mark to know pass or fail");
        grade(55);
        

    }

    public static void checkNumber(int n){
        if(n>0) System.out.println("+ve Number");
        else if(n<0) System.out.println("-ve Number");
        else System.out.println("Zero");
    }

    public static void checkDivisible(int n){
        if(n%2==0){
            if(n%3==0) System.out.println("it Divisible by both 2 and 3");
            else System.out.println("Not Divisible by 3");
        }
        else System.out.println("Not Divisible by 2");
    }

    public static void menue(){
        int total = 0;
        boolean check = true;
        while (check){
            System.out.println(" 1.Tea - 10 \n 2.Coffee - 15 \n 3.Boost - 20 \n 4.exit");
            Scanner scan=new Scanner(System.in);
            int order = scan.nextInt();
            switch(order){
                case 1 :
                  total += 10;
                  break;
                case 2:
                   total += 15;
                   break;
                case 3:
                   total += 20;
                   break;
                case 4:
                   System.out.println("Your Total :" + total);
                   check=!check;
            }
        }
    }

    public static void grade(int mark){
        String result = (mark > 60) ? "pass" : "fail";
        System.out.println(result);
    }
}
