package ch17.Ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListMethod1 {
	public static void main(String[] args) {
		//list의ㅏ 메소드 (13개 정도)
		//
		List<Integer>ll1=new LinkedList<>();
		//add(element): 마지막에 값 추가
		ll1.add(3);
		ll1.add(4);
		ll1.add(5);
		System.out.println(ll1);
		System.out.println(ll1.size());
		//add(index,element)
		ll1.add(1, 6);
		System.out.println(ll1);
		//addAll(또 다른 리스트의 객체를 복사해서 추가)
		List<Integer>ll2=new LinkedList<Integer>();
		ll2.add(1);
		ll2.add(2);
		ll2.addAll(ll1); //al2에 al1을 추가함
		System.out.println(ll2); 
		
		//addAll(index,객체)
		List<Integer>ll3=new LinkedList<>();
		ll3.add(1);
		ll3.add(2);
		ll3.addAll(1, ll3);
		System.out.println(ll3);
		ll3.addAll(1, ll2);
		System.out.println(ll3);

		//set(index,element): 특정 방 번호의 값 수정
		ll3.set(1, 5);
		ll3.set(3, 6);
		ll3.set(4, 7);
		//없는 방의 값을 수정하려고 하면 오류 발생 
		System.out.println(ll3);
		
		//remove(index) 특정 번호의 방을 삭제
		ll3.remove(1);
		System.out.println(ll3);
		
		//remove(object): 값으로 방 삭제
		ll3.remove(new Integer(2)); //취소선: 없어질지도 모르는 기능
		System.out.println(ll3);
		
		//clear(): 모두 삭제
		ll3.clear();
		System.out.println(ll3);
		
		//isEmpty(): 값이 비어있으면 true, 있으면 false
		System.out.println(ll3.isEmpty());
		
		//size(): 방의 수
		System.out.println(ll3.size());
		ll3.add(1);
		ll3.add(2);
		ll3.add(3);
		System.out.println(ll3);
		System.out.println(ll3.size());
		
		//get(index): 특정 방 번호의 값을 출력
		System.out.println(ll3.get(0));
		System.out.println(ll3.get(2));
		System.out.println(ll3.get(1));
		
		//toArray(): 리스트를 배열로 바꾸기  List>>Array
		Object[] objects=ll3.toArray(); //기본적으로 투어레이 메소드는 object 타입으로 리턴됨
		//다운캐스팅 필요
		System.out.println(Arrays.toString(objects)); //배열일 때는 arrays.tostring() 사용
		
		//toArray(T[] t)  t{}: integer로 캐스팅
		Integer[] integers1=ll3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integers1));
		
		Integer[] integers2=ll3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integers2));
	}
}