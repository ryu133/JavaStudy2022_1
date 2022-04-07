package ch10.Ex05;
class AA{ //부모 클래스
	int m=3; //인스턴스 필드
	void print() {
		System.out.println("AA class");
	}
}
class BB extends AA{
	int m=4; //인스턴스 필드
	@Override
	void print() {
		System.out.println("BB class");
	}
}
class CC extends AA{
	int m=5; //인스턴스 필드
	@Override
	void print() {
		System.out.println("CC claass");
	}
}
public class OverlapInstanceField {
	public static void main(String[] args) {
		//1 객체 생썽
		AA aa=new AA();
		
		BB bb=new BB();
		AA ab=new BB();
		
		CC cc=new CC();
		AA ac=new CC();
		
		//2 인스턴스 필드 출력 : 인스턴스 필드는 오버라이딩 불가
		System.out.println(aa.m); //3 
		System.out.println(bb.m); //4
		System.out.println(ab.m); //3
		System.out.println(cc.m); //5
		System.out.println(ac.m); //3
		
	}
}
