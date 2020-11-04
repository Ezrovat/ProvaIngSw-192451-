package it.unical.ingsw.provalab;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(9);
		MyListUtil ml = new MyListUtil(list);
		ml.crescOrder();
		ml.printList();
	}
}
