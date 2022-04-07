package ch17.Ex12;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

//TreeMap<K,V> : 저장 시 key를 기준으로 오름차순 정렬되어 저장됨
	//출력 시 오릌차순 정렬되어 출력됨.
	//key에 일반 객체를 저장할 때 Comparable<E> compareTo()((객체 수정)) 이나
							//Comparator<E> compare()((객체 미수정))  재정의 필요
//Map<K,V> <==SortedMap<K,V>(정렬 메소드 정의됨) <=NavigableMap<K,V>(검색 메소드 정의됨) <=TreeMap<K,V>
	//TreeMap을 사용할 때 타입을 TreeMap으로 지정해야 검색, 정렬 메소드 사용 가능

public class TreeMapMethod1 {
	public static void main(String[] args) {
//		TreeMap<K, V>은 Map<K, V>의 메소드 모두 사용, +SortedMap<K, V>,NavigableMap<K, V>의 메소드 사용
		TreeMap<Integer, String>treeMap=new TreeMap<>(); //오름차순으로 정렬됨
		
		for (int i = 20; i > 0; i-=2) {
			treeMap.put(i, i+"번째 데이터");
		}
		System.out.println(treeMap); //key를 기준으로 오름차순 정렬됨
		
		//1 firstKey() : 제일 첫 번째 값 가져오기
		System.out.println(treeMap.firstKey());
		
		//2 firstEntry(): 첫번째 엔트리(entry=key&value 묶음)
		System.out.println(treeMap.firstEntry());
		
		//3 lastKey(): 마지막 값
		System.out.println(treeMap.lastKey());
		
		//4 lastEntry(): 마지막 엔트리
		System.out.println(treeMap.lastEntry());
		
		//5 lowerKey(K key): 입력받은 키값의 낮은 값 출력(key 값 제외)
		System.out.println(treeMap.lowerKey(10)); //8
		
		//6 higherKey(K key): 입력받은 키값의 가장 가까운 높은 값 출력
		System.out.println(treeMap.higherKey(10)); //12
		
		//7 pollFirstEntry(): 첫번째의 키와 값을 빼온다 (사라짐)
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
		//8 pollLastEntry(): 마지막의 키와 값을 빼온다 (사라짐)
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);

		//9 SortedMap<K,V> headMap(K toKey): 입력받은 키의 앞쪽(head)으로부터 키값의 바로 앞까지 가져오기(키값 제외)
		SortedMap<Integer, String>sortedMap=treeMap.headMap(8);
		System.out.println(sortedMap);
		
		//10 NavigableMap<K,V> headMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String>navigableMap=treeMap.headMap(8, true); //key 8을 포함하면서 head쪽으로 출력
		System.out.println(navigableMap);
		
		//11 SortedMap<K,V> tailMap(K toKey): key값 포함 
		SortedMap<Integer, String>sortedMap2=treeMap.tailMap(14);
		System.out.println(sortedMap2);
		
		//12 NavigableMap<K,V> tailMap(K toKey, boolean inclusive)
		NavigableMap<Integer, String>navigableMap2=treeMap.tailMap(14, false); //시작은 포함, 끝은 미포함이 기본
		System.out.println(navigableMap2);
		
		//13 SortedMap<K, V> subMap(K fromKey,K toKey): 특정 범위의 값을 저장
		SortedMap<Integer, String> sortedMap3=treeMap.subMap(6, 10);
		System.out.println(sortedMap3);
		
		//14 NavigableMap<K,V> subMap(K fromKey, boolean inclusive, K toKey, boolean inclusive)
		NavigableMap<Integer, String>navigableMap3=treeMap.subMap(6, true, 10, true);
		System.out.println(navigableMap3);
		
		//15 NavigableSet<E> descendingKeySet(): 현재 키의 정렬을 반대로 
		NavigableSet<Integer> navigableSet =treeMap.descendingKeySet();
		System.out.println(navigableSet);
		System.out.println(navigableSet.descendingSet());
		
		//16 NavigableMap<K,V> descendingMap(): 현재 정렬을 반대로 
		NavigableMap<Integer, String>navigableMap4=treeMap.descendingMap();
		System.out.println(navigableMap4);
		System.out.println(navigableMap4.descendingMap());
		
	}
}
