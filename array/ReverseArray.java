
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseArray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // List<Integer> odd = new ArrayList<Integer>;
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();

        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i]%2 == 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }

        Collections.reverse(even);
        Collections.reverse(odd);

        while(!odd.isEmpty() && !even.isEmpty()){
            System.out.print(even.get(0)+" "+odd.get(0)+" ");
            even.remove(0);
            odd.remove(0);
            Collections.reverse(even);
            Collections.reverse(odd);
        }
        
    }
}

