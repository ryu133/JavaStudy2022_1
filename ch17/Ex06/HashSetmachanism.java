package ch17.Ex06;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//Set: 중복된 값을 넣을 수 없다.
	//equals(),hashCode() 정의되어 있어함
	//String,Integer 클래스들은 위의 메소드가 재정의 되어있다
	//특정 객체를 set에 저장할 경우 중복 저장을 하지 못하도록 하기 위해서는 equals(),hashCode()메소드를 재정의 해야 함 
	//Object 클래스의 equals(),hashCode()
		//Object 클래스의 equals() 는 ==과 같다. 
			//==은 Stack 메모리 값을 비교함

class A{
//equals(),hashCode()가 재정의 되지 않은 상태
	int data;
	public A(int data) {
		this.data=data;
	}
}

class B{ //두 개의 객체가 data 필드의 값이 같을 때, 동일하다고 식별자를 넣어야 함->equals(),hashCode()
	//equals()는 재정의, hashCode()는 재정의 되지 않은 상태
	int data;
	public B(int data) {
		this.data=data;
	}
	
	@Override
	public boolean equals(Object obj) { //객체의 주소를 비교하는 것이 아니라 객체 내부 특정 필드의 값을 비교하도록 설정
		if (obj instanceof B) { //obj가 B타입을 내포하고 있을 때만 다운캐스팅
			if(this.data==((B)obj).data) //주의: 잘못된 다운캐스팅을 할 경우 예외 발생  
				return true;
		}
		return false;
		
//		if (this == obj) //자동 입력이 넣어준 코드
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		B other = (B) obj;
//		return data == other.data;
	}
}

class C{
	int data;
	public C(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof C)
			if (this.data==((C)obj).data) {
				return true;
			}
		return false;
	}
	@Override
	public int hashCode() { //Objects.hash(필드명,필드명,필드명) 여러개의 필드의 해시코드를 동시에 같도록 설정
		return Objects.hash(data);
		//return data; //data 필드의 값이 같으면 hashCode를 동일하게 생성
	}
	
}

public class HashSetmachanism {
	public static void main(String[] args) {
		//1 equals(),hashCode()가 재정의 되지 않은 상태
		Set<A>hashSet1=new HashSet<>();
		A a1=new A(3);
		A a2=new A(3);
		System.out.println(a1==a2); //false
			//==은 Stack 메모리의 값을 비교함
		System.out.println(a1);//객체명 출력: 패키지명.클래스명@해시코드(힙 메모리 안에 주소값의 해시코드)(16진수)
		System.out.println(a2);
		System.out.println(a1.equals(a2)); //false ,Object equals()는 ==과 같다
		System.out.println(a1.hashCode()+", "+a2.hashCode()); //(10진수)
		
		hashSet1.add(a1); //set은 중복된 값을 넣지 못함
		hashSet1.add(a2);
		System.out.println(hashSet1.size()); //2  //equals(),hashCode()가 재정의 되지 않은 상태
		
		//equals()는 재정의(객체의 data 필드의 값을 비교)   , hashCode()는 재정의 되지 않은 상태
		Set<B>hashSet2=new HashSet<>();
		B b1=new B(3);
		B b2=new B(3);
		System.out.println(b1==b2); //stack 메모리의 값 비교   false
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.hashCode()+" "+b2.hashCode());
		
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size()); //equals()는 재정의, hashCode()는 재정의 되지 않은 상태
		
		//equals()는 재정의, hashCode()는 재정의 된 상태
		Set<C>hashSet3=new HashSet<>();
		C c1=new C(3);
		C c2=new C(3);
		System.out.println(c1==c2); //false, stack의 객체 주소를 비교
		System.out.println(c1.equals(c2)); //true, 객체의 data 필드의 값을 비교(재정의)
		System.out.println(c1.hashCode()+" "+c2.hashCode()); //data 필드를 기준으로 hashCode를 생성
			//두 객체는 동일한 객체임
		
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); //1 //equals(),hashCode() 재정의.  (data 필드에 대해서)
		
		
		
		
		
	}
}
