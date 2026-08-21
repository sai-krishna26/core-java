import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue {
  public static void main(String[] args) {
    
    //Queue<Integer> numbers=new PriorityQueue<>(Comparator.reverseOrder());

    // numbers.offer(44);//add()
    // numbers.offer(9);
    // numbers.offer(12);
    // numbers.offer(15);


    // System.out.println(numbers.peek());//element()

    // System.err.println(numbers);

    // numbers.poll();//remove()

    // System.err.println(numbers);

    
    // numbers.poll();

    // System.err.println(numbers);

    PriorityQueue<String> pq=new PriorityQueue<>();
    pq.offer("ram");
    pq.offer("shyam");
    pq.offer("bheem");
    pq.offer("om");

    System.err.println(pq);
    pq.poll();
    System.err.println(pq);
  }
}
