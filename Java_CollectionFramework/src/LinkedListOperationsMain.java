import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListOperationsMain {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		int i = 0;
		int len = sc.nextInt();
		System.out.println("Enter the List");
		while(i < len) {
			list.add(sc.next());
			i+=1;
		}
		
		LinkedListopertations listopertations = new LinkedListopertations(list);
		String response = listopertations.addElement("Arijit");
		System.out.println(response);
		
		List<String> list1 = new LinkedList<>();
		list1 = listopertations.getList();
		System.out.println("The new list is : "+list1);
		int index = list1.indexOf("raja");
		String respo = listopertations.updateList(index, "saik");
		System.out.println(respo);
		List<String> listAfterDel = listopertations.deleteItem("randy");
		System.out.println(listAfterDel);
		
	}

}
