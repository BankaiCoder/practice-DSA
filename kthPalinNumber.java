import java.util.LinkedList;
import java.util.Queue;

public class kthPalinNumber {
    public static void main(String[] args) {
        int k = 3;
        System.out.println(KthNumber(k));
    }

    public static String KthNumber(int k){
        Queue<String> q = new LinkedList<>();
        q.add("11");
        q.add("22");
        String ans = " ";

        for(int i=1;i<=k;i++){
            String temp = q.remove();
            ans = temp;
            String left = temp.substring(0,temp.length()/2);
            String right = temp.substring(temp.length()/2, temp.length());
            q.add(left+"11"+right);
            q.add(left+"22"+right);
        }
        return ans;
    }
}
