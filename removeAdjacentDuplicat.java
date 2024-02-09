import java.util.Stack;

public class removeAdjacentDuplicat {
    public static void main(String[] args) {
        String st = "adebbecaacded";
        String result = removeAdjacent(st);
        System.out.println(result);
    }

    public static String removeAdjacent(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(st.size() == 0){
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }

        char[] arr = new char[st.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i] = st.pop();
        }

        return new String(arr);
    }

}
