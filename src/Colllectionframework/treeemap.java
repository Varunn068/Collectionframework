package Colllectionframework;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class treeemap {

	public static void main(String[] args) {
		
		Map<String,Integer> r=new TreeMap();
		r.put("one",1);
		r.put("two", 2);
		r.put("three", 3);
		r.put("four", 4);
		r.put("five", 5);
		
		r.remove("four");
		System.out.println(r);
	}

}
