package Colllectionframework;
import java.util.*;
public class araysclasss {

	public static void main(String[] args) {
		
		
		int [] number= {1,2,3,4,5,6,7,8,9};
		int ind = Arrays.binarySearch(number, 4);
		//System.out.println(ind);
		
		
		
		//sorting
		
		int [] roll = {1,4,5,8,2,4,9,7,3,10};
		Arrays.sort(roll);
		Arrays.fill(roll,6);
		for(int i:roll) {
			System.out.println(i+" ");
		}
	}

}
