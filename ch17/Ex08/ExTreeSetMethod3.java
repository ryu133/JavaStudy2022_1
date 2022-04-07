package ch17.Ex08;

import java.util.Comparator;
import java.util.TreeSet;

//이름과 나이를 입력 시 이름 기준으로 오름차순 정렬 후 출력. TreeSet 사용
//1 Comparable<E> 의 compareTo() 재정의
	//기존의 객체 수정 필요
//2 Comparator<E> 의 compare() 구현
	//기존의 객체 수정없이 구현
class Abc{
	String name;  //정렬할 컬럼. 오름차순 정렬  홍길동,이순신,강감찬 ==> 강감찬,이순신,홍길동
	int age;  	
	
	public Abc(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	public String toString() {

		return name+" "+age;
	}
	
}

class AbcT implements Comparable<AbcT>{
	String name;
	int age;
	
	public AbcT(String name,int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(AbcT o) {
		if ((this.name).compareTo(o.name)<0) {
			return -1;
		}else if ((this.name).equals(o.name)) {
			return 0;
		}else {
			return 1;
		}
	}
	@Override
	public String toString() {

		return name+" "+age;
	}
}

public class ExTreeSetMethod3 {
	public static void main(String[] args) {
		TreeSet<Abc> aSet1=new TreeSet<>(new Comparator<Abc>() {
			public int compare(Abc o1, Abc o2) {
				if ((o1.name).compareTo(o2.name)<0) {
					return -1;
				}else if ((o1.name).equals(o2.name)) {
					return 0;
				}else {
					return 1;
				}
			}
		});
		
		Abc abc1=new Abc("이순신", 50);
		Abc abc2=new Abc("홍길동", 30);
		Abc abc3=new Abc("강감찬", 40);
		
		aSet1.add(abc1);
		aSet1.add(abc2);
		aSet1.add(abc3);
		
		System.out.println(aSet1);
		
		TreeSet<AbcT> aSet2=new TreeSet<>();
		
		AbcT abcT1=new AbcT("이순신", 50);
		AbcT abcT2=new AbcT("홍길동", 30);
		AbcT abcT3=new AbcT("강감찬", 40);
		
		aSet2.add(abcT1);
		aSet2.add(abcT2);
		aSet2.add(abcT3);
		
		System.out.println(aSet2);
		
		
		
		
	}
}
