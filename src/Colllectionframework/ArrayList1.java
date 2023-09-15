package Colllectionframework;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		
		
		ArrayList<String> ar=new ArrayList<>(2);
		ar.add("shivaram");
		ar.add("jayanna");
		ar.add("ramesh");
		ar.add("jayachandra");
		ar.add(0, "sharma");
		
		System.out.println(ar);
         System.out.println(ar.get(3));
         ar.remove(4);
         System.out.println(ar);
        
     if(ar.contains("ramesh"))
     {
    	 System.out.println("product is avaiable");
     }
         
     ar.set(2, "jagana");
     System.out.println(ar);
     
     for(int i=0;i<ar.size();i++)
     {
    	 System.out.println(ar);
     }
    
     
     
     
     
     
     
	}
	

}
