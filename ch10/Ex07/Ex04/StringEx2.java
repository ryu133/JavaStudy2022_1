package ch10.Ex07.Ex04;
class AA{
	String name;
	AA(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	public boolean equals(Object obj) {
		if (this.name==((AA)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}
class BB{
	String name;
	BB(String name){
		this.name=name;
	}
	@Override
	public String toString() { //패키지명.클래스명@해시코드 ==> name 필드의 값을 리턴
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name==((BB)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}
public class StringEx2 {
	public static void main(String[] args) {
		String s1=new String("안녕");
		String s2="안녕"; //참조 변수
		
		System.out.println(s1); //string 클래스는 tostring()가 재정의 되어있음
		System.out.println(s2);//string 클래스느느  equals() 재정의 ㅣ되이ㅓ있다
		//값을 비교하도록 재정의
		AA aa1=new AA("안녕");
		AA aa2=new AA("안녕");
		
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));
		//객체 주소를 비교하기 떄문 이퀄 ㅁㅁ1 ㅁㅁ2
		
		BB bb1=new BB("안녕");
		BB bb2=new BB("안녕");
		
		System.out.println(bb1);
		
		
		
	}
}
