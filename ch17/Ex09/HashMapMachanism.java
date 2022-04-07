package ch17.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//일반(수제) 객체를 map에 넣으려면
//Map: key는 중복되지 않아야함. equals(), hashCode() 재정의 필요
	//value는 중복 상관없음.

//equals(), hashCode() 재정의 안함
class A{
	int data;
	public A(int data) {
		this.data=data;
	}
	@Override
	public String toString() {
		
		return data+" ";
	}
}

//equals() 재정의, hashCode() 재정의 안함
class B{
	int data;
	public B(int data) {
		this.data=data;
	}
	
	//객체의 필드의 값을 비교해서 같은지 확인
	@Override
	public boolean equals(Object obj) { //obj는 Object 타입
		if (obj instanceof B) { //obj가 B타입을 내포할 때 true
			this.data=((B)obj).data; //B타입으로 obj를 다운캐스팅함
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		
		return data+" ";
	}
}

//equals(), hashCode() 재정의
class C{
	int data;
	public C(int data) {
		this.data=data;
	}
	//객체의 필드의 값을 비교해서 같은지 확인
	@Override
	public boolean equals(Object obj) { //obj는 Object 타입
		if (obj instanceof C) { //obj가 C타입을 내포할 때 true
			this.data=((C)obj).data; //C타입으로 obj를 다운캐스팅함
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(data);
//		return data;
	}
	@Override
	public String toString() {
		
		return data+" ";
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		//1 두 메소드 모두 오버라이딩하지 않는 경우, 두 객체 모두 Map의 key로 등록됨.
		Map<A, String>hashMap1=new HashMap<>();
		
		A a1=new A(3);
		A a2=new A(3);
		
		System.out.println(a1==a2); //stack 주소 비교.  false
		System.out.println(a1.equals(a2)); //==와 같음.  false
		
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		
		System.out.println(hashMap1.size());
		System.out.println(hashMap1);
		System.out.println();
	
		//2 equals()만 오버라이딩 된 경우
		Map<B, String>hashMap2=new HashMap<>();
		
		B b1=new B(3);
		B b2=new B(3);
	
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true
		
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, "두번째");
	
		System.out.println(hashMap2.size());
		System.out.println(hashMap2);
	
		//3 모두 오버라이딩 된 경우
		Map<C, String> hashMap3=new HashMap<>();
		C c1=new C(3);
		C c2=new C(3);
		
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.hashCode()+" "+c2.hashCode()); //34 (10진수)
		
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		
		System.out.println(hashMap3.size());
		System.out.println(hashMap3); //22 (16진수)
		
		
		
		
		
	}

}
