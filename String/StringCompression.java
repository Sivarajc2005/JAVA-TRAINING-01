import java.util.*;
public class StringCompression{
    public static void main(String[] agr){
        Scanner scan = new Scanner(System.in); 
        String s = scan.nextLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);

        if(s.length()==1) System.out.println(s);
        int count = 1 ;
        for(int i = 0 ; i < s.length()-1 ; i++){
            char c1 = c[i];
            char c2 = c[i+1];
            // if(s.charAt(i)==s.charAt(i+1)){
            if(c1==c2){
                count++;
            }
            // else if(s.charAt(i)!=s.charAt(i+1)){
            else if(c1!=c2){
                if(count==1){
                    // System.out.print(s.charAt(i));
                    System.out.println(c1);
                    count=1;
                }
                else{
                    // System.out.print(s.charAt(i)+""+count);
                    System.out.println(c1+""+count);
                    count=1;
                }
                
            }
        }
        if(count>1){
            // System.out.print(s.charAt(s.length()-1)+""+count);
            System.out.println(c[c.length-1]+""+count);
        }
        else{
            // System.out.print(s.charAt(s.length()-1));
            System.out.println(c[c.length-1]);
        }

    }
}