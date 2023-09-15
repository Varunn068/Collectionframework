package Colllectionframework;

import java.util.*;

public class Iterator {

	public static void main(String[] args) {
		
		
		ArrayList list= new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.set(2, 40);
		java.util.Iterator ty = list.iterator();
		
		while(ty.hasNext())
		{
			System.out.println(ty.next());
		}

		
	}

}
