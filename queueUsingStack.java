import java.util.Stack;

public class queueUsingStack {

public Stack<Integer> stack1;//->for enqueue perpose(Add)
public Stack<Integer> stack2;//->for deque purpose (remove)

public queueUsingStack(){
    stack1 = new Stack<>();
    stack2 = new Stack<>();
}

public void enqueue(int val){
stack1.push(val);
}

public int deque(){
    if(stack2.isEmpty()){
        if(stack1.isEmpty()){
        return -1;}

        //Transfer all stack1 elements to stack2
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    return stack2.pop();
   
}

public boolean isEmpty(){
    return stack1.isEmpty() && stack2.isEmpty();
}

public int size(){
    return stack1.size() + stack2.size();
}

    public static void main(String[] args) {
     queueUsingStack q = new queueUsingStack();
     q.enqueue(1);
     q.enqueue(2);
     q.enqueue(3);
     
     System.out.println("Remove: "+q.deque());
     System.out.println("Remove: "+q.deque());

     q.enqueue(4);
     System.out.println(q.size());
     System.out.println(q.isEmpty());
    }
}
