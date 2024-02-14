import java.util.HashMap;

public class firstNonRepeat {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,1,2,5};
        int[] arr = {5,4,4,3,6,7,5,6};
        System.out.println("Element: "+noRepeat(arr));
    }

    public static int noRepeat(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // count the frequency
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]) == true) {
                int temp = map.get(arr[i]);
                map.put(arr[i], temp + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Iterate the array bcs if you iterate the map the order will be random and we
        // dont get the first non repeating
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
