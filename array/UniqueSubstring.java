
import java.util.ArrayList;

public class UniqueSubstring {
   public static void main(String[] args) {
    //    Scanner scan = new Scanner(System.in);
       int[] arr={2,3,4,5,3,7,8};
       ArrayList<Integer> ans=longuniqueSubarray(arr);
       ans.forEach(item -> System.out.println(item));

   }
   static ArrayList<Integer> longuniqueSubarray(int[] arr){
    // System.out.println( "entered");
    ArrayList<Integer> arr1 = new ArrayList<>();
    int n = arr.length;

    for(int i = 0 ; i < n ;i++){
        // System.out.println( "entered inside 1st loop");
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int j = i ; j <n ;j++){

            // System.out.println( "entered inside 2st loop");
            // System.out.println(arr1 + "entered");

            if(arr2.contains(arr[j])){
                if(arr1.size() < arr2.size()){
                    arr1.clear();
                    arr1.addAll(arr2);
                    // System.out.println(arr1 + " i am hear ----------");
                }
                arr2.clear();
                
            }
            else{
                arr2.add(arr[j]);
                // System.out.println(arr2 + " i adding");
            }
        }
    }
    return arr1;
   }
}
