import java.util.LinkedList;
import java.util.Queue;

public class Queue_collection {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10); //insert FIFO
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);

//        queue.poll(); remove of fifo
//        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
