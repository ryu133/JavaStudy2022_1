package ch10.Ex07.Ex04;
class A{
	String name;
	A(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
public class StringEx {
	public static void main(String[] args) {
		String s0=new String("안녕");
		String s1="안녕"; //참조 변수
		
		System.out.println(s0); //string은 객체를 출력할 때 tostring()가 재정의 되어있음
		System.out.println(s1);
		
		A a=new A("안녕");
		System.out.println(a);
		
		
	}
}
