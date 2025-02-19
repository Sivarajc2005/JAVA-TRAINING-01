public class findGCD{
    public static void main(String[] arg){
        System.out.println(gcd(8,12));
    }
    static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}