public class butter {
    public static void main(String[] args) {
        Long start = System.nanoTime();
        int n =5;
        for(int i=0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<(2*(n-i-1));k++){
                System.out.print("  "); 
            }
            for(int l =0;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j =0;j<=i;j++){
                System.out.print("* ");
            }
            for(int k=0;k<(2*(n-i-1));k++){
                System.out.print("  "); 
            }
            for(int l =0;l<=i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        Long end = System.nanoTime();
        Long diff = (end - start)/1_000_000;
        System.out.println(diff + " ms");
    }
}
