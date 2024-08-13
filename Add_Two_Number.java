package lec17;

import java.util.ArrayList;

public class Add_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr1 = {2,3,4,5,6};
		int []arr2 = {57,7,8,9,5};
		Add(arr1,arr2);

	}
	public static void Add(int[]arr1,int[]arr2) {
		ArrayList<Integer> ll = new ArrayList<>();
		int i = arr1.length-1;
		int j = arr2.length-1;
		int carry = 0;
		while(i>=0 && j>=0) {
			int sum = arr1[i]+arr2[j]+carry;
			ll.add(sum%10);
			carry = sum/10;
			i--;
			j--;
		}
		while(j>=0) {
			int sum = carry + arr2[j];
			ll.add(sum%10);
			carry = sum /10;
			j--;
		}
		while(i>=0) {
			int sum = carry +arr1[i];
			ll.add(sum%10);
		     carry = sum/10;
		     i--;
		}
		if(carry>0) {
			ll.add(carry);
		}
		for(int k = ll.size()-1;k>=0;k--) {
			System.out.print(ll.get(k)+" ");
		}
		
	}

}
