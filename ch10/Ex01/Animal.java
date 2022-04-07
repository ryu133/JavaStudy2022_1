package ch10.Ex01;

class DogSub extends Dog{
	int dogsub;
	void dogsub() {
		System.out.println("Dog의 자식 클래스입니다.");
	}
}
class Tiger extends Animal{
	int leg;
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
}
class Dog extends Animal{
	int dog;
	void dogEat() {
		System.out.println("개는 잡식성입니다.");
	}
}

class Egle extends Animal{
	int egle;
	void egleFly() {
		System.out.println("독수리는 날아다닙니다.");
	}
}

public class Animal {
	
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
	public static void main(String[] args) {
		//업캐스팅은 다형성으로 처리하기때문에 아주 효율적으로 프로그래밍 처리 가능
		//다형성: 오버라이딩-상속된 하나의 재정의 가능한 메소드-으로 여러 정보를 처리할 수 있음
		
		//1 animal class 객체화
		Animal a1=new Animal();
		
		//2 dog class 객체화
		Dog d1=new Dog(); //animal, dog의 필드와 메소드 접근 가능
		
		//3 dog class 를 animal 타입으로 업캐스팅
		Animal a2=new Dog(); //a2는 animal,dog 내포, animal의 필드와 메소드 접근 가능
		
		//4 dogsub class를 animal 타입으로 업캐스팅
		Animal a3=new DogSub(); //a3는 animal,dog,dogsub 내포, animal 필드와 메소드 접근 가능
		a3.name="말티즈"; //animal field
//		a3.dog=1; //dog field 접근 불가
		
		//5 dogsub class를 dog 타입으로 업캐스팅
		Dog d2=new DogSub(); //d2는 animal,dog,dogsub 내포,   animal,dog의 필드와 메소드 접근 가능
		d2.name="셰퍼드"; //animal field
		d2.dog=5; //dog field
//		d2.dogsub=3; //dogsub는 접근 불가
		
		//animal <== dog <== dogsub
		//6 dogsub를 dogsub 데이터 타입으로 객체화
		DogSub ds1=new DogSub();
		//ds1은 animal,dog,dogsub 중에 animal,dog,dogsub 필드와 메소드 모두 접근 가능
		ds1.name="진돗개"; //animal 필드
		ds1.age=4; //animal field
		ds1.dog=2; //dog field
		ds1.dogsub=1; //dogsub field
		
	//상속에서 업캐스팅, 다운 캐스팅
		
		//업캐스팅: 자식 데이터 타입에서 부모 데이터 타입으로 변환하는 것 (객체의 클래스(틀)가 바뀜?이거 어디다 쓰지)
		//부모 타입의 필드와 메소드만 접근 가능
		//강제 타입 변환없이 자동으로 업캐스팅됨 
		//ds1은 dogsub 데이터 타입을 가지고 있고 animal,dog,dogsub 필드와 메소드 모두 접근 가능
		
		Dog ds1c1=ds1; //업캐스팅  dogsub ==> dog : animal,dog 접근 가능
		Dog ds2c1=(Dog)ds1; //업캐스팅은 강제 타입 변환 생략 가능 
		Animal ds1c2=ds1; //업캐스팅 dogsub ==> animal : animal 접근 가능
		
		//ds1 : dogsub (animal,dog,dogsub)
		//ds1c1 : dog (animal,dog)
		//ds1c2 : animal (animal)
		
		//다운 캐스팅: 부모 데이터 타입을 자식 데이터 타입으로 변환
		//강제 타입 변환 필요. 수동으로 다운캐스팅됨 
		//a3는 animal,dog,dogsub 중 animal만 접근 가능하도록 업캐스팅 됨
		Dog a3down1=(Dog)a3; //a3 [animal] ==> a3down1 [dog]
		DogSub a3down2=(DogSub)a3; //a3 [animal] ==> a3down2 [dogsub]
		
		
	}

}
