package ch17.Ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*컬렉션: 동일한 자료형을 저장. 방의 크기가 동적으로 변화
 * 배열: 동일한 자료형을 저장. 방의 크기가 고정됨. 배열 생성 시 방의 크기를 지정. 방의 크기 수정 불가
 * 
 * 
-List<E>: 인터페이스,제너릭 인터페이스: 다양한 데이터 타입을 사용 가능. 인텍스(index)를 가지고 있다(검색 빠름). 방의 크기는 동적으로 변화한다
-ArrayList<E>:싱글 스레드 환경에서 사용. 검색은 빠르지만 값을 추가하거나 삭제 시 느리다
-Vector<E>: 멀티 스레드 환경에서 사용. 모든 메소드가 동기화 되어있다.
-LinkedList<E>: 검색은 느리지만 값을 추가하거나 삭제 시 빠르다
*/

public class ArratList1 {
	public static void main(String[] args) {
		String[] array=new String[] {"가","나","다","라","마","바","사"};
		System.out.println(array.length);
		array[2]=null;
		array[5]=null;
		System.out.println(array.length);
		
		//1 arrays.tostring(배열변수)
		System.out.println(Arrays.toString(array));
		
		//2 for
		for (int i = 0; i < array.length; i++) {
			if (i==array.length-1) {
				System.out.println(array[i]); //마지막에 ,를 출력하지 않는 조건
			}else {
				System.out.print(array[i]+", ");
			}
		}
		
		//3 enhanced for
		for (String k : array) {
			System.out.print(k+", ");
		}
		System.out.println();
		
		//2 list : 인터페이스, 객체 생성을 할 수 없음, 타입은 지정 가능
		List<String> aList1=new ArrayList<String>();
		List<String> aList2=new ArrayList<String>();
		List<String> aList3=new ArrayList<String>();
		
		//List에서 방의 개수 출력: aList.size();   리스트는 사이즈, 배열은 렝스 .length
		System.out.println(aList1.size());
		
		//list에 값 할당 aList.add("ㅁ");  제일 마지막에 값을 추가함
		aList1.add("가"); aList1.add("나"); aList1.add("다"); aList1.add("라");
		aList1.add("마"); aList1.add("바"); aList1.add("사");
		
		//list에 저장된 데이터의 개수 구하기 alist.size()
		System.out.println(aList1.size());
		
		//리스트에 저장된 값 제거: alist.remove("ㅁㅁ");
		aList1.remove("다");
		aList1.remove("바");
		System.out.println(aList1.size());
		
		//list는 인덱스를 가지고 있다
		for (int i = 0; i < aList1.size(); i++) { //alist1.size(): 방의 개수 출력
			System.out.print(aList1.get(i)+",");
		}
		System.out.println();
		
		//객체의 tostring()을 호출해서 출력
		System.out.println(aList1); //컬렉션 모두 tostring() 재정의됨
		
		
		
	}

}
