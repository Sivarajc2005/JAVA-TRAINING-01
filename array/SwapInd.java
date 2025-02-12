import java.util.Arrays;
import java.util.Scanner;

public class SwapInd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i]=scan.nextInt();
        }
        int first = scan.nextInt();
        int second = scan.nextInt();
        if(first > n || second > n){
            System.out.println("Invalid INput");
            return;
        }
        else{
            int temp  = arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
