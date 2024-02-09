import java.util.Stack;

public class validateParanthese {
    public static void main(String[] args) {
        String st = "{([])}";
        boolean result = validate(st);
        System.out.println(result);
    }
//T.C->O(N)
//S.C->O(N)
    public static boolean validate(String st){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<st.length();i++){
            if(s.size() == 0){
                s.push(st.charAt(i));
                continue;
            }

            if(st.charAt(i) == '(' || st.charAt(i) =='{' || st.charAt(i) == '['){
                s.push(st.charAt(i));
            }
            else{
                if(st.charAt(i) == ')'){
                    if(s.peek() == '('){
                        s.pop();
                       
                    }
                    else{
                        return false;
                    }
                }else if(st.charAt(i) == '}'){
                    if(s.peek() == '{'){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }else{
                    if(s.peek() == '['){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }

        }
        if(s.size() == 0) return true;
        else 
        return false;
    }

}
