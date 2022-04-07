package ch10.Ex02;
class Aa{
	int m;
	void abc() {
		System.out.println("부모");
	}
}
class Bb extends Aa{
	int n;
	void bcd() {
		System.out.println("자식");
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		//타입캐스팅을 하지 않는 경우
		Bb bb=new Bb(); //bb는 aa,bb 포함 aa,bb의 필드와 메소드 접근 가능 
		bb.m=10;//부모
		bb.n=20;//자식
		bb.abc();//부모
		bb.bcd();//자식
		
		//업캐스팅:자식->부모  
		Aa aa=new Bb();
		aa.m=100;
//		aa.n=200;
		
		Bb bb1=(Bb)aa;//aa->bb 다운캐스팅
	}
}
