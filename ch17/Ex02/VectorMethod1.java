package ch17.Ex02;

//vector는 arraylist와 모든 메소드를  동일하게 사용
//vector의 모든 메서드는 동기화 처리가 되어이ㅆ다. 멀티 스레드 환경에서 사용됨

//arraylist는 싱글 스레드 환경에서 사용

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorMethod1 {
	public static void main(String[] args) {
		//list의 메소드 (13개 정도)
		//
		List<Integer>vl1=new Vector<>();
		//add(element): 마지막에 값 추가
		vl1.add(3);
		vl1.add(4);
		vl1.add(5);
		System.out.println(vl1);
		System.out.println(vl1.size());
		//add(index,element)
		vl1.add(1, 6);
		System.out.println(vl1);
		//addAll(또 다른 리스트의 객체를 복사해서 추가)
		List<Integer>vl2=new Vector<Integer>();
		vl2.add(1);
		vl2.add(2);
		vl2.addAll(vl1); //al2에 al1을 추가함
		System.out.println(vl2); 
		
		//addAll(index,객체)
		List<Integer>vl3=new Vector<>();
		vl3.add(1);
		vl3.add(2);
		vl3.addAll(1, vl3);
		System.out.println(vl3);
		vl3.addAll(1, vl2);
		System.out.println(vl3);

		//set(index,element): 특정 방 번호의 값 수정
		vl3.set(1, 5);
		vl3.set(3, 6);
		vl3.set(4, 7);
		//없는 방의 값을 수정하려고 하면 오류 발생 
		System.out.println(vl3);
		
		//remove(index) 특정 번호의 방을 삭제
		vl3.remove(1);
		System.out.println(vl3);
		
		//remove(object): 값으로 방 삭제
		vl3.remove(new Integer(2)); //취소선: 없어질지도 모르는 기능
		System.out.println(vl3);
		
		//clear(): 모두 삭제
		vl3.clear();
		System.out.println(vl3);
		
		//isEmpty(): 값이 비어있으면 true, 있으면 false
		System.out.println(vl3.isEmpty());
		
		//size(): 방의 수
		System.out.println(vl3.size());
		vl3.add(1);
		vl3.add(2);
		vl3.add(3);
		System.out.println(vl3);
		System.out.println(vl3.size());
		
		//get(index): 특정 방 번호의 값을 출력
		System.out.println(vl3.get(0));
		System.out.println(vl3.get(2));
		System.out.println(vl3.get(1));
		
		//toArray(): 리스트를 배열로 바꾸기  List>>Array
		Object[] objects=vl3.toArray(); //기본적으로 투어레이 메소드는 object 타입으로 리턴됨
		//다운캐스팅 필요
		System.out.println(Arrays.toString(objects)); //배열일 때는 arrays.tostring() 사용
		
		//toArray(T[] t)  t{}: integer로 캐스팅
		Integer[] integers1=vl3.toArray(new Integer[0]);
		System.out.println(Arrays.toString(integers1));
		
		Integer[] integers2=vl3.toArray(new Integer[5]);
		System.out.println(Arrays.toString(integers2));
	}
}
