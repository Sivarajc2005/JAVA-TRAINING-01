
import java.util.Arrays;

public class elementInArray {
    public static void main(String[] args) {
        int[] arr = {5,6,4,3,2};
        ele(arr);
    }

    static void ele(int[] arr){
        System.out.println(arr[0]);
        if(arr.length==1){
            return;
        }
        
        ele(Arrays.copyOfRange(arr,1,arr.length));

    }
}
