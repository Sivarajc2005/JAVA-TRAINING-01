public class Pattern{
    public static void main(String[] args) {
        // twoD();
        // rightAngleT();
        // triangle();
        // diamond();
    }
    public static void twoD(){
        for(int i = 0 ; i< 3 ; i++){
            for (int j = 0 ; j < 5 ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void rightAngleT(){
        for(int i =0 ; i <= 5 ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

  public static void triangle(){
    int n =5;
    for (int i = 1 ; i <= n ; i++){
        for(int j =n ; j > i ; j--){
            System.out.print(" ");
        }
        for(int k = 1 ; k <= (2*i - 1) ; k++){   //use " k<= 1 " to get the normal triangle
            System.out.print("*");
        }
        System.out.println(" ");
    }  
  }

  public static void diamond(){
    int n =5;
    for (int i = 1 ; i <= n ; i++){
        for(int j =n ; j > i ; j--){
            System.out.print(" ");
        }
        for(int k = 1 ; k <= (2*i - 1) ; k++){   //use " k<= 1 " to get the normal triangle
            System.out.print("*");
        }
        System.out.println(" ");
    }
    for (int i = n ; i >= 1 ; i--){
        for(int j =n ; j > i ; j--){
            System.out.print(" ");
        }
        for(int k = 1 ; k <= (2*i - 1) ; k++){   //use " k<= 1 " to get the normal triangle
            System.out.print("*");
        }
        System.out.println(" ");
    }
    
  }

}

 class Butterfly_pattern {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
      int n = 5;
    
      for(int i = 0 ; i < n-1 ; i++){
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        for(int j = 0 ; j < 2*(n-1-i) ; j++){
            System.out.print("  ");
        }
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
      } 

      for(int i = n-1 ; i >=0 ; i--){
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        for(int j = 0 ; j < 2*(n-1-i) ; j++){
            System.out.print("  ");
        }
        for(int j = 0 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println();
      } 
      long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; 
        System.out.println("Runtime: " + duration + " ms");
    }
}