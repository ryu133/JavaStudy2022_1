package ch12.Ex05;
//1 객체 생성
//2 익명 클래스

//interface 선언 : 기업의 최고 프로그래머가 함(PM)
interface A{
	double PI=3.14; //public static final
	void run(); //public abstract
}
class B implements A{
	@Override
	public void run() { //public 필수
		System.out.println("달린다");
	}
}
public class Interface5 {
	public static void main(String[] args) {
		//1 객체 생성
		A a1=new B();
		a1.run();
		
		//2 익명 클래스
		A a2=new A() {
			@Override
			public void run() {
				System.out.println("난다");
			}
		};
		a2.run();
	}
}
