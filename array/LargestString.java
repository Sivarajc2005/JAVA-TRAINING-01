public class LargestString{
    public static void main(String[] args) {
        // System.out.println(isvowel('a'));
        // System.out.println(caseConvertion("Hellow123"));
        // System.out.println(largestWord("i am sivaraj the program"));
        System.out.println(capitalcase("SIVAraj"));
    }

    static boolean isvowel(char c){
        c = (c>='A' && c<='Z') ? (char) (c+32) : c;
        return c=='a' || c=='e'|| c=='i'||c=='o'||c=='u';
    }

    static String caseConvertion(String s){
        String str = "";
        int len = s.length();
        for(int i = 0 ; i < len ; i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                str+=(char) (c+32);
            }
            else if(c>='a' && c<='z'){
                str+=(char) (c-32);
            }
            else{
                str+=c;
            }
        }
        return str;
    }

    static String largestWord(String s){
        String str ="";
        String[] arr=s.split(" "); 
        int max = 0;
        int ind=-1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].length() > max){
                max=arr[i].length();
                ind=i;
            }
        }
        return arr[ind];
    }

    static String capitalcase(String s){
        String res = "";
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) >='A'&& s.charAt(i)<='Z'){
                res+=s.charAt(i);
            }
            else{
                break;
            }
        }
        return res;

    }

}