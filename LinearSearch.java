public class LinearSearch {

    public static int linearSearch(int[] arr, int size,int element){

        for(int i=0;i<size;i++){
            if(arr[i] == element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,8,9,3};
        System.out.println(linearSearch(arr, arr.length, 8));
    }
}
