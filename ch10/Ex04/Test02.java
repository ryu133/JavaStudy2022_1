package ch10.Ex04;
class Animal3{	//모든 클래스는 Object 클래스를 상속함
	String name;
	int age;
	void cry() {
		System.out.println("animal cry");
	}
	@Override //Object.toString 메소드는 객체 자체를 출력할 때 호출됨
	public String toString() { //객체의 주소 출력. [패키지명.클래스명@객체의 메모리의 해시코드]
		return "이름은 : "+name+", 나이는 : "+age+"입니다.";
	}
}
class Tiger3 extends Animal3{
	Tiger3(){} //기본 생성자 : 변수의 초기화 값을 할당하지 않고 초기화.  다른 생성자가 객체 내에 존재할 시 기본생성자를 외부에서 호출 시 생략하면 안됨.
	Tiger3(String a, int b) { //Tiger3 생성자: 클래스명과 동일, 리턴 타입 없음  객체를 생성해서 메모리의 초기값을 할당할 때 사용
		super.name=a; //super: 부모(super)클래스를 부를 때 사용
		super.age=b; //this: 자기 자신의 객체
	}
	@Override
	void cry() {
//		super.cry(); //super : 부모클래스를 뜻함, 상속관계일 때 부모클래스
		System.out.println("호랑이는 어흥하고 웁니다.");
	}
}
class Cat3 extends Animal3{
	Cat3(){}
	Cat3(String a, int b){
		super.name=a;
		super.age=b;
	}
	@Override
	void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("고양이는 야옹하고 웁니다.");
	}
}
class Dog3 extends Animal3{
	Dog3(){}
	Dog3(String a, int b){
		super.name=a;
		super.age=b;
	}
	@Override
	void cry() {
		System.out.println("개는 멍멍하고 웁니다.");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Animal3 a3=new Animal3();//a3 객체 생성
		
		System.out.println(a3); //객체 자체를 출력할 경우, Object 클래스의 toString() 호출됨
									//Object.toString() :객체의 메모리 주소의 해시코드를 출력 [패키지명.클래스명@객체의 메모리의 해시코드]
		System.out.println(a3.toString());
		
		System.out.println("=======================");
		//객체 자체를 출력하면 객체의 Object class의 toString 메소드를 호출
		
		Tiger3 t3=new Tiger3(); //Tiger3를 Animal3로  업캐스팅
		Animal3 c3=new  Cat3(); //Cat3를 Animal3로 업캐스팅
		Animal3 d3=new Dog3();
		
		t3.cry(); //부모 cry()를 호출할 경우 오버라이딩된 Tiger3의 cry()를 호출
		c3.cry(); //부모 cry()를 호출할 경우 오버라이딩된 Cat의 cry()를 호출
		d3.cry(); //부모 cry()를 호출할 경우 오버라이딩된 Dog의 cry()를 호출
		
		System.out.println("========================");
		
		Animal3[] arr= {t3,c3,d3};
		for (int i = 0; i < arr.length; i++) {
			arr[i].cry();
		}
		
		System.out.println("========================");
		
		for (Animal3 k : arr) {
			k.cry();
		}
		System.out.println("=======================");
		
		Animal3 aa3=new Tiger3("호랑이",5);
		Animal3 cc3=new Cat3("고양이",3);
		Animal3 dd3=new Dog3("개",10);
		
		System.out.println(aa3); //객체 자체를 출력 시 기본적으로는 객체의 메모리 해시코드가 출력
		System.out.println(cc3); //Object 의 toString() 메소드를 재정의
		System.out.println(dd3);
		
		Animal3[] arr2= {aa3,cc3,dd3};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=========================");
		
		for (Animal3 k : arr2) {
			System.out.println(k);
		}
		
	}
}
