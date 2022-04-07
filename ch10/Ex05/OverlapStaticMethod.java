package ch10.Ex05;
class AAAA{ //static 메소드 오버라이딩 불가
	static void print() {
		System.out.println("AAAA class");
	}
}
class BBBB extends AAAA{
	static void print() {
		System.out.println("BBBB class");
	}
}
public class OverlapStaticMethod {
	public static void main(String[] args) {
		//1 객체 생성 없이 호출
	
		
		//2 객체 생성 후 호출
		AAAA aaaa=new AAAA();
		aaaa.print(); //A class
		BBBB bbbb=new BBBB();
		bbbb.print(); //B
		AAAA aabb=new BBBB();
		aabb.print(); //A
		
	}
}
