package ch0607.Ex04;
//묵시적 this 키워드 자동 추가
//1. 클래스내부에서 필드, 메서드에 앞에 붙는 자동으로 붙는 this 키워드
//this 키는 자기 자신의 객체의 필드와 객체의 메소드를 지칭. 
class A{
	int m;
	int n;
//	A(){} //기본 생성자 생략됨
	void init(int a,int b) {
		int c; //a,b,c는 지역변수 (stack 영역에 변수명과 값을 저장). init() 메소드가 시작되면 스택 영역에 생성되고 메소드가 끝나면 사라짐
		c=3;
		this.m=a; //this. 생략 시 컴파일러가 자동으로 추가
		this.n=b; //this. 생략 시 컴파일러가 자동으로 추가
	}
	void work() {
		this.init(2,3); //this. 생략 시 컴파일러가 자동으로 추가
		System.out.println(this.m+" "+this.n); //this.는 생략 가능
	}
}
		
public class ThisKeyword1 {

	public static void main(String[] args) {
		//2 객체 생성
		A a=new A();
		//3 메소드 호출
		a.work();
	}

}
