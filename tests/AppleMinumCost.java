import java.util.Scanner;

public class AppleMinumCost{
    public static void main(String[] arg){
        Scanner scan = new Scanner (System.in);
         int n = scan.nextInt();

         int q1 = scan.nextInt();
         int p1 = scan.nextInt();

         int q2 = scan.nextInt();
         int p2 = scan.nextInt();


         int mincost  = Integer.MAX_VALUE;
         for(int i = 0 ; i*q1 <= n ; i++){
            int rem = n - (q1*i);

            if(rem%q2==0){
                int cost =((rem/q2)*p2) + (p1*i);

                mincost=Math.min(mincost,cost);
            }
         }

         System.out.println(mincost);
    }
}