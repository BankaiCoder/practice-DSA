import java.util.*;

public class minStack {

    public static Stack<Integer> stack;
    public static Stack<Integer> minStac;

    public minStack() {
        stack = new Stack<>();
        minStac = new Stack<>();
    }

    public static void push(int x) {
        stack.push(x);
        if (minStac.isEmpty() || x <= minStac.peek()) {
            minStac.push(x);
        }
    }

    public static void pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            if (poppedElement == minStac.peek())
                minStac.pop();
        }
    }

    public static int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack Is Empty");
    }
    public static int getMin(){
        if(!minStac.isEmpty()){
            return minStac.peek();
        }
        throw new IllegalStateException("Stack Is Empty");
    }

    public static void main(String[] args) {
        minStack minS = new minStack();
        minS.push(3);
        minS.push(5);
        System.out.println("Min: "+minStack.getMin());
        minS.push(2);
        minS.push(1);
        System.out.println("Min: "+minStack.getMin());
        System.out.println("Top: "+minStack.top());
        minS.pop();
        System.out.println("Min: "+minStack.getMin());
    }

}
