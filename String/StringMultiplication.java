import java.util.*;
public class StringMultiplication {
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        // System.out.println(Integer.parseInt(s1)+1);
        // System.out.println(Integer.parseInt(s2)+2);
        sb.append(String.valueOf(Integer.parseInt(s1)*Integer.parseInt(s2)));
        System.out.println(sb);
    }
}
