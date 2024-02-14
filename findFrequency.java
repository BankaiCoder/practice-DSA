import java.util.HashMap;

public class findFrequency {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6 };
        int[] query = { 2, 8, 3, 5 };

        freq(arr, query);

        
    }

    public static void freq(int[] arr, int query[]) {
        int n = arr.length;
        int m = query.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]) == true) {
                int temp = map.get(arr[i]);
                map.put(arr[i], temp + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < m; i++) {
            int val = query[i];
            if (map.containsKey(val) == true) {
                System.out.println(map.get(val));
            } else {
                System.out.println(0);
            }
        }
    }
}
