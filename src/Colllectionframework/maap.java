package Colllectionframework;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
public class maap {

	private static final Object String = null;
	private static final Object Integer = null;
	private static char[] e;
	private static char[] key;

	public static void main(String[] args) {
		
        Map<String,Integer> re= new HashMap();
        re.put("rohit", 45);
        re.put("klr", 1);
        re.put("virat", 18);
        re.put("surya",63);
        
        System.out.println(re);
        
        if(!re.containsKey("klr")
        		) {
        	re.put("klr", 5);
        }
        re.put("klre", 1);
        System.out.println(re);
        re.putIfAbsent("klr", 23);
        
  for(String key : re.keySet()) {
  System.out.println(key);
	}
  
  for(Integer values : re.values())
  {
	  System.out.println(values);	
}

	}
	}