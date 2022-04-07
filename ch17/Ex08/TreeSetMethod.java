package ch17.Ex08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//TreeSet
	//출력 시 정렬되어 출력됨. (오름차순 정렬(ascending) 1 -> 9, a -> z)
	//출력 시 검색 메소드 지원
	//임의의 값을 넣으면 set에 정렬되어서 저장됨.
	//Set > SortedSet(정렬 메소드 정의됨) > NavigableSet(검색 메소드 정의됨) > TreeSet
	//TreeSet<String> treeSet = new TreeSet<>();
	//set 인터페이스의 모든 메소드 사용 가능

public class TreeSetMethod {
	public static void main(String[] args) {
		//treeset에 값을 넣었을 경우 오름차순 정렬되어 값이 저장됨
		TreeSet<Integer>treeSet1=new TreeSet<>(); //type을 treeset으로 지정해야 정렬과 검색 메소드를 사용할 수 있다.
		
		for (int i = 50; i > 0; i-=2) {
			treeSet1.add(i);
		}
		System.out.println(treeSet1);
		
		//treeset에서만 사용 가능한 메소드 (1~15)
		System.out.println("=====데이터 검색(가져오기)======");
		//first() : 제일 처음값을 리턴
		System.out.println(treeSet1.first()); //2
		//last() : 제일 마지막값을 기런
		System.out.println(treeSet1.last()); //50
		//lower(E element) : element에 제일 가까운 작은 값 리턴
		System.out.println(treeSet1.lower(26)); 
		//higher(E element) : element에 제일 가까운 큰 값 리턴
		System.out.println(treeSet1.higher(26)); 
		//floor(E element): element에 제일 가까운 작은 값(element값 포함)
		System.out.println(treeSet1.floor(25));
		//ceiling(E element): element에 제일 가까운 큰 값(element값 포함)
		System.out.println(treeSet1.ceiling(25));
		System.out.println("======데이터 꺼내기======");
		//pollFirst(): 제일 처음값 꺼내기(사라짐)
		System.out.println(treeSet1.size());
		int treesetSize=treeSet1.size();
		for (int i = 0; i < treesetSize ; i++) {
			System.out.println(treeSet1.pollFirst());
		}
		System.out.println(treeSet1.size());
		//pollLast(): 제일 마지막 값 꺼내기
		for (int i = 50; i >0; i-=2) {
			treeSet1.add(i);
		}
		treesetSize=treeSet1.size();
		System.out.println(treesetSize);
		for (int i = 0; i < treesetSize ; i++) {
			System.out.println(treeSet1.pollLast());
		}
		System.out.println(treeSet1.size());
		
		System.out.println("=======정렬=========");
		//SortedSet<E> headSet(E element): 
		//정렬을 사용하기 위해 SortedSet<E> 타입으로 리턴
		//SortedSet<E> : 정렬된 데이터를 저장하는 set
		//headSet(E element): element의 head(앞)쪽으로부터 값을 저장(element값 미포함)
		for (int i = 50; i >0; i-=2) {
			treeSet1.add(i);
		}
		System.out.println(treeSet1);
		SortedSet<Integer>sortedSet =treeSet1.headSet(20);
//		Set<Integer>sortedSet =treeSet1.headSet(20); //sorted 생략 가능
		System.out.println(sortedSet);
		//NavigableSet<E> headSet(E element,boolean inclusive): element의 앞쪽으로부터 값을 저장
		//true: element값 포함 / false: element값 미포함
		NavigableSet<Integer> navigableSet=treeSet1.headSet(20, true);
//		Set<Integer> navigableSet=treeSet1.headSet(20, true); //Navigable생략 가능
		System.out.println(navigableSet);
		//SortedSet<E> tailSet(E element): element(포함)부터 정렬
		SortedSet<Integer> sortedSet2=treeSet1.tailSet(20);
		System.out.println(sortedSet2);
		//NavigableSet<E> tailSet(E element,boolean inclusive): element의 뒤쪽으로부터 값을 저장
		//true: element값 포함 / false: element값 미포함
		NavigableSet<Integer> navigableSet2=treeSet1.tailSet(20, false);
//		Set<Integer>navigableSet2=treeSet1.tailSet(20, false); //Navigable 생략 가능
		System.out.println(navigableSet2);
		System.out.println("=========");
		//SortedSet<E> subSet(E element,E element): 특정 범위의 값을 set으로 담을 때
		SortedSet<Integer> sortedSet3=treeSet1.subSet(10, 20); //시작값은 포함, 끝값은 미포함(기본)
		System.out.println(sortedSet3);
		//NabigableSet<E> subSet(E element, boolean inclusive,E element, boolean inclusive)
		//
		NavigableSet<Integer> navigableSet3=treeSet1.subSet(10, false, 20, false);
		System.out.println(navigableSet3);
		System.out.println("========");
		//NavigableSet<E> descendingSet(): 현재 정렬을 기준으로 반대 정렬함 
		NavigableSet<Integer> navigableSet4=treeSet1.descendingSet();
//		Set<Integer> navigableSet4=treeSet1.descendingSet(); //navigable 생략 가능
		System.out.println(treeSet1);//오름차순 정렬
		System.out.println(navigableSet4); //내립차순 정렬
		NavigableSet<Integer> navigableSet5=navigableSet4.descendingSet();
		System.out.println(navigableSet5);//오름차순 정렬
		
		
	}
}
