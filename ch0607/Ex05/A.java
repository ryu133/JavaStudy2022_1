package ch0607.Ex05;
	//접근 제어자(캡슐화: 데이터를 외부로부터 보호)
//		public, pritected, default(기본적으로 생략), private
//		클래스 이름,피등명, 메소드명, 생성자명 <<==접근 제어자가 반드시 할당됨
//		클래스 이름: public, default
public class A {
	int m=3; //필드의 기본 접근 제어자는 default가 생략됨
	int n=4; //default: 다른 패키지의 클래스에서는 접근 불가
				
	public int k=10; //public은 다른 패키지 내에서 접근 가능
	
	void print() { //default:같은 패키지 내의 클래스에서만 사용
		System.out.println("임포트 성공");
	}
	public void print2() {
		System.out.println("외부 패키지에 다른 클래스에서 접근 가능"+k);
	}
	
	public static void main(String[] args) {
		
	}
}
