package Programs;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class ImplementAQueueUsingAnArrayAllFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> q = new ArrayDeque();
		
		String[] ar= {"j","a","i"};
		
		for(String v : ar) {
			q.add(v);
		}
		System.out.println(q);
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q.add("jai"));
		System.out.println(q);
		
	}

}
