package ch10.Ex03;
//instanceof: 객체 내부의 캐스팅이 가능 여부를 알 수 있도록 하는 키워드
//업캐스팅한 객체 내부에 어떤 타입이 존재하는 지 true, false로 리턴
//다운캐스팅 시 런타임 오류가 발생될 수 있다, 런타임 오류를 방지시켜준다
//다운캐스팅 시 해당 타입이 객체에 존재할 때만 다운캐스팅 하도록 설정하는 조건문을 쓸 수 있따

class A{
	int m;
	void a() {
		System.out.println(m);
	}
}
class B extends A{
	int n;
	void b() {
		System.out.println(n);
	}
}
public class InstanceOf {
	public static void main(String[] args) {
		//1 instanceof : 객체명 instanceof 타입(클래스)
		A aa=new A();//aa는 a타입만 가진다
		A ab=new B();//ab는 ab 포함 a만 사용가능
		
		System.out.println(aa instanceof A);//true
		System.out.println(ab instanceof A );//true
		System.out.println(aa instanceof B);//false
		System.out.println(ab instanceof B );//true
		
		if (aa instanceof B) {//aa객체에 B타입이 포함되어있을 경우에만 캐스팅함
			B b=(B)aa;//런타임 오류를 방지하기 위함
			System.out.println("aa를 b로 캐스팅 함");
		}else {
			System.out.println("aa는 b타입으로 캐스팅 불가");
		}
		if (ab instanceof B) {//ab객체에 B타입이 존재하는 경우에만 캐스팅함
			B b=(B)ab;
			System.out.println("ab를 b타입으로 캐스팅 함");
		}else {
			System.out.println("ab는 b타입으로 캐스팅 불가");
		}
		if ("안녕" instanceof String) {//객체의 데이터 타입을 확인
			System.out.println("\"안녕\"은 String 클래스입니다.");
		}else {
			System.out.println("\"안녕\"은 String 클래스가 아닙니다.");
		}
	}
}
