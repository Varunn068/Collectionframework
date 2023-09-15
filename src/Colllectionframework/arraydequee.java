package Colllectionframework;
import java.util.*;
public class arraydequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque ar= new ArrayDeque();
		ar.offer(12);
		ar.offerFirst(16);
		ar.offerLast(58);
		ar.offer(43);
		
		ar.pollLast();
		System.out.println(ar.peekLast());
	
	}

}
