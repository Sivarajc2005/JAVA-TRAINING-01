import java.util.*;
public class Swapping{
  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print(" Enter A : ");
      int a = scanner.nextInt();
      System.out.print(" Enter B : ");
      int b=scanner.nextInt();
      int temp;

      temp = a;
      a=b;
      b=temp;
      System.out.println("A ="+a);
      System.out.println("B ="+b);
    }

}