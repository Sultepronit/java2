import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		// throws NoSuchElementException
		//System.out.println(q1.element());
		
		q1.add(10);
		q1.add(20);
		q1.add(30);
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Queue full!");
		}
		System.out.println(q1);
		
		Integer value = q1.remove(); //removing element from head -- FIFO 
		System.out.println(value);
		System.out.println(q1);
		
		System.out.println(q1.element()); //showing element from head
		
		//////////////////////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);
		
		// safe adding method -- no exception
		q2.offer(10);
		q2.offer(20);
		q2.offer(30);
		q2.offer(40);
		System.out.println(q2);
		
		System.out.println(q2.offer(22)); //returns false
		
		System.out.println("Peek: " + q2.peek());// showing element from head
		
		//safe removing 
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll()); // returns null
		
		System.out.println("Peek: " + q2.peek()); //returns null
	}

}
