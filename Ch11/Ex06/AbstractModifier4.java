package Ch11.Ex06;
abstract class Animal{ //추상 클래스 : 추상 메소드가 하나 이상 포함되어있는 겅우, 객체 생성 불가, 타입은 사용 가능
						//자식 클래스는 부모 클래스의 메소드를 구현 시 오류를 방지
						//추상 클래스는 추상 클래스 내의 추상메소드를 자식 클래스에서 반드시 구현하도록 보장받음
	String name;
	int age;
	
	abstract void cry(); //추상 메소드 : 구현부가 없는 메소드
//	void cry(){} //일반 메소드 : 리턴타입 메소드이름 (입력매개변수) {구현코드}
	abstract void run();
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}
class Cat extends Animal{ //abstract 메소드를 일부만 상속할 경우 abstract 클래스가 됨
							//추상 메소드를 모두 구현한 경우는 콘크리트(완전히 구현됨) 클래스가 됨
	Cat(String name,int age){
		this.name=name;
		this.age=age;
	}
	@Override
	void cry() {
//		System.out.println(name+"의 나이 : "+age);
		System.out.println("야옹");
	}
	@Override
	void run() {
		System.out.println("11달리기");
	}
}
class Tiger extends Animal{
	Tiger(String name,int age){
		this.name=name;
		this.age=age;
		}
	@Override
	void cry() {
//		System.out.println(name+"의 나이 : "+age);
		System.out.println("어흥");
	}
	@Override
	void run() {
		System.out.println("22달리기");
	}
}
class Eagle extends Animal{
	Eagle(String name,int age){
		this.name=name;
		this.age=age;
		}
	@Override
	void cry() {
//		System.out.println(name+"의 나이 : "+age);
		System.out.println("까악");
	}
	@Override
	void run() {
		System.out.println("33날기");
	}
}
public class AbstractModifier4 {
	public static void main(String[] args) {
		Animal a1=new Cat("고양이",10);
		Animal a2=new Tiger("호랑이",5);
		Animal a3=new Eagle("독수리",15);
		
		//animal 배열 객체에 저장 후 for문과 enhanced for문을 사용해 객체 출력. cry(), run()
		Animal[] arr= {a1,a2,a3};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			arr[i].cry();
			arr[i].run();
			System.out.println();
		}
		for (Animal k : arr) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println();
		}
		
	}
}
