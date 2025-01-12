package String;

public class NonrepetingChar {
    public static void main(String[] args) {
        long st = System.nanoTime();
        String str="hellow";
        
        for(int i = 0 ; i < str.length() ;i++){
            int sind =str.indexOf(str.charAt(i));
            int eind =str.lastIndexOf(str.charAt(i));
            if(sind == eind){
                System.out.println(str.charAt(i));
                // break;
            }
        }
        long en = System.nanoTime();

        System.out.println((en-st)/1000000 + " ms");


    }
}
