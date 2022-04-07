package ch17.Ex08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set: 중복되지 않는 값을 저장(equals(),hashCode() 재정의됨),Wrapper 클래스는 모두 재정의됨
	//1 hashSet 출력되는 것이 랜덤하게 출력
	//2 linkedHashSet 입력되는대로 출력
	//3 treeSet  입력값을 넣으면 내부적으로 정렬. (오름차순)
public class SetSummary {
	public static void main(String[] args) {
		//HashSet
		Set<String>hashSet=new HashSet<>();
		hashSet.add("다");
		hashSet.add("마");
		hashSet.add("나");
		hashSet.add("가");

		System.out.println(hashSet);
	
		//LinkedHashSet
		Set<String>linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("다");
		linkedHashSet.add("마");
		linkedHashSet.add("나");
		linkedHashSet.add("가");

		System.out.println(linkedHashSet);
		
		//TreeSet  <== 정렬하기 위해 Comparable<E> compareTo()재정의
		TreeSet<String> treeSet=new TreeSet<>();
		treeSet.add("다");
		treeSet.add("마");
		treeSet.add("나");
		treeSet.add("가");

		System.out.println(treeSet);
	
	}
}
