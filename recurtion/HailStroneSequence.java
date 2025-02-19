public class HailStroneSequence {
   public static void main(String[] args) {
    int n = 22;
    System.out.println("Sequence : "+sequence(n));
   }

   static int sequence(int n){
    System.out.println(n+" ");
    if(n==1){
        return 1;
    }
    if(n%2==0){
        
        n=n/2;
    }
    else{
        n=(3*n)+1;
    }
    return 1 + sequence(n);
    
   }
}
