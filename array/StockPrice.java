import java.util.*;

public class StockPrice{
    public static int[] mergingStockPrices(int[]... exchanges){
        // combining the arrays in one list 
        List<Integer> mergingtheList = new ArrayList<>();
        for(int[] exchange : exchanges){  // outer loop - iterates through the array in exchanges
            for(int price : exchange){   // inner loop  - Individual price in the array and adding 
                mergingtheList.add(price);
            }
        }
        
        // sort the merging 
        
        Collections.sort(mergingtheList);
        
        // convert everything back into the normal 
        
        int[] finalresult = new int[mergingtheList.size()];
        for(int i=0; i<mergingtheList.size(); i++){
            finalresult[i]=mergingtheList.get(i);
        }
        
        return finalresult;
    }
    
    // main function 
    
    public static void main(String[] args){
        int[] exchange1 = {100,105,110};
        int[] exchange2 = {102,108};
        int[] exchange3 = {101,107,111};

        int[] mergingStockPrices = mergingStockPrices(exchange1,exchange2,exchange3);
        System.out.println(Arrays.toString(mergingStockPrices));
    }
}