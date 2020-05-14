package treis;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	Queue queue;

	public QueueTest() {

		queue = new LinkedList<>();

	}

	public void addToQuese(int a) {
		queue.add(a);
	}

	public int pop() {

		if (queue.size() > 0) {
			return (int) queue.remove();
		} else {
			System.out.println("Queue empty");
			return -1;
		}
	};

}
