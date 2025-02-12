import java.util.*;
public class Kthunique {
    public static void main(String[] agr){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // char[] c = new char[n];
        String[] str = new String[n];
        for(int i = 0 ; i<n ; i++){
            // c[i]=scan.next().charAt(0);
            str[i]=scan.next();
        }
        int ind = scan.nextInt();
        HashMap<String,Integer> map = new LinkedHashMap<>();
        for(String ch : str){
            if(map.containsKey(ch)){
                // System.out.println(map.get(ch)+" adding " + ch);
                map.put(ch,map.get(ch)+1);
               
            }
            else{
                map.put(ch,1);
            }
        }
        // System.out.println(map);
        // char sol;

        int i = 1;
        for(String ch : map.keySet()){
            if(i==ind && map.get(ch)==1){
                System.out.println(ch);
                break;
            }
            if(map.get(ch)==1){ 
                // System.out.println(ch);
                i++;
            }
            
        }
        
    }
}
