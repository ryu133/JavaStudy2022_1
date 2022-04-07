package ch12.Ex04;
//인터페이스 상속 시 자식 클래스 접근 지정자 오류 !중요
//인터페이스의 메소드를 구현할 때 반드시 public 사용
interface A{
	public abstract void abc();
}
interface B{
	void abc(); //public abstract 생략됨
}
class C implements A{
	public void abc() { //A 인터페이스의 abc()를 오버라이딩해서 구현한 메소드
					//자식은 부모보다 접근 지정자가 같거나 더 넓어야 함
	}
}
class D implements B{
	public void abc() { //인터페이스의 메소드를 구현할 때는 반드시 public 넣어야 함
		
	}
}
class E implements B{
	@Override
	public void abc() {
		
	}
}
//class F implements A{ //F class는 완성된 메소드 구현 필요
//	
//}
public class Interface4 {
	public static void main(String[] args) {
		
	}
}
