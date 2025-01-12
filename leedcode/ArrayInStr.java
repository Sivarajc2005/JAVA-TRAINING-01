import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayInStr {
   public static void main(String[] args) {
    
   }
    public static List<String> wordSubsets(String[] words1, String[] words2){
        List<String> words = new ArrayList<>();

        String s = charToStr(words2);
        int count =0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i)!='@') count++;
        }
        for(int i = 0 ; i < words1.length ;i++){
            if(charInString(words1[i],s,count)){
                words.add(words1[i]);
                // System.out.println(words1[i]);
            }
        }
        return words;
    }

    public static String charToStr(String[] s1){
        int len = s1.length;
        String s = "";
        for(int i = 0 ; i < len ; i++){
            s+="@"+s1[i];
        }
        return s;
    }
    public static boolean charInString(String s1 , String s2 ,int c){
        int lens1 = s1.length();
        int lens2 = s2.length();
        int count = 0;
        StringBuilder sb = new StringBuilder(s1);
        int lenssb = sb.length();
        for(int i = 0 ; i < lens2 ; i++){
            if(s2.charAt(i) == '@'){
                sb = new StringBuilder(s1);
                // lenssb = sb.length();
            }
           for(int j = 0 ; j < lenssb ; j++){
                if(  s2.charAt(i) == sb.charAt(j)){
                    // System.out.println(sb+" i am hear ");
                    sb.replace(j,j+1,"5");
                    count++;
                    // System.out.println(sb);
                    break;
                }
                // lenssb = sb.length();
           }
        }
        //System.out.println(c + " " + count);

        if(count  == c){
            return true;
        }
        return false;
    }
}

class newt {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> ans = new ArrayList<>();
        int[] countB = new int[26];
    
        for (final String b : B) {
          int[] temp = counter(b);
          for (int i = 0; i < 26; ++i)
            countB[i] = Math.max(countB[i], temp[i]);
        }
    
        for (final String a : A)
          if (isUniversal(counter(a), countB))
            ans.add(a);
    
        return ans;
      }
    
      private int[] counter(final String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
          ++count[c - 'a'];
        return count;
      }
    
      private boolean isUniversal(int[] countA, int[] countB) {
        for (int i = 0; i < 26; ++i)
          if (countA[i] < countB[i])
            return false;
        return true;
      }
}

class actual {
    public static void main(String[] args) {
        
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
    List<String> list = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
       
        for(String word : words2){   //taking words
            HashMap<Character,Integer> indmap = new HashMap<>();
            for(char c : word.toCharArray()){     //taking char from words and creating its own map
                if(indmap.containsKey(c)){
                    int ite = indmap.get(c);
                    indmap.put(c,ite+1);
                }
                else{
                    indmap.put(c,1);
                }
            }

            for( Character key : indmap.keySet()){   //updating to universal map
                if(map.containsKey(key)){
                    map.put(key,Math.max(map.get(key),indmap.get(key)));
                }
                else{
                    map.put(key,1);
                }
            }

            indmap.clear();
        }

        
        for(String str : words1){
            int count = 1;
            HashMap<Character,Integer> wordmap = new HashMap<>();
            for(char c : str.toCharArray() ){
                if(wordmap.containsKey(c)){
                    int ite = wordmap.get(c);
                    wordmap.put(c,ite+1);
                }
                else{
                    wordmap.put(c,1);
                }
            }

            // int count = 0;
            int siz = map.size();
            
            for (char key : map.keySet()) {
                if (wordmap.containsKey(key)) {
                    int val = map.getOrDefault(key, 0);
                    int val2 = wordmap.getOrDefault(key, 0);
                    if (val >= val2) {
                        count++;
                        list.add(str);
                    }
                }
                else break;
            }
            System.out.println(count + " "+ siz);
            if(count == siz){
                // list.add(str);
            }
            wordmap.clear();

        }

        return list;
    }
}
