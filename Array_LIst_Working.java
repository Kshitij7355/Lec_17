package lec17;

import java.util.ArrayList;

public class Array_LIst_Working {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		l1.add(2, -6);//range to size
		System.out.println(l1);
		for(int i = 0; i<l1.size();i++) {
			System.out.print(l1.get(i)+" ");
		}
		System.out.println();
		for(int v:l1) {//   ye for each loop hota hai jisme v variabe name hai aur l1 list name hai
			System.out.print(v+" ");
		}
		int[]arr = {12,122,34,67,90,};
		System.out.println();
		for(int i : arr) {
			System.out.print(i+" ");
		}

	}

}
