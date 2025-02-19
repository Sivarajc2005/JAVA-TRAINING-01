import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HandShake {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();

         int[][] arr = new int[n-1][n-1];
         for(int i = 0 ; i < n-1 ;i++){
            for(int j = 0 ; j < n-1 ;j++){
                arr[i][j] = scan.nextInt();
            }
         }

         HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

         for(int i = 0 ; i < n-1 ; i++){
            
            for(int j = 0 ; j < n-1 ;j++){
                int ele = arr[i][j];
               if(j==0 && !map.containsKey(ele)){
                ArrayList<Integer> list = new ArrayList<>();
                map.put(ele,list);
               }

               if(j > 0){
                map.get(arr[i][0]).add(ele);
               }
            }
         }
         int totalsum = (n*(n-1))/2;
         int thand = 0;
         for(int key : map.keySet()){
            int sum = addele(map.get(key));
            sum+=key;

            int rem = totalsum - sum;
            if(map.containsKey(rem)){
                if(!map.get(rem).contains(key)){
                    thand++;
                }
            }
            else if(rem!=0){
                thand++;
            }
         }
         System.out.println(map+ " thand="+thand);
         
    }

    static int addele(ArrayList<Integer> list){
        int sum = 0;
        for(int i = 0 ; i < list.size() ;i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
