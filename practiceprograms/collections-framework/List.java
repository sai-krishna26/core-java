import java.util.*;
public class List {
  public static void main(String[] args)
  {
    ArrayList<Integer> list=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	list2.add(25);
	list2.add(30);
	
    list.add(10);
	list.add(20);
	list.add(1,15);
	list.addAll(list2);
	list.set(2,40);
	//System.out.println(list.contains(25));
	//list.remove(4);
	//System.out.println(list.get(0));
	//System.out.println(list.remove(Integer.valueOf(25)));	
	//list.clear();
	
	System.out.println("--for--");
	
	for(int i=0;i<list.size(); i++)
	{
		System.out.println(list.get(i));
	}
	
	System.out.println("--for each--");
	
	for( int elem:list)
	{
		System.out.println(elem);
	}
	
	System.out.println("--Iterator--");
	
	Iterator<Integer> itr=list.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
  }
}
