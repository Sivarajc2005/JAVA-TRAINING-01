public class reverse{
    public static void main(String[] args){
        String str = "Sivaraj";
        // System.out.println(str.substring(0,1));
        System.out.println(rev(str));


    }

    static String rev(String str){
        if(str.isEmpty()){
            return str;
        }
        return rev(str.substring(1))+str.charAt(0);
    }
}