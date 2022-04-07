package ch17.Ex06;

import java.util.Arrays;

//인터페이스 Set<E>: 방 번호(index)가 없다. 중복된 값을 넣을 수 없다.
//-HashSet		: 중복된 값을 넣을 수 없다. 값을 순서대로 꺼낼 수 없다.
//-LinkedHashSet: 중복된 값을 넣을 수 없다. 출력시 순서대로 출력된다
//-TreeSet		: 저장될 때 값이 정렬되어 저장됨. ascending(오름차순) 0->9, a->z,가->하
	//*descending(내림차순)

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
	public static void main(String[] args) {
		Set<String>hSet1=new HashSet<>(); //set은 인터페이스이므로 타입으로만 지정할 수 있다
		
		//add(element) : set에 값 추가
		hSet1.add("가");
		hSet1.add("나");
		hSet1.add("가"); //중복 저장되지 않는다

		System.out.println(hSet1);
		System.out.println(hSet1.toString()); //tostring() 재정의됨
		
		//addAll(다른 set 객체): 자신의 set에 다른 set에 저장된 값을 추가, 중복된 값은 제거됨
		Set<String>hSet2=new HashSet<>();
		hSet2.add("나");
		hSet2.add("다");
		hSet2.addAll(hSet1);
		
		System.out.println(hSet2);
		
		//remove(Object o): 값으로 삭제, (list인 경우 index로 삭제)
		hSet2.remove("나");
		System.out.println(hSet2);
		
		//clear(): 모두 삭제
		hSet2.clear();
		System.out.println(hSet2);
		
		//isEmpty
		System.out.println(hSet2.isEmpty());
		
		//contains(Object o): 값이 set에 존재하면 true, 그렇지 않으면 false
		Set<String>hSet3=new HashSet<>();
		hSet3.add("가");
		hSet3.add("나");
		hSet3.add("다");
		System.out.println(hSet3);
		System.out.println(hSet3.contains("나")); 
		System.out.println(hSet3.contains("라")); 
		
		//size(): set에 포함된 값의 개수
		System.out.println(hSet3.size());
		
		//iterator(): set은 index가 없음. for문은 방 번호로 값을 출력하므로 사용 불가, enhanced for문은 사용 가능
		//순회자, set의 값들을 순회하면서 꺼냄
		//hasNext(): set의 값이 존재하면 ture, 아니면 false
		//next(): 현재 값에서 다음값으로 이동
		Iterator<String>iterator=hSet3.iterator();
		//클래스<E> 참조객체=set객체.iterator();a
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}
		System.out.println();
		System.out.println("=== for each ===");
		for (String k : hSet3) {
			System.out.print(k+"  ");
		}
		System.out.println();
		
		//toArray():set을 배열로 만들기. object타입으로 리턴하므로 다운캐스팅 필요
		Object[] objArray=hSet3.toArray();
		System.out.println(Arrays.toString(objArray)); //배열을 출력할 때 arrays.tostring(배열)
		for (int i = 0; i < objArray.length; i++) {
			System.out.print(objArray[i]+" ");
		}
		System.out.println();
		System.out.println("===========");
		for (Object k : objArray) { //다운캐스팅이 필요
			System.out.print(k+" "); //가 다 나 
		}
		System.out.println();
		
		//toArray(T[] t): 다운캐스팅 됨   toArray(new 타입[i])
		String[] strArray1=hSet3.toArray(new String[0]);// 0: 방의 크기 지정. 
		//방의 크기가 실제 값보다 작을 경우 컴파일러가 방의 크기만큼 지정함. 방의 크기를 알 수 없는 경우 0으로 넣으면 된다.
		System.out.println(Arrays.toString(strArray1)); //[가, 다, 나]
		
		//toArray(T[] t)  <set의 값보다 방의 크기를 크게 설정했을 경우 null 값이 들어감)
		String[] strArray2=hSet3.toArray(new String[5]);
		System.out.println(Arrays.toString(strArray2)); //[가, 다, 나, null, null]
		
		Set<Integer>intSet1=new HashSet<>();
		intSet1.add(30); intSet1.add(50); intSet1.add(100); intSet1.add(10);
		//iterator 출력, enhanced for 출력 
		
		Iterator<Integer>iterator1=intSet1.iterator();
		
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next()+"  ");
		}
		System.out.println();
		
		for (int k : intSet1) {
			System.out.print(k+"  ");
		}
		
		
		
		
		
		
		
		
		
	}

}
