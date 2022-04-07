package Ex;

import java.util.Objects;

class E extends Object{//자바의 모든 클래스는 object의 자식 클래스이다.
						//object 클래스에 정의된 메소드를 사용할 수 있다.
	String name;
	E(){} //기본 생성자: 클래스 내에 다른 생성자가 존재할 때 외부에서 기본생성자를 호출할 때 생략되면 안됨
	E(String name){
		this.name=name; //매개변수 이름, 구현부에서 매개변수를 받는 변수명, 필드의 변수명이 모두 동일할 경우
	}					//this: 자식의 객체
	@Override
	public String toString() { //객체 자체를 출력할 때 toString() 호출됨
		return "이름 : " + name + " "; //this.name
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) { //업캐스팅 더ㅣㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁㅁ
		if (this.name == ((E)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
class Student2{
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student2(int studentID,String name,int kor, int eng){
		this.studentID=studentID;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.studentID==((Student2)obj).studentID) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return studentID+", "+name+", "+kor+", "+eng;
	}
}
public class Quiz04 {
	public static void main(String[] args) {
		Student2 s1=new Student2(111,"a",88,85);
		Student2 s2=new Student2(222,"b",89,87);
		Student2 s3=new Student2(333,"c",87,88);
		Student2 s4=new Student2(111,"d",86,89);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		//studentID 가 같은 경우 "같은 학생입니다." 출력
		//== : 기본타입(boolean, byte, shot, int, long, double, float, char)  8
		//equals() : 참조타입(배열, 객체, string)
		
		//object의 toString(),equals()를 재정의
				// : 객체의 주소를 비교. 재정의해서 객체 내의 특정 필드의 값을 비교
		//toString():객체 자체를 출력 시 주소값 출력됨 패키지명.클래스명@해쉬코드
				//오버라이딩해서 객체의 필드 정보 출력
		//
//		System.out.println(s1.equals(s4)); //true
		if (s1.equals(s4)) {
			System.out.println("같은 학생입니다.");
			
		}else {
			System.out.println("다른 학생입니다.");
			
		}
		
		
		E e1=new E(); //기본생성자 호출: 힙의 필드의 값은 강제 초기화됨
		System.out.println(e1.name); //null
		E e2=new E("고양이");
		System.out.println(e2.name);
		E e3=new E("고양이");
		System.out.println(e2==e3); //참조타입의 ==는 객체의 주소 비교
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3)); //equals() 객체의 주소 비교
		//object의 toString(),equals()는 재정의해서 사용
		
		
		
	}

}
