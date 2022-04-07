package ch0607.Ex01;

class AA{
	String name; //필드(멤버). 인스턴스화 시켜야 사용 가능 (heap 영역에 저장)
	int age;
	String email;
	
	AA(){} //기본 생성자, 생략 가능. 다른 생성자가 존재할 경우 생략 불가(오류 발생)
	
	public String getName() { //메서드(멤버). 인스턴스화 시켜야 사용 가능 (heap 영역 주소만 저장. 다른 건 클래스 영역 내의 메서드 영역에 저장)
		return name; //return: 메서드를 호출하는 곳으로 변수의 값을 반환한다
	}
	public void setName(String name) { //void는 리턴값이 없다는 것을 알려주는 식별자
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
public class CreatObject {

	public static void main(String[] args) {
		AA aa=new AA(); 
		//AA: 클래스 이름. aa: 객체명(인스턴스명). new: heap 영역에 필드와 메서드
		//AA(): 생성자, 객체의 필드값을 초기화. 생성자도 하나의 메서드
		//생성자 이름이 클래스 이름과 동일 메서드
		//리턴타입이 없음
		//새엇ㅇ자 주 ㅇ매개변수가 없는 생성자를 기본 생성자
		//기본생 성자는 생략 가능
		//객체를 생성할 때 반ㅅㅡ드시 생성자 호출
		
		
		//객체의 메서드 호출
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		//객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//setters: 객체의 메모리에 값을 할당할 때 
		//getters: 객체의 메모리의 값을 가져올 때
		aa.setName("홍길동"); //객체의 변수에 값을 할당
		aa.setAge(323);
		aa.setEmail("wwerd@asdfc.com");
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		AA bb=new AA();
		bb.setName("김유신");
		bb.setAge(50);
		bb.setEmail("bb@bbb.com");
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		AA cc=new AA();
		cc.setName("신사임당");
		cc.setAge(40);
		cc.setEmail("ccc@cc.com");
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
		
	}

}
