package Colllectionframework;
import java.util.*;
public class Priorityqueue {

	public static void main(String[] args) {
		
		Queue pq= new PriorityQueue(Comparator.reverseOrder()
				
				);
		pq.offer(40);
		pq.offer(12);
		pq.offer(36);
		pq.offer(24);
		
		System.out.println(pq.peek());
	}

}
