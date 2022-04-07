package ch17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//TreeSet의 이점: 1 중복 저장되지 않는다(set) 2 오름차순 정렬됨어 입력 3 오름차순 정렬되어 출력 4 검색 기능을 사용
				//5 특정 범위의 값 추출 6 asc(오름차순 정렬,desc(내림차순 정렬)

//TreeSet에 일반 객체를 저장할 경우 특정 필드를 크기 비교 기준 필드가 존재해야 함. 
//처리 방법 3가지
//1 Comparable<E> 인터페이스의 compareTo() 재정의: TreeSet에 일반객체를 저장할 때 일반객체의 특정 필드를 재정의해야함
	//기존의 클래스를 수정해서 사용
//2 Comparable<E> 인터페이스의 compare() 재정의 해야 함. 익명 내부 객체를 사용
	//기존의 객체를 수정하지 않고 사용할 때 comparator<E>인터페이스 상속 후 compare() 재정의
	//TreeSet<E> 객체를 생성할 때 생성자에 Comparator<E> 인터페이스를 구현한 익명 객체를 생성


class MyClass{
	int data1;
	int data2;
	
	public MyClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {

		return data1+" "+data2;
	}
}

class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	
	public MyComparableClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public int compareTo(MyComparableClass o) { //객체의 크기 비교 기준을 설정하는 메소드, ((TreeSet에서 사용))
		//음수,0,양수 로 구별              
		//오름차순 처리 방식
//		if (this.data1<o.data1) { //this.data1 기준 값이 작을 경우: -1(음수)
//			return -1;
//		}else if (this.data1==o.data1) { //this.data1 기준 값이 같을 경우: 0
//			return 0;
//		}else {						//this.data1 기준 값이 클 경우: 1(양수)
//			return 1;
//		}
		//내림차순 처리 방식
		if (this.data1<o.data1) { //this.data1 기준 값이 작을 경우: 1(양수)
			return 1;
		}else if (this.data1==o.data1) { //this.data1 기준 값이 같을 경우: 0
			return 0;
		}else {						//this.data1 기준 값이 클 경우: -1(음수)
			return -1;
		}
	}
	@Override
	public String toString() {

		return data1+" "+data2;
	}
}


public class TreeSetMethod2 {
	public static void main(String[] args) {
		//wrapper 클래스는 comparable<E> 인터페이스의 compareTo() 재정의하고 있음
			//wrapper 클래스의 값을 treeSer에 넣으면 정렬되어 저장
		
		//1 Integer wrapper 클래스의 크기 비교
		TreeSet<Integer>treeSet1=new TreeSet<>();
		Integer intValue1=new Integer(20);//큰값
		Integer intValue2=new Integer(10); //작은값
		int intValue=3;
		
		treeSet1.add(intValue1);
		treeSet1.add(intValue2);
		
		System.out.println(treeSet1); //오름차순 정렬
		
		//2 String wrapper 클래스의 크기 비교
		TreeSet<String>treeSet2=new TreeSet<>();
		String str1=new String("가나"); //작은값
//		String str1="가나";
		String str2=new String("다라"); //큰값
		
		treeSet2.add(str1); //treeSet2.add()를 사용해서 객체를 저장할 경우
									//값의 크기를 비교하는 필드가 정의되어 있어야 함
		treeSet2.add(str2);		//Comparable<E> 인터페이스의 compareTo() 재정의 되어어야함
		
		System.out.println(treeSet2);
		
//		//3MyClass는 compareTo() 재정의 되어있지 않기 때문에 treeSet 컬렉션에 저장할 수 없다.
//		TreeSet<MyClass>treeSet3=new TreeSet<>();
//		MyClass myClass1=new MyClass(2, 5);
//		MyClass myClass2=new MyClass(3, 3);
//		
//		treeSet3.add(myClass1);//TreeSet에는 Comparable<E> 인터페이스의 compareTo() 재정의 한 클래스만 넣을 수 있다
//		treeSet3.add(myClass2); //실행 시 오류 발생
//		
//		System.out.println(treeSet3);
		
		//TreeSet에 일반 객체를 저장할 경우
		//1 MyComparableClass 객체 크기 비교 - Comparable<E>인터페이스의 compareTo() 재정의
			//기존 객체의 수정 필요. 다시 컴파일
		TreeSet<MyComparableClass> treeSet4=new TreeSet<>();
		
		MyComparableClass mcc1=new MyComparableClass(2, 5); //TreeSet에 저장될 때 Comparable<E>인터페이스의 compareTo() 재정의
		MyComparableClass mcc2=new MyComparableClass(5, 3);
		MyComparableClass mcc3=new MyComparableClass(4, 3);
		
		treeSet4.add(mcc1);
		treeSet4.add(mcc2);
		treeSet4.add(mcc3);
		
		System.out.println(treeSet4);
		
		//2 기존 객체를 수정하지 않고 TreeSet에 저장할 경우
		//TreeSet 생성자 내부에 Comparator<E> 인터페이스를 정의해서 익명 객체로 구현
		TreeSet<MyClass> treeSet5=new TreeSet<>(new Comparator<MyClass>() {
			//Comparator<MyClass>를 구현한 익명 자식 클래스 블록
			@Override
			public int compare(MyClass o1, MyClass o2) { //오름차순 정렬 처리(data1)
				if (o1.data1<o2.data1) {
					return -1;
				}else if (o1.data1==o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass myClass1=new MyClass(2, 5);
		MyClass myClass2=new MyClass(3, 3);
//		MyClass myClass3=new MyClass(4, 1);
		
		treeSet5.add(myClass1);
		treeSet5.add(myClass2);
		
		System.out.println(treeSet5);
		
		
		
	}

}
