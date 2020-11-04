package it.unical.ingsw.provalab;

import java.util.ArrayList;

public class MyListUtil {
	
	ArrayList<Integer> list;
	
	public MyListUtil(ArrayList<Integer> l) {
		this.list = l;
	}
	
	public ArrayList<Integer> crescOrder() {
		for(int j = 0; j < list.size() - 1; j++) {
			for(int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1))
					swap(i, i + 1);
			}
		}
		return list;
	}
	
	public ArrayList<Integer> decrescOrder() {
		for(int j = 0; j < list.size() - 1; j++) {
			for(int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) < list.get(i + 1))
					swap(i, i + 1);
			}
		}
		
		return list;
	}
	
	private void swap(int i1, int i2) {
		int temp = list.get(i1);
		list.set(i1, list.get(i2));
		list.set(i2, temp);
	}
	
	public void printList() {
		System.out.println(list);
	}
	
}


