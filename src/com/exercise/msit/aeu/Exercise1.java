package com.exercise.msit.aeu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise1 {

	public static void main(String[] args) {
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Orange");
		colorList.add("White");
		colorList.add("Black");
		
		//PrintArrayList(colorList);
		//PrintIteratorArrayList(colorList);
		//CompareTwoArrayList(colorList);
		IteratorLinkedList();
	}

	private static void PrintArrayList(ArrayList<String> colorList) {		
		System.out.println(colorList);
	}
	
	private static void PrintIteratorArrayList(ArrayList<String> colorList) {		
		Iterator<String> itColors = colorList.iterator();
		while (itColors.hasNext())
			System.out.println(itColors.next());
	}
	
	private static void CompareTwoArrayList(ArrayList<String> colorList) {
		ArrayList<String> colors1 = colorList;
		ArrayList<String> colors2 = new ArrayList<String>();
		colors2.add("Orange");
		colors2.add("Pink");
		colors2.add("White");
		colors2.add("Blue");
		
		ArrayList<String> colors3 = new ArrayList<String>();
		for (String c1 : colors1)
			colors3.add(colors2.contains(c1) ? "Yes" : "No");
		System.out.println(colors3);
	}
	
	private static void IteratorLinkedList() {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("White");
		linkedList.add("Blue");
		linkedList.add("Green");
		
		Iterator iterator = linkedList.listIterator(1);
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}
}