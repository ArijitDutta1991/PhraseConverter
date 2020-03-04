import java.util.LinkedList;
import java.util.List;

public class LinkedListopertations {
	
	public List<String> myList = new LinkedList<>();
	private int counter;
	
	public LinkedListopertations() {
		super();
	}

	public LinkedListopertations(List<String> myList) {
		super();
		this.myList = myList;
	}
	
	public String addElement(String element) {
		
		myList.add(element);
		return "Added "+element+" Successfully";
	}
	
	public List<String> getList(){
		
		return myList;
	}
	
	public String updateList(int num, String element) {
		myList.set(num, element);
		return "List got updated with value : "+element;
		
	}
	
	public List<String> deleteItem(String element)
	{
		myList.remove(element);
		return myList;
	}
}
