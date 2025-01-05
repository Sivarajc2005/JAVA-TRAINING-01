import java.util.*;
public class calculator {
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    char c=scan.next().charAt(0);
    checkUpperOrLowerCase(c);
  }
  
  public static void checkUpperOrLowerCase(char c){
    // Scanner scan = new Scanner(System.in)
     if(c>='a' && c<='z') System.out.println("smaller case");
     else if(c>='A' && c<='Z') System.out.println("Capital Letters");
     else if(c>='0' && c<='9') System.out.println("Number");
  }
}