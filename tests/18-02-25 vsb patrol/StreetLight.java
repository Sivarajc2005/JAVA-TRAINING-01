import java.util.*;
public class StreetLight{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0 ; i < 8; i++){
            arr[i]=scan.nextInt();
        }
        
        int ite = scan.nextInt();

        int cite = 1;

        while(ite >= cite){
            arr=streetcal(arr);
            cite++;
        }

        System.out.println(Arrays.toString(arr));
        scan.close();
    }

    static int[] streetcal(int[] arr){

        int[] arr1 = new int[8];
        
      
            for(int i = 0 ; i < 8 ;i++){
                if(i-1 == -1){
                    if(0 != arr[i+1]){
                        arr1[i]=1;
                    }
                    else{
                        arr1[i]=0;
                    }
                }
                else if(i+1 == 8){
                    if(0!= arr[i-1]){
                        arr1[i]=1;
                    }
                    else{
                        arr1[i]=0;
                    }
                }

                else if(arr[i-1] != arr[i+1]){
                    arr1[i]=1;
                }

                else{
                    arr1[i]=0;
                }
            }
            System.out.println(Arrays.toString(arr1 )+ " i am hear");
            
        return arr1;
    }
}