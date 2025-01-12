import java.util.*;
public class arra{
    public static void main(String[] args) {
        // minMove("110");
        // String s =multiply("0","0");
        // System.out.println(s);

    }
    
    public static void minMove(String x){
        int n = x.length();
        int[] min = new int[n];
        // int count = 0;
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            for(int j = 0 ; j < n ; j++){
                if(x.charAt(j)=='1' && i!=j){
                    count = count + Math.abs(i-j);
                }
            }
            min[i] = count;
        }
        System.out.println(Arrays.toString(min));
    }


    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0") ){
            return "0";
        }
        int lenn1 = num1.length();
        int lenn2 = num2.length();
        
        int arr[] = new int[lenn1+lenn2];
        int lenarr = arr.length;
         
        for(int i = lenn1-1 ; i >= 0 ; i--){
            int lastval=0;
           int oth = 0 ;
            for(int j = lenn2-1 ; j >= 0 ; j--){
                int rem = 0 ;
                int mul = ((num1.charAt(i)-'0')*(num2.charAt(j)-'0'));
                if(mul==0 && (num1=="0" || num2=="0")){
                    return "0";
                }
                rem = (mul+oth) % 10;
                System.out.print(rem);
                arr[i+j+1]+=rem;
                
                oth = (mul+oth)/10;
                lastval = i+j+1;
            }
            arr[lastval-1]=oth;
            System.out.println("");
            
            System.out.println(Arrays.toString(arr));
        }

        for(int i = lenarr-1 ; i > 0;i--){
            // System.out.println("i am ");
            // if(arr[i] > 9){
                int temp = arr[i]%10;
                int fdig = arr[i]/10;
                arr[i]=temp;
                arr[i-1]+=fdig;
                System.out.println("i am "+fdig+" "+temp);
                System.out.println(Arrays.toString(arr));
            // }
        }

        boolean check = true;

        StringBuilder sb = new StringBuilder();
        for (int i : arr) { 
            if(i!=0 && check){
                sb.append(i);
                check=false;
            }
            else if(!check){
                sb.append(i);
            }
        } 
        String stringArray = sb.toString();
        // if(stringArray!=""){
            return stringArray;
        // }else{
        //     return "0";
        // }
        
    }
    
}