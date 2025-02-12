// package leedcode;
public class Rainwater {
    public static void main(String[] args){
        String[] str = {"aba","baa","bbbc"};
        String pre = "ab";
        prefixCount(str,pre);

    }

    public static void prefixCount(String[] words, String pref) {
        int count= 0;
        for(int i = 0 ; i < words.length ; i++){
            if(isPrefix(pref,words[i])){
                count++;
            }
        }
        System.out.println( count);
    }
    public static boolean isPrefix(String s1 , String s2){
        int lens1 = s1.length();
        int lens2 =s2.length();
        if(lens1 > lens2){
            return false;
        }
        int count=0;
        for(int i = 0 ; i < lens1 ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    } 
}