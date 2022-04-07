package ch0607.Ex02;
//메소드 오버로딩: 하나의 메소드 영역에 매개변수의 타입, 개수에 따라서 각각 다른 메소드가 호출됨 (Java)
//메소드 오버라이딩: 상속에서 부모 클래스의 메소드를 재정의해서 사용

//같은 패키지 안에 같은 이름의 클래스 중복하여 쓸 수 없음
	

//다양한 타입의 메소드 형식(리턴 타입이 있는 경우(int, double, String...), 리턴 타입이 없는 경우(void)
public class ExternalCalMethods {
	public static void main(String[] args) {
		A a=new A();
		
		a.print();
		int k=a.data();
		System.out.println(k);
		double result=a.sum(3, 5.2);
		System.out.println(result);
		a.printMethod(5);
		a.printMethod(25);
		
		//주의! 출력구문에 호출 가능한 메소드(return이 있는 메소드)
		System.out.println(a.data());
//		System.out.println(a.print()); //오류 발생
		a.print();
		System.out.println(a.sum(4, 10.5));
//		System.out.println(a.printMethod(1)); //오류 발생
		
		a.printMethod(a.data());
	}
}
