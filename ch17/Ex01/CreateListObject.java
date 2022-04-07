package ch17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CreateListObject {
	public static void main(String[] args) {
		//리스트 구현 클래스의 생성자를 사용하여 객체 생성
		//list는 인터페이스이므로 new가 뒤에 올 수 없다. 
		//capacity: 메모리에 방의 크기를 할당. 기본값은 10
		//size(): 방에 저장된 값의 개수
		
		List<Integer>al1=new ArrayList<>(); //capacity = 10
		List<Integer>al2=new ArrayList<>(30); //capacity = 30 메모리 공간 확보
		List<Integer>al3=new Vector<>();
		List<Integer>al4=new Vector<>(30);
		List<Integer>al5=new LinkedList<>();
//		List<Integer>al6=new LinkedList<>(30);//linkedlist는 capacity 지정 불가
		
//		Arrays 클래스의 정적 메소드를 이용한 방법: 데이터 크기를 바꿀 수 없다
			//요일,계정 등 고정된 값을 저장할 때 사용됨
		List<Integer>al7=Arrays.asList(1,2,3,4); //
		List<String>al8=Arrays.asList("월","화","수","목","금","토","일");
		
		al7.set(1, 7); //기존 값 수정. index 1에 7로 수정한다
//		al7.add(5);//오류. 방(마지막)을 추가할 수 없다.
		al8.set(0, "일");
//		al8.add("일");
		
		System.out.println(al7);
		System.out.println(al8);
		
	}
}
