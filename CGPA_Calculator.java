import java.util.*;
public class CGPA_Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for ( int i = 0; i < 6 ; i++ ){
            System.out.print("Enter Subject "+ (1+i) + " Mark :");
            sum += scanner.nextInt();
        }
        System.out.println("Your CGPA is :" + ((sum/6)/10));
    }
}
