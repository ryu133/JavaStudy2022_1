package ch17.Ex12;

import java.util.Comparator;
import java.util.TreeMap;

//TreeMap<K,V> : key가 오름차순 정렬되어서 처리
	//key에 일반객체를 사용할 경우 Comparable<E>의 compareTo(), Comparator<E>의 compare() 재정의 필요

//일반 클래스
class MyClass{
	int data1;
	int data2;
	public MyClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+" 값 출력";
	}
}
//comparable<E> 인터페이스의 compareTo() 재정의한 클래스
class MyComparableClass implements Comparable<MyComparableClass>{
	int data1;
	int data2;
	public MyComparableClass(int data1,int data2) {
		this.data1=data1;
		this.data2=data2;
	}
	@Override
	public String toString() {
		return data1+" 값 출력";
	}
	@Override
	public int compareTo(MyComparableClass o) {
		if (this.data1<o.data1) {
			return -1;
		}else if (this.data1==o.data1) {
			return 0;
		}else {
			return 1;
		}
	}
}

public class TreeMapMethod2 {
	public static void main(String[] args) {
		//1 MyClass를 TreeMap의 Key로 입력할 경우 실행 오류 발생
//		TreeMap<MyClass, String>treeMap1=new TreeMap<>();
//		MyClass m1=new MyClass(2, 5);
//		MyClass m2=new MyClass(3, 3);
//		
//		treeMap1.put(m1, "first"); //
//		treeMap1.put(m2, "second");
//		
//		System.out.println(treeMap1);
		
		//2 Comparable을 구현한 클래스를 사용
		TreeMap<MyComparableClass, String> treeMap2=new TreeMap<>();
		
		MyComparableClass my1=new MyComparableClass(2, 5);
		MyComparableClass my3=new MyComparableClass(10, 5);
		MyComparableClass my2=new MyComparableClass(3, 3);
		
		treeMap2.put(my1, "1번");
		treeMap2.put(my3, "3번");
		treeMap2.put(my2, "2번");
		
		System.out.println(treeMap2);
		System.out.println(treeMap2.size());
		
		//3 Comparator<E> 구현 : 기존 객체 사용. 수정 불필요
		TreeMap<MyClass, String> treeMap3=new TreeMap<>(new Comparator<MyClass>() {
			@Override
			public int compare(MyClass o1, MyClass o2) {
				if (o1.data1 < o2.data1) {
					return -1;
				}else if (o1.data1==o2.data1) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		MyClass m3=new MyClass(2, 5);
		MyClass m5=new MyClass(20, 20);
		MyClass m4=new MyClass(3, 3);
		
		treeMap3.put(m5, "3번");
		treeMap3.put(m3, "1번");
		treeMap3.put(m4, "2번");
		
		System.out.println(treeMap3);
		System.out.println(treeMap3.size());
		
		
	}
}
