public class Main{
    public static void main(String[] args){
        System.out.println();
        // sum(1);
        // countdown(5);
        // System.out.println(fac(5));
        // head(1);
        // tail(1);
        System.out.println(pow(2,5));
    }

    static void reverse(){
        int n  = 12;
        int res = 0;
        for(int i = 0 ; i < 31 ;i++){
            res = (res<<1)|(n&1);
            n=n>>1;
        }
        System.out.println(res);
    }

    static void sum(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        sum(n+1);
    }

    static void countdown (int n){
        if (n<0){
            System.out.println("blast off");
            return;
        }
        System.out.println(n);
        countdown(n-1);
    }

    static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    
    static void head(int n){
        if(n>=3){
            return;
        }
        head(n+1);
        System.out.println(n);
        
        
    }

    static void tail(int n){
        if(n>=3){
            return;
        }
        System.out.println(n);
        head(n+1);
    }

    static int pow(int base,int exp){
        if(exp==0) return 1;
        return base*pow(base,exp-1);
    }
}