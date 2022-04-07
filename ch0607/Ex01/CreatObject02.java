package ch0607.Ex01;

class Aaa{
	String name; //필드: 객체화 시켜야 사용 가능, 클래스 블럭에서 선언
	int age; //필드의 값들은 힙 영역에 저장, 힙 영역의 변수의 값들은 강제 초기화
	double weight;
	String email; //필드는 선언만되고 값이 할당되지 않는 경우:
	boolean man; //참조변수: null, int: 0, double: 0.0, boolean: false
	
	public String getName() {
		return name;
	}
	public void setName(String name) {//인풋되는 변수, 받는 변수 이름, 메모리 이름이 모두 동일한 경우 this 사용
		this.name = name; //메모리 이름에 this: 자신의 클래스의 변수
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean getMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	
	
}

public class CreatObject02 {

	public static void main(String[] args) {
		Aaa aaa=new Aaa(); //객체 생성(aaa)
		//필드의 초기값을 출력 (힙 영역은 강제 초기화됨)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		
		//변수의 값을 직접 대입(보안상 메모리에 직접 값을 할당하는 것은 좋지 않음. 캡슐화 해야함)
		aaa.name="홍길동";
		aaa.age=30;
		aaa.weight=70.5;
		aaa.man=true;
		aaa.email="aaa@aaaa.com";
		
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.email);
		System.out.println(aaa.man);
		
		//setter를 통해서 값을 대입, 메모리에 값을 넣을 때 제어를 할 수 있다
		//달을 저장하는 변수(1~12)가 있을 때 13을 넣지 못하게 할 수 있음
		aaa.setName("dd");
		aaa.setAge(60);
		aaa.setEmail("eas@gag.vclvk");
		aaa.setMan(true);
		aaa.setWeight(70.5);
		
		//getter 메소드를 통해서 메모리의 값을 출력
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getWeight());
		
		//하나의 클래스에서 여려개의 객체를 생성 및 사용
		Aaa bbb=new Aaa();
		Aaa ccc=new Aaa();
		Aaa ddd=new Aaa();
		
		
	}

}
