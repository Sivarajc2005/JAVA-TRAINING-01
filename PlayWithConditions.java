import java.util.Scanner;

public class PlayWithConditions {
    public static void main(String[] args) {
        Tempetrature();
    }

    public void checkLeafYear(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = scanner.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("It's Not a leap year");
        }
    }

    public static  void Tempetrature(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Temperature : ");
        int Tem = scanner.nextInt();
        if(Tem>30){
            System.out.println("HOT");
        }
        else if(Tem >= 20 && Tem <= 30){
            System.out.println("WARM");
        }
        else{
            System.out.println("COLD");
        }
    }
}
