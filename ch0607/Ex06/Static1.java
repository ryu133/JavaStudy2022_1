package ch0607.Ex06;
class Aaa{
	int m=3; //인스턴스 필드 : 객체를 생성 후에 사용 가능
	static int n=4; //static 필드 : 객체 생성없이 사용 가능. 객체 생성 후에도 사용 가능(모든 객체가 공유하는 변수)
	
	void print1() { //메소드(인스턴스 메소드): 객체를 생성 후 호출 가능
		System.out.println("인스턴스 메소드 출력 m: "+m+", n:"+n);
	}
	static void print2() { //메소드 (static 메소드): 객체를 생성없이 호출 가능 , 객체 생성 후에도 호출 가능
		//static 메소드 내에서는 인스턴스 필드가 올 수 없다
		System.out.println("static 메소드 출력 "+"n:"+n);
	}

}
public class Static1 {

	public static void main(String[] args) {
		//1. 객체 생성 후 필드와 메소드 호출(인스턴스 필드, 인스턴스 메소드, static 메소드)모두 호출
		Aaa aaa=new Aaa();
		aaa.m=10; //인스턴스 필드 호출
		aaa.n=20; //static 필드 호출
		aaa.print1(); //인스턴스 메소드
		aaa.print2(); //static 메소드
		
		//2. 객체 생성없이 클래스명으로 필드와 메소드 호출(static 필드와 static 메소드만 호출 가능)
		Aaa.n=100; //static 필드
		Aaa.print2(); //static 메소드
		
		Aaa bbb=new Aaa();
		System.out.println(bbb.n); //100
		
		Aaa ccc =new Aaa();
		System.out.println(ccc.n); //100
		
		Aaa ddd =new Aaa();
		System.out.println(ddd.n); //100
		
		Aaa eee=new Aaa();
		System.out.println(eee.n);
		
		eee.n=300;
		System.out.println("===static 필드가 적용된 필드는 모든 객체에서 공통으로 바라보는 변수===");
		
		System.out.println(aaa.n);
		System.out.println(bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
		
	}

}
