public class SumOfFact {
    public static void main(String[] args) {
        System.out.println(fact(120));
    }
    static int fact(int n){
        if(n==0){
            return 0;
        }
        int dig=n%10;
        int sum=1;
        for(int i =1 ; i <= dig ;i++){
            sum *= i;
        }
        return sum + fact(n/10);
    }

    
}
