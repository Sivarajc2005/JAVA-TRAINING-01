public class Pattern2 {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // power(10);
        // pattern03(3);
        charTriangle(4);
    }
    public static void pattern1(int N){
        int copy = 1 ;
        for (int row = 1 ; row <= N*2-1 ; row++){
            int num = N;
            for(int col=1 ; col <= N*2-1 ; col++){
                if(copy > col){
                    System.out.print(num-- +" ");
                }
                else if(copy+col > N* 2)
                   System.out.print(++num + " ");
                else 
                   System.out.print(num+ " ");
            }
            if(row < N) copy++;
            else copy--;
            System.out.println();
        }
        
    }

    public static void pattern2(int n){
        for (int i=0 ; i < n ; i++){
            for(int j = 0 ; j <=i ; j++){
                
            }
            System.out.println();
        }
    }

    public static void power(int n){
        int pow = 1;
        for(int i=1 ; i < n ; i++){
            System.out.print(Math.pow(2,i)-1 +" ");
        }
    }

    public static void pattern03(int n){
        int row = n*n;
        int count = 0;
        for(int i= 0 ; i<row ;i++){
            for(int j=0;j<n;j++){
                if(j<=count){
                    System.out.print("*");
                    count++;
                }
            }
            System.out.println("");
        }
    }

    public static void charTriangle(int n){
        int ch = 97;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j <= i ; j++){
               char c = (char) ch;
               System.out.print(c);
            }
            ch++;
            System.out.println();
        }
    }
}

