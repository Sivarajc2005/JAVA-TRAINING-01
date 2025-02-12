
import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] arr = {1,2,3,4,5};
        int k = 1;
        int n = arr.length;
        arr=rev(arr,0,n-1);
        int mid = n-1-k;
        arr=rev(arr,0,mid-1);
        arr=rev(arr,mid,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] rev(int[] arr , int start, int end){
        while(start < end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return arr;
    }
}
