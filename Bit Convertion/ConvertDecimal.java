public class ConvertDecimal{
    public static void main(String[] str){
    //   convertBinary();
    //   convertDec();
    // caseConverstion('A');
    powerOfTwo(4);
    }

    static void convertBinary(){
        int n = 16;
        System.out.println(16<<1);
    }

    static String convertDec(int n){
        // int n =32;
        StringBuilder s = new StringBuilder();
        while(n>0){
         if(n%2==0){
             s.append("0");
 
         }
         else{
             s.append("1");
         }
         n=n/2;
        }
     //    System.out.println(s.reverse());
    //  int intsize = Integer.SIZE;
    //  int rep = intsize-s.length()-1;
    //  if(n<0){
    //      System.out.println("0".repeat(rep)+""+s.reverse());
    //  }
    //  else{
         System.out.println(s.reverse());
         return (s.reverse().toString());
    //  }
    }

    static void caseConverstion(char c){
        char ch = (char) (c ^ 32);
        System.out.println(ch);
    }

    static void powerOfTwo(int n){
        // String s =convertDec(8);
        // String s2 = convertDec(n-1);

        if((n&(n - 1)) == 0){
            System.out.println("Power of two");
        }
        else{
            System.out.println("No power of two");
        }
        

    }
}