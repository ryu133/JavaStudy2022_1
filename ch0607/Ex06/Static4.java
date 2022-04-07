package ch0607.Ex06;

class Cde{
	//인스턴스 필드: 객체화해야 사용 가능
	String name;
	int age;
	
	//정적 필드: 객체화 필요없음(클래스명.필드명), 객체 생성 후 사용 가능
	static String email;
	static int num;
}

public class Static4 {
	public static void main(String[] args) {
		Cde cde1=new Cde(); //객체화
		cde1.name="홍길동";
		cde1.age=10;
		
		cde1.email="aaa@aaa.com";
		cde1.num=4;
		
		//static 필드 호출: 클래스명으로 호출 가능. 모든 객체들이 공유함
		Cde.email="cde@ccd.com";
		Cde.num=3;
		
		Cde cde2=new Cde();
		Cde cde3=new Cde();
		Cde cde4=new Cde();
		
		//인스턴스 필드: 힙 영역에 저장. 각 객체에서 공유되지 않는 고유한 값을 가짐다
		
		cde2.name="김유신";
		cde2.age=50;
		
		cde3.name="세종대황";
		cde3.age=60;
		
		cde4.name="신사임당";
		cde4.age=50;
		
		//인스턴스 필드 값 출력
		System.out.println(cde2.name+", "+cde2.age);
		System.out.println(cde3.name+", "+cde3.age);
		System.out.println(cde4.name+", "+cde4.age);
		
		//정적 필드 을 변경하는 모든 객체에 대해서 모두 변경
		cde2.email="kkk@kkk.com";
		cde2.num=55;
		
		System.out.println(cde2.email+", "+cde2.num);
		System.out.println(cde3.email+", "+cde3.num);
		System.out.println(cde4.email+", "+cde4.num);
		
	}
}
