package ch0607.Ex04;
//Aaa 클래스: 여러개의 생성자를 this(); 없이 생성할 경우 중복된 값을 매번 입력해야함
class Aaa{
	int m1,m2,m3,m4; //필드 4개 선언
	Aaa(){ //매개변수가 없는 생성자
		m1=1; m2=2; m3=3; m4=4; //초기값 할당
	}
	Aaa(int a){
		m1=a; m2=2; m3=3; m4=4;
	}
	Aaa(int a, int b){
		m1=a; m2=b; m3=3; m4=4;
	}
	void print() {//각 메모리의 값을 출력
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);	
		System.out.println();
	}
}
//Bbb 클래스: 여러개의 생성자를 this();를 사용하여 생성할 경우 중복된 값 제거 가능
class Bbb{
	int m1,m2,m3,m4; //필드 4개 선언
	Bbb(){
		m1=1; m2=2; m3=3; m4=4;
	}
	Bbb(int a){
		this(); //매개변수가 없는 생성자 호출
		m1=a;
	}
	Bbb(int a,int b){
		this(a);
		m2=b;
	}
	void print() {//각 메모리의 값을 출력
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);	
		System.out.println();
	}
}

public class ThisMethod2 {
	public static void main(String[] args) {
		//객체 생성 (this 미사용)
		Aaa aaa1=new Aaa(); //매개변수가 없는 생성자 호출
		Aaa aaa2=new Aaa(10); //매개변수가 1개인 생성자 호출
		Aaa aaa3=new Aaa(10,20); //매개변수가 2개인 생성자 호출
		aaa1.print();
		aaa2.print();
		aaa3.print();
		
		System.out.println("==========");
		
		//객체 생성 (this 사용)
		Bbb bbb1=new Bbb();
		Bbb bbb2=new Bbb(10);
		Bbb bbb3=new Bbb(10,20);
		bbb1.print();
		bbb2.print();
		bbb3.print();
		
	}
}
