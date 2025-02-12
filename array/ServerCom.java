import java.util.Arrays;

class Server{
    public static void main(String[] args) {
        // int[][] arr = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        int[][] arr ={{1,0},{1,1}};
        com(arr);
    }
    public static void com(int[][] arr){
        int c = arr[0].length;
        int r =arr.length;
        int[] row = new int[r];
        int[] col = new int[c];
        int server = 0;

        for(int i = 0 ; i < r ;i++){
            for(int j = 0 ; j < c ; j++){
                if(arr[i][j]==1){
                    col[i]+=1;
                    row[j]+=1;
                    server++;
                }
            }
        }
        for(int i = 0 ; i < r ;i++){
            for(int j = 0 ; j < c ; j++){
                if(arr[i][j]==1 && (col[i]==1 && row[j]==1)){
                    server--;
                }
            }
        }
        // System.out.println(Arrays.toString(col)+" \n"+Arrays.toString(row));
        System.out.println(server);
    }
}