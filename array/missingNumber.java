import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args){
        int[] x={5,4,8,1,1,5,2,2};
        // missingNum(x);
        // moveZeros(x);
        // findErrorNums(x);
        // productOfRemain(x);
        // uniqueElement(x);
        frequency(x);



    }
    public static void missingNum(int[] arr){
        int n = arr.length+1;
        int cal =(n*(n+1))/2;
        int sum = 0; 
        for ( int  i= 0 ; i < n-1 ; i++){
            sum += arr[i];
        }
        System.out.println(cal-sum);
    }

    public static void moveZeros(int[] arr){
        int temp;
        int ind=0;
        for(int i = 0 ; i  < arr.length ; i++){
            if(arr[i]!=0){
                temp = arr[i];
                arr[i] = arr[ind];
                arr[ind]=temp;
                ind++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int rnum = 0 ;
        for(int i = 0 ; i < n-1 ; i++){
            if(nums[i]==nums[i+1]){
                rnum=nums[i];
                break;
            }
        }
        int sum = (n*(n+1))/2;
        int tsum = 0 ; 
        for(int i = 0 ; i < n ; i++){
            tsum+=nums[i];
        }
        int fnum=sum-(tsum-rnum);
        int[] res = new int[2];
        res[0]=rnum;
        res[1]=fnum;

        System.out.println(Arrays.toString( res));
    }

    public static void productOfRemain(int[] arr){
        //not optimal 
        int n =arr.length;
        int[] newarr = new int[n];
        for(int i = 0 ; i <n ; i++ ){
            int pro = 1 ;
            for(int j = 0 ; j < n ; j++){
                if(i!=j) pro*=arr[j];
            }
            newarr[i]=pro;
        }
        System.out.println(Arrays.toString(newarr));
    }

    public static void uniqueElement(int[] arr){
        int n =arr.length;
        int uniq = 0;
        int[] arrnew = new int[n];
        int ind = 0;
        
        for(int i = 0 ; i < n ; i++ ){
            boolean isUnique =true;
            for(int j = 0 ; j < n ; j++){
                if(i!=j && arr[i]==arr[j]){
                    isUnique=false;
                }
            }
            if(isUnique){
                arrnew[ind] = arr[i];
                ind++;
                uniq++;
            }
        }
        System.out.println(uniq);
        System.out.println(Arrays.toString(arrnew));
    }

    public static void triplets(int[] arr,int a){
        
    }

    public static void frequency(int[] arr){
        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            int count = 1;
            if(arr[i] == -1) continue;
            for(int j = i+1 ; j < len ; j++){
                
                if( arr[i] == arr[j] && arr[j] != -1 ){
                    count++;
                    arr[j]=-1;
                } 
            }
            if(arr[i] != -1) System.out.println(arr[i]+" " +count);
        }
        // System.out.println(Arrays.toString(arr));
    }
}
