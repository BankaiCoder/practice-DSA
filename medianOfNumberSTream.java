import java.util.Collections;
import java.util.PriorityQueue;

public class medianOfNumberSTream {
    public static void main(String[] args) {
        medianOfNumberSTream medianStream = new medianOfNumberSTream();

        // Add numbers to the stream
        medianStream.add(5);
        medianStream.add(2);
        medianStream.add(8);
        medianStream.add(4);

        // Find and print the median
        double median = medianStream.findMedian();
        System.out.println("Median: " + median);
    }

    public PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    public PriorityQueue<Integer> right = new PriorityQueue<>();

    public void add(int num){
        if(left.size() == right.size()){
            right.add(num);
            left.add(right.remove());
        }else{
            left.add(num);
            right.add(left.remove());
        }
    }

    public double findMedian(){
        if(left.size() == right.size()){
         double ans = (left.peek() + right.peek())/2.0;
         return ans;
        }else{
            return left.peek()*1.0;
        }

    }

}
