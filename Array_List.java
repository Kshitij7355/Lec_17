package lec17;
import java.util.ArrayList;
import java.util.Collections;
public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		System.out.println(l1);
		System.out.println(l1.size());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		l1.add(2, -6);//range to size
		System.out.println(l1);
		System.out.println(l1.size());
//		Collections.sort(l1); sort karne ke liye
//		System.out.println(l1);
		//get range 0 to size -1; 
		System.out.println(l1.get(2));
		l1.set(2, 111);
		System.out.println(l1);
		//remove  
		l1.remove(0);
		System.out.println(l1);

	}

}
