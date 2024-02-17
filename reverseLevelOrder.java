
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
    }
}

//the actucal output ---> 1 2 3 4 5 6 7
//reversed output ---> 7 4 5 6 2 3 1 

public class reverseLevelOrder {

    public static void reverse(Node root){
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<>();
        q.add(root);

        if(root == null){
            return;
        }

        while(q.size() > 0){
            Node temp = q.remove();
            s.push(temp);

            if(temp.right != null){
                q.add(temp.right);
            }
            if(temp.left != null){
                q.add(temp.left);
            }
        }
        while(!s.isEmpty()){
            Node temp = s.pop();
            System.out.print(temp.data+" ");
        }
    }

   public static void main(String[] args) {
    Node root = new Node(1);
        Node left1 = new Node(2);
        Node right1 = new Node(3);
        Node left2 = new Node(4);
        Node right2 = new Node(5);
        Node left3 = new Node(6);
        Node right3 = new Node(7);

        root.left = left1;
        root.right = right1;
        left1.left = left2;
        right1.left = left3;
        left1.right = right2;
        right2.right = right3;

        reverse(root);
   } 
}
