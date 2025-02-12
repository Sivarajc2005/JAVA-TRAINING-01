import java.util.Scanner;

public class mergeTwoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0 ; 
        int j = 0;
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        String s ="";
        while(i<s1.length() && j<s2.length()){
            s+=s1.charAt(i);
            s+=s2.charAt(j);
            i++;
            j++;
        }
        while(i<s1.length()){

            s+=s1.charAt(i);
            i++;
        }
        while(j<s2.length()){
            s+=s2.charAt(j);
            j++;
        }
        System.out.println(s);

    }
}
