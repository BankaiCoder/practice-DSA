public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {9,6,3,2,5,1};
        sort(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insert(int[] arr, int i){
        int temp = arr[i];
        int j;
        for(j = i-1;j>=0;j--){
            if(temp < arr[j]){
                arr[i] = arr[j];
                i--;
            }else{
                break;
            }
        }
        arr[i] = temp;
    }
    public static void sort(int[] arr, int n){
        for(int i=1;i<n;i++){
            insert(arr, i);
        }
    }
}
