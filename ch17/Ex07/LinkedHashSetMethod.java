package ch17.Ex07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

//LinkedHashSet
	//HashSet과 공통점: HashSet과 모든 메소드 동일함. 중복된 값을 저장하지 않음. 인덱스 값 없음. for 사용 불가(iterator,enhanced for 사용)
	//HashSet과 차이점: 입력대로 출력됨(hastset은 입력대로 출력되지 않음)

//ctrl+shift+L : 단축키 리스트

public class LinkedHashSetMethod {
	public static void main(String[] args) {
		Set<String>LinkedHashSet1=new LinkedHashSet<>(); //set은 인터페이스이므로 타입으로만 지정할 수 있다
		//set의 제네릭 타입변수로 wrapper 클래스를 사용할 경우 equals(),hashCode() 재정의됨
		
		//add(element) : set에 값 추가
		LinkedHashSet1.add("가");
		LinkedHashSet1.add("가"); //중복 저장 안됨
		LinkedHashSet1.add("나");
		LinkedHashSet1.add("가"); //중복 저장되지 않는다

		System.out.println(LinkedHashSet1);
		System.out.println(LinkedHashSet1.toString()); //tostring() 재정의됨
		
		//addAll(다른 set 객체): 자신의 set에 다른 set에 저장된 값을 추가, 중복된 값은 제거됨
		Set<String>LinkedHashSet2=new LinkedHashSet<>();
		LinkedHashSet2.add("나");
		LinkedHashSet2.add("다");
		LinkedHashSet2.addAll(LinkedHashSet1);
		
		System.out.println(LinkedHashSet2);
		
		//remove(Object o): 값으로 삭제, (list인 경우 index로 삭제)
		LinkedHashSet2.remove("나");
		System.out.println(LinkedHashSet2);
		
		//clear(): 모두 삭제
		LinkedHashSet2.clear();
		System.out.println(LinkedHashSet2);
		
		//isEmpty
		System.out.println(LinkedHashSet2.isEmpty());
		
		//contains(Object o): 값이 set에 존재하면 true, 그렇지 않으면 false
		Set<String>LinkedHashSet3=new LinkedHashSet<>();
		LinkedHashSet3.add("가");
		LinkedHashSet3.add("나");
		LinkedHashSet3.add("다");
		System.out.println(LinkedHashSet3); //입력과 출력이 동일
		System.out.println(LinkedHashSet3.contains("나")); 
		System.out.println(LinkedHashSet3.contains("라")); 
		
		//size(): set에 포함된 값의 개수
		System.out.println(LinkedHashSet3.size());
		
		//iterator(): set은 index가 없음. for문은 방 번호로 값을 출력하므로 사용 불가, enhanced for문은 사용 가능
		//순회자, set의 값들을 순회하면서 꺼냄
		//hasNext(): set의 값이 존재하면 ture, 아니면 false
		//next(): 현재 값에서 다음값으로 이동
		Iterator<String>iterator=LinkedHashSet3.iterator();
		//클래스<E> 참조객체=set객체.iterator();a
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}
		System.out.println();
		System.out.println("=== for each ===");
		for (String k : LinkedHashSet3) {
			System.out.print(k+"  ");
		}
		System.out.println();
		
		//toArray():set을 배열로 만들기. object타입으로 리턴하므로 다운캐스팅 필요
		Object[] objArray=LinkedHashSet3.toArray();
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
		String[] strArray1=LinkedHashSet3.toArray(new String[0]);// 0: 방의 크기 지정. 
		//방의 크기가 실제 값보다 작을 경우 컴파일러가 방의 크기만큼 지정함. 방의 크기를 알 수 없는 경우 0으로 넣으면 된다.
		System.out.println(Arrays.toString(strArray1)); //[가, 다, 나]
		
		//toArray(T[] t)  <set의 값보다 방의 크기를 크게 설정했을 경우 null 값이 들어감)
		String[] strArray2=LinkedHashSet3.toArray(new String[5]);
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
