package Nov.exe_04112024_Collection_Framework_Set;

import java.util.PriorityQueue;

public class Lab157_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("2");
        pq.offer("1");//add
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        pq.peek();// only see
        pq.poll();//remove
        System.out.println(pq);
    }
}
//PriorityQueue
//Added interface in Java 5.
//FIFO
//PriorityQueue is one of the commonly used subclasses of Queue interface.
//PriorityQueue doesn’t allow null values.