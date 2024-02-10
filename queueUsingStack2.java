import java.util.Stack;

public class queueUsingStack2 {
    public static void main(String[] args) {
        queueUsingStack2 q = new queueUsingStack2();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Remove: "+q.remove());
        System.out.println("Peek: "+q.peek());
        System.out.println("Empty or Not: "+q.isEmpty());
        System.out.println("Size: "+q.Size());


    }

public Stack<Integer> stack1;
public Stack<Integer> stack2;

public queueUsingStack2(){
    stack1 = new Stack<>();
    stack2 = new Stack<>();
}

public void add(int x){
    while(!stack2.isEmpty()){
        stack1.push(stack2.pop());
    }
    stack1.push(x);
}
public int remove(){
    if(stack2.isEmpty()){
        if(stack1.isEmpty()){
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.pop();
}
public int peek(){
    if(stack2.isEmpty()){
        if(stack1.isEmpty()){
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.peek();
}
public boolean isEmpty(){
    return stack1.isEmpty() && stack2.isEmpty();
}
public int Size(){
    return stack1.size() + stack2.size();
}

}
