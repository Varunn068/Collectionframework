package Colllectionframework;
import java.util.*;
public class collectionclass {

	public static void main(String[] args) {
	
		//min
		//max
		
		List ar= new ArrayList();
		ar.add(10);
		ar.add(14);
		ar.add(78);
		
		System.out.println("bcjk"+Collections.min(ar));
		System.out.println(Collections.frequency(ar, 14));
	}

}
