import java.util.LinkedList;
import java.util.Queue;

public class kthNumberinQueue {
    public static void main(String[] args) {
        int k = 7;
        System.out.println("The number: "+kthNum(k));
    }

    public static String kthNum(int k){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        q.add("2");

        String ans = " ";
        for(int i=1;i<=k;i++){
            String temp = q.remove();
            ans = temp;
            q.add(temp+"1");
            q.add(temp+"2");
        }
        return ans;
    }
}
