
public class printMatrixRowwise {
   public static void main(String[] args) {
    int[][] arr = { { 10, 20, 30, 40, 50 },
    { 60, 70, 80, 90, 100 },
    { 110, 120, 130, 140, 150 },
    { 160, 170, 180, 190, 200 } };

    int rows = arr.length;
    int col = arr[0].length;

    for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
   }

}
