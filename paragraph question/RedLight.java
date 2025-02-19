import java.util.*;

public class RedLight{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,0,1,1,0};
        String s = "GRRGG";

        for(int i = 0 ; i < arr.length ;i++){
            char c = s.charAt(i);
            if (arr[i]==1 && c=='R'){
                System.out.println("PLAYER "+(i+1)+" : ELIMINATED");
            }
            else{
                System.out.println("PLAYER "+(i+1)+" : SAFE");
            }

        }
    }
}