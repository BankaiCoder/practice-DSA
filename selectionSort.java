public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {6,4,5,3,1,2};
        select(arr, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void select(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            int min_ind = i;
            //find min element
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }
            // swap(arr[min_ind],arr[i]);
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }
    // public static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
}
