package map;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HashMapInplementationMain {

	public static void main(String[] args) throws IOException {
		List<String> englist = new ArrayList<String>();
		List<String> spanishlist = new ArrayList<String>();
		Scanner bf = new Scanner(System.in);
		System.out.println("Enter the length of the Spanish List");
		int len1 = bf.nextInt();
		System.out.println("Enter the Spanish Alphabate");
		try {
			int i = 0;
			while (i < len1) {

				spanishlist.add(bf.next());
				i += 1;
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		HashMapsImplementation hashmaped = new HashMapsImplementation(spanishlist);
		Map<String,String> myMap = hashmaped.initalizeMap();
		
		for (Map.Entry<String,String> entry : myMap.entrySet())  {
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		}
		
		//declare the Array of string
		List<String> list = new ArrayList<String>();
		System.out.println("Enter the Array Length");
		int n  = bf.nextInt();
		System.out.println("Enter the String");
		for(int i = 0; i< n; i++ )	{
			list.add(bf.next());
		}
		hashmaped.changeMyWord(myMap,list);
		
	}

}
