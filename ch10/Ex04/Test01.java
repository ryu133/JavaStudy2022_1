package ch10.Ex04;
class Human{ //부모 클래스
	String name; //인스턴스 필드: 객체화 시켜야 사용 가능, 힙 영역에 저장
	int age;
	
	void eat() { //인스턴스 메소드: 객체화 시켜야 사용 가능, 힙에 주소값(pointer) 저장, 
									//클래스의 인스턴스 메소드 영역에 실제 메소드의 코드 저장
		System.out.println("사람이 먹습니다.");
	}
	void sleep() {
		System.out.println("사람이 잠을 잡니다.");
	}
}
class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println("student go to school");
	}
}
class Worker extends Human{
	int workerID;
	void goToCompany() {
		System.out.println("worker go to company");
	}
}
public class Test01 {
	public static void main(String[] args) {
		Human h=new Human(); //부모클래스
		h.name="hong gil dong";
		h.age=30;
		h.eat();
		h.sleep();
		
		Student s=new Student(); //자식클래스: 부모클래스의 필드와 메소드를 상속받음
		s.name="신사임당"; //부모
		s.age=40; //부모
		s.eat(); //부모
		s.sleep(); //부모
		s.studentID=1111; //자식
		s.goToSchool(); //자식
		
		Worker w=new Worker();
		w.name="bts"; //부모
		w.eat(); //부모
		w.workerID=2222; //자식
		w.goToCompany(); //자식
		
		Human h1=new Student(); //업캐스팅 : 자식 => 부모 타입으로 형변환
		
		h.name="이순신";
		h.eat();
		
		System.out.println(h1 instanceof Human); //true
		System.out.println(h1 instanceof Student); //true
		
		Student s1=(Student)h1; //다운캐스팅; 런타임 오류를 방지하기 위해 if (객체 instanceof 클래스)를 사용함
		
		if (h1 instanceof Student) {
			Student s2=(Student)h1;
			s2.studentID=3333;
			s2.goToSchool();
		}
		
		if (h1 instanceof Worker) {
			Worker w1=(Worker)h1; //instanceof를 쓰지 않는다면 컴파일 오류는 아니지만 런타임 오류 발생함
			
		}
		
		
		
		
		
	}
}
