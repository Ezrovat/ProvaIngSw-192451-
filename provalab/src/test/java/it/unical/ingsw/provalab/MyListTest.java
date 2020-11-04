package it.unical.ingsw.provalab;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


import org.joda.time.*;

public class MyListTest {
	
	private MyListUtil ml;
	ArrayList<Integer> original;
	ArrayList<Integer> resultDecresc;
	ArrayList<Integer> resultCresc;
	
	@Before
	public void init() {
		original = new ArrayList<Integer>();
		original.add(2);
		original.add(9);
		original.add(1);
		original.add(5);
		
		
		resultDecresc = new ArrayList<Integer>();
		resultDecresc.add(9);
		resultDecresc.add(5);
		resultDecresc.add(2);
		resultDecresc.add(1);
		
		resultCresc = new ArrayList<Integer>();
		resultCresc.add(1);
		resultCresc.add(2);
		resultCresc.add(5);
		resultCresc.add(9);
		
		
		ml = new MyListUtil(original);
	}
	
	@Test
	public void rightOrderCresc() {
		System.out.println("Inizio prova ordine ascendente");
		System.out.println(new DateTime());
		assertEquals(resultCresc, ml.crescOrder());
		System.out.println(new DateTime());
		System.out.println("Fine prova ordine ascendente");
	}
	
	@Test
	public void rightOrderDecresc() {
		System.out.println("Inizio prova ordine discendente");
		System.out.println(new DateTime());
		assertEquals(resultDecresc, ml.decrescOrder());
		System.out.println(new DateTime());
		System.out.println("Fine prova ordine discendente");
	}
}
