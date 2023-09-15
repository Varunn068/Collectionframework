package Colllectionframework;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class hashseet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set =new HashSet();
		set.add(12);
		set.add(2);
		set.add(47);
		set.add(32);
		
		//set.remove(2);
	//	System.out.println(set.isEmpty());
		//System.out.println(set.contains(32));
		//set.clear();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()
					);
		}
		
	}

}
