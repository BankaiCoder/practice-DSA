/*Wave wise like
10 20 30 40 50
60 70 80 90 100
110 120 130 140 150
160 170 180 190 200

output-> 10 20 30 40 50
         100 90 80 70 60
         110 120 130 140 150
         200 190 180 170 160

-> the pointer is moving Left->Right when the indeces or row index is even if its odd then its moving Right->Left
*/

public class printMatrixWaveWIse {
  public static void main(String[] args) {
    int[][] arr = { { 10, 20, 30, 40, 50 },
    { 60, 70, 80, 90, 100 },
    { 110, 120, 130, 140, 150 },
    { 160, 170, 180, 190, 200 } };

int rows = arr.length;
int col = arr[0].length;

    for(int i=0; i<rows; i++){
        //Check if the index is even or odd
        if(i%2 == 0){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        else{
            for(int j=col-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
  }  
}
