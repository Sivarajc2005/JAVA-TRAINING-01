import java.util.Arrays;

public class Sorting{
    public static void main(String[] args){
        int[] arr = {1,2,4,5};
        bubbleSort(arr);

    }
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-2 ;i++){       
            boolean check =true;
            for(int j = 0 ; j < n-1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    check = false;
                }
            }
            if(check) break;
        }

        System.out.println(Arrays.toString(arr));
    }

    
}