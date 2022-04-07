package ch10.Ex01;

class StudentSub extends Student{
	//studentsub는 student의 필드와 메소드를 상속받는다.
	//student는 person의 필드와 메소드를 상속받는다.
	//studentsub는 person과 student의 필드와 메소드를 모두 상속받는다.
	String sub1;
	
	void sub1() {
		System.out.println("studentsub 클래스의 sub1 메소드 호출");
	}
}

class Student extends Person{ //자식 extends 부모
	//자식 클래스는 부모 클래스의 필드, 메소드, 이너클래스를 그대로 상속받음
	int studentID;
	void goToSchool() {
		System.out.println("자식 클래스의 Student 메소드 goToSchool 호출");
	}
}

class Worker extends Person{ //직장인 클래스
	int workerID;
	void goToWork () {
		System.out.println("자식 클래스의 Worker 메소드 goToWork 호출");
	}
}

public class Person { //상속: 부모 클래스의 필드, 메소드, 내부클래스를 자식 클래스에게 상속
	String name; //상속의 이점 1. 중복된 코드 제거(코드 재사용) 2. 간결한 코드 3. 다형성(메소드 오버라이딩): 하나의 메소드명에서 재정의 
	int age;
	
	void eat() {
		System.out.println("부모 클래스의 eat() 메소드");
	}
	void sleep() {
		System.out.println("부모 클래스의 sleep() 메소드");
	}

	public static void main(String[] args) {
		//#1. Person 객체 (필드2개, 메서드2개)
		Person p = new Person();
		p.name="홍길동";
		p.age=12;
		p.eat();
		p.sleep();
		
		//#2. Student 객체
		Student s = new Student(); //Person 클래스를 상속, Person 클래스의 필드와 메소드를 사용
		//자식 클래스는 부모 클래스의 선언된 필드와 메소드를 사용
		//Person class Field
		s.name="이순신";
		s.age=50;
		
		//Student class Field
		s.studentID=20220310;
		
		//Person class method
		s.eat();
		s.sleep();
		
		//Student class method
		s.goToSchool();

		//#3. Worker 객체 
		Worker w = new Worker(); //Person 클래스를 상속한다. Person 클래스의 필드와 메소드 사용
		
		//부모 클래스의 필드
		w.name="세종대왕";
		w.age=60;
		
		//자식 클래스의 필드
		w.workerID=20220311;
		
		//Person class method
		w.eat();
		w.sleep();
		
		//Student class method
		w.goToWork();
		
		System.out.println("======객체 생성 시 타입 변환=====");
		
		Person p1=new Person(); //Person은 Person이다. (자식은 부모다)
		Person ps=new Student(); //업캐스팅, student는 person이다.
//		Student sp=new Person(); //Person은 student이다. (x) 오류
		Person pw=new Worker();//업캐스팅 worker는 person이다(o)
//		Worker wp=new Person();//person은 worker이다(x)
		
			System.out.println("====Person < Student < StudentSub====");
			StudentSub sub1=new StudentSub(); //가능
			//클래스 타입  객체명 = new  자식 클래스
			
			//person 클래스의 필드와 메소드 사용 가능
			sub1.name="신사임당";
			sub1.age=50;
			sub1.eat();
			sub1.sleep();
			//student 클래스에 있는 필드와 메소드
			sub1.studentID=20220310;
			sub1.goToSchool();
			//studentSub의 필드와 메소드
			sub1.sub1="자식의 자식 클래스";
			sub1.sub1();
		
			
		Person ps1=new StudentSub(); // 업캐스팅  studentsub 객체를 생성 시 부모 데이터 타입으로 형변환
		//studentsub는 person 데이터 타입으로 업캐스팅, person 클래스의 멤버만 사용 가능
		ps1.name="bts"; //person클래스의 필드와 메소드만 접근 
		ps1.age=30;
		ps1.eat();
		ps1.sleep();
		
		Student ss1=new StudentSub(); // 업캐스팅: studentsub를 student 타입으로 업캐스팅
		//person과 student 의 필드와 메소드를 사용 가능
		//person의 필드와 메소드
		ss1.name="ses";
		ss1.age=30;
		ss1.eat();
		ss1.sleep();
		//student 의 필드와 메소드
		ss1.studentID=20220310;
		ss1.goToSchool();
		
		StudentSub ss2=new StudentSub(); //person, student, studentsub의 필드와 메소드 모두 사용 가능
		//person클래스의 필드와 메소드
		ss2.name="봄여름가을겨울";
		ss2.age=40;
		ss2.eat();
		ss2.sleep();
		//student클래스의 필드와 메소드
		ss2.studentID=20220310;
		ss2.goToSchool();
		//studentsub 클래스의 필드와 메소드
		ss2.sub1="자식자식";
		ss2.sub1();
		
		
		//상속 관계에서 객체 생성 시 부모 테이터 타입으로 업캨스팅 가능
		//부모 데이터 타입으로 업캐스팅 된 경우 부모의 필드와 메소드 접근 가능
		
		//person <== student <== studentsub
		Person ps4=new Student();
		//studentsub 객체 생성 시 person 타입으로 업캐스팅(자동 변환)
		//studentsub는 person과 student와 studentsub의 모든 필드와 메소드를 포함하고 있다.
		//그 중 person 클래스의 필드와 메소드만 접근 가능
		
		Student ss4=new StudentSub();
		//studentsub 객체 생성 시 student 타입으로 업캐스팅
		//studentsub는 person과 student와 studentsub의 모든 필드와 메소드를 포함하고 있다.
		//그 중 person,student 클래스의 필드와 메소드 접근 가능
		
		StudentSub ss5=new StudentSub();
		//studentsub는 studentsub의 필드와 메소드를 포함하고 있다.
		//그 중 person,student, studentsub 클래스의 필드와 메소드 접근 가능
		
		//다운 캐스팅: 부모 데이터 타입으로 업캐스팅 된 것을 자식 데이터 타입으로 변환하는 것(수동 변환)
		
		Student ps5=(Student)ps4; //ps4(person, student, studentsub) 의 데이터 타입: person
		//ps5는 person, student의 필드와 메소드 접근 가능
		ps5.name="다운캐스팅";
		ps5.age=30;
		ps5.studentID=20220310; //student 필드와 메소드 사용 가능
		ps5.goToSchool(); //student의 메소드
		
		StudentSub ps6=(StudentSub)ps4;// ps4는 person 데이터 타입에서 studentsub로 다운캐스팅
		//studentsub로 다운캐스팅됨(person,student,studentsub의 필드와 메서드 사용 가능)
		ps6.name="이용식";
		ps6.age=30;
		ps6.studentID=20220310; //student
		ps6.sub1="자식의 자식"; //student
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
