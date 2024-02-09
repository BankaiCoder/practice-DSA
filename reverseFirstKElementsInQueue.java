import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKElementsInQueue {

    public static Queue<Integer> reverse(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        //remove k elements from the queue and add them in the stack

        for(int i=1;i<=k;i++){
            st.push(q.remove());
        }
        //output->3 10 2 12 in stack form->12 2 10 3 
        
        //remove and add k elements from stack to queue
        for(int i=1;i<=k;i++){
            int temp = st.pop();
            q.add(temp);
        }

        //remove the first n-k elements from the front and add them into the queue
        for(int i=1;i<=n-k;i++){
            int temp = q.remove();
            q.add(temp);
        }

        return q;
    }




    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(10);
        q.add(2);
        q.add(12);
        q.add(19);
        q.add(6);
        q.add(8);
        q.add(10);
        q.add(14);

        int k = 4;

        reverse(q, k);

        while(!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
        System.out.println();
    }
}
