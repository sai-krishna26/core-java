import java.util.*;

public class Stackk
{
	public static void main(String[] args)
	{
		Stack<String> fruits=new Stack<>();
		fruits.push("apple");
		fruits.push("banana");
		fruits.push("cherry");
		fruits.push("DragonFruit");
		
		System.out.println("Stack: "+fruits);
		
		System.out.println("peek: "+fruits.peek());
		
		System.out.println("popping: "+fruits.pop());
		
		System.out.println("after pop: "+fruits);
		
	}
}