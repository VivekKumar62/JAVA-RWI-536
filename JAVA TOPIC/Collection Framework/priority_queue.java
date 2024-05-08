import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority_queue {
    public static void main(String[] args) {

        // minheap,maxheap implement , i want implement queue but i want give  priority


        Queue<String> pq=new PriorityQueue<>();
        pq.offer("TCS");
        pq.offer("IBM");
        pq.offer("RAILWORLD");
        System.out.println(pq); // implement min under the hood , heap data structure
                                // sabse chhota  element top pe hota hai
        pq.poll();
        System.out.println(pq); // remove small asq element

        System.out.println(pq.peek()); // which element will exist
//[IBM, TCS, RAILWORLD]
//[RAILWORLD, TCS]
//RAILWORLD


        //for INT
//         PriorityQueue<Integer>  pq=new PriorityQueue<>();
//         pq.offer(50);
//        pq.offer(10);
//        pq.offer(26);
//        pq.offer(40);
//
//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq);
//        System.out.println(pq.peek());
////[10, 40, 26, 50]
////[26, 40, 50]
////26


//        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); //sabse phla sabse bda hota hai
//        pq.offer(50);
//        pq.offer(10);
//        pq.offer(26);
//        pq.offer(40);
//        System.out.println(pq);
//        pq.poll();
//        System.out.println(pq);
//        System.out.println(pq.peek());;
////[50, 40, 26, 10]
////[40, 10, 26]
////40





    }
}
