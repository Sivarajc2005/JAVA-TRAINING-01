public class data{

    public static void main(String[] args){
        // FindXOR();
        // add();
        // comp();
        // System.out.println(findMissing());
        // oddFre();
        
    }
    static void RightMostBit(){
        int n = 5;
        System.out.println(n&-n);
    }

    static void FindXOR(){
        int n = 5;
        int m = n%4 ;
        switch(m){
            case 0->System.out.println(n);
            case 1->System.out.println(1);
            case 2->System.out.println(n+1);
            default -> System.out.println(0);
        }
        // if(m == 0){
        //     System.out.println(n);
        // }
        // else if(m==1){
        //     System.out.println(1);
        // }
        // else if(m==2){
        //     System.out.println(n+1);
        // }
        // else if (m==n) {
        //     System.out.println(0);
        // }
    }

    static void add(){
        int n=13;
        int m = 5;


        
        while(m!=0){
            int carry = (n&m)<<1;
            n=m^n;  
            m=carry;
        }
        System.out.println(n);
    }

    static void comp(){
        int a = 4;
        int b = 5;
        if((a^b)==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    static int findMissing(){
        int xor = 0;
        int max,min;
        int[] arr = {9,8,7,5};
        for(int i:arr){
            xor ^= i;
        }
        if(arr[0]>arr[arr.length-1]){
            max=arr[0];
            min=arr[arr.length-1];
        }
        else{
            min=arr[0];
            max=arr[arr.length-1];
        }
        for(int i=min;i<=max;i++){
            xor = xor ^ i;
        }
        return xor;
    }

    static void oddFre(){
        int[] arr = {4,3,6,2,6,4,2,3,4,3,3};
        int sol = 0;
        for(int i : arr){
            sol^=i;
        }
        System.out.println(sol);
    }

    static void minMax(){
        
    }
}