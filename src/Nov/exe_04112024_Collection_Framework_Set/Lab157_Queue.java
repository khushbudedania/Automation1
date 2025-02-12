package Nov.exe_04112024_Collection_Framework_Set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Lab157_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("2");
        pq.offer("1");//add
        pq.offer("3");
        pq.offer("4");
        System.out.println(pq);
        pq.peek();// only see
        pq.poll();//remove
        System.out.println(pq);

//        for(Object o: pq)
//        {
//            System.out.println(o);
//        }
//

        Iterator iterator = pq.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
//PriorityQueue
//Added interface in Java 5.
//FIFO
//PriorityQueue is one of the commonly used subclasses of Queue interface.
//PriorityQueue doesn’t allow null values.