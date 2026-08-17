import java.util.*;

class Que
{
	public static void main(String[] args)
	{
		Queue<Integer> numbers=new LinkedList<>();
		numbers.offer(10);
		numbers.offer(20);
		numbers.offer(30);
		numbers.offer(40);
		numbers.offer(50);
	
		//we can also use .add() but it throws exception!
		numbers.add(60);
		
		System.out.println(numbers);
		
		//System.out.println("peek: "+numbers.peek());
		
		//System.out.println("polling: "+numbers.poll());

		//System.out.println("After poll: "+numbers);		
		
		//throws exception , danger
		System.out.println("element: "+numbers.element());
		
		System.out.println("removing: "+numbers.remove());
		
		System.out.println("After remove: "+numbers);
		




	}
}