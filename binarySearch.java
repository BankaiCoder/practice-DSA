public class binarySearch {

    public static int binarySearch(int[] arr,int size,int element){
        int low = 0;
        int high = size-1;
        
        while(low <= high){
            int mid = (low+high)/2;
            

            if(arr[mid] == element){
                return mid;
            }
            if(arr[mid] < element){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,14,23,34,56,96};
        System.out.println(binarySearch(arr, arr.length, 100));

    }
}
