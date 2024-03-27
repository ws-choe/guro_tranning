package traning0327;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EX11_2 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Stack st1 = new Stack();
		Queue q = new LinkedList();

		st.push(1);
		st.push(2);
		st.push(3);

		st1.addAll(st);

		q.offer(1);
		q.offer(2);
		q.offer(3);

		System.out.println("= Stack =");
		while (!st.empty()) {
			System.out.println(st.pop());
		}

		System.out.println("= Stack1 =");
		while (!st1.empty()) {
			System.out.println(st1.pop());
		}

		System.out.println("= Queue =");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
