package ch17.Ex04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListSummary {
	public static void main(String[] args) {
		//arraylist
		List<String>al=new ArrayList<>();
		al.add("다");
		al.add("마");
		al.add("나");
		al.add("가");
		System.out.println(al);
		
		//vector
		List<String>vl=new Vector<>();
		vl.add("다");
		vl.add("마");
		vl.add("나");
		vl.add("가");
		System.out.println(vl);
		
		//linkedlist
		List<String>ll=new LinkedList<>();
		ll.add("다");
		ll.add("마");
		ll.add("나");
		ll.add("가");
		System.out.println(ll);
	}
}
