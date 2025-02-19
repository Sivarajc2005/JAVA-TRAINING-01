import java.util.*;

class Alicesequence{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 10;
        int j=2;
        int num = 0;
        while(num!=n){
            boolean check = false;
            for(int i = 2 ; i < j ; i++ ){
                if(j%i==0){
                    check=true;
                    break;
                }
            }
            if(!check) {
                num++;
                System.out.println("working : "+ num +" j : "+j);
            }
            j++;
        }

        System.out.println((j-1)*(j-1));
    }
}