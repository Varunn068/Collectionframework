package Colllectionframework;
import java.util.Stack;
public class stack {

	public static void main(String[] args) {
		
		Stack<String> foods= new Stack();
		
		foods.add("idli");
		foods.add("dosa");
		foods.add("uppam");
		foods.add("buns");
		foods.push("puri");
		
		foods.pop();
		System.out.println(foods.peek());
	}

}
