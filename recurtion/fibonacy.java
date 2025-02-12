public class fibonacy {
    public static void main(String[] arg){
        System.out.println(fib(10));
    }
    static int fib(int n){
        if(n<=1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
   
}
