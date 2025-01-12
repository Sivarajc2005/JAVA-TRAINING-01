import java.util.*;
class PizzaMaker{

    String size;
    String cruse;
    String toppings; 
    
    public PizzaMaker(){
        Scanner scan = new Scanner(System.in);
        size = scan.nextLine();
        cruse = scan.nextLine();
        toppings = scan.nextLine();
        System.out.println(size + " " + cruse + " " + toppings);
    }

    public PizzaMaker(String s ,String c , String t){
        this.size = s;
        this.cruse = c;
        this.toppings = t;
        System.out.println(size + " " + cruse + " " + toppings);
    }

}

public class customer{
    public static void main(String[] args) {
        // new PizzaMaker();
        new PizzaMaker("large", "more" , "more");
    }
    
}