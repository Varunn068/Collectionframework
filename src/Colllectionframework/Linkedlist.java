package Colllectionframework;
import java.util.LinkedList;
import java.util.Queue;
public class Linkedlist {

	public static void main(String[] args) {
		
		Queue<String> tr= new LinkedList();
		tr.offer("das");
		tr.offer("yash");
		tr.offer("shivaji");
		
		tr.poll();
		System.out.println(tr.peek());
		

	}

}
