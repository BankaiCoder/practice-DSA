import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
    }
}

public class levelOrderTraversal {
    public static void travel(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        if (root == null) {
            return;
        }
        //while (q.size() > 0) {  //-->this while loop is for if you want to print the elemnts is next line
           // int n = q.size();
            while (q.size() > 0) {  //(n > 0) for the line changing cod eif u want
                Node temp = q.remove();
                System.out.print(temp.data + "--");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
               // n--;//this is accociate witha the upper while loop
            }
          //  System.out.println();
        //}
        
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

        travel(root);

    }
}
