package ch10.Ex04;
class Animal2{
	void run() {	}
}
class Tiger extends Animal2{
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}
class Egle extends Animal2{
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void egleEat() {
		System.out.println("독수리는 다른 새를 잡아 먹습니다.");
	}
}
class Snake extends Animal2{
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		//모든 객체는 animal 타입으로 업캐스팅해서 생성
		Animal2 animal=new Animal2();
		Animal2 tiger=new Tiger();
		Animal2 egle=new Egle();
		Animal2 snake=new Snake();
		//animal 배열에 각 객체 저장
		Animal2[] animals= {tiger,egle,snake};
		//for문으로 배열의 객체 출력
		for (int i = 0; i < animals.length; i++) {
			animals[i].run();
		}
		//enhanced for문을 사용해서 객체의 run() 메소드 출력
		for (Animal2 k : animals) {
			k.run();
		}
		//다운캐스팅(instanceof 사용) tigerEat(), egleEat() 출력
		if (tiger instanceof Tiger) {
			Tiger tiger2=(Tiger)tiger;
			tiger2.tigerEat();
		}
		if (egle instanceof Egle) {
			Egle egle2=(Egle)egle;
			egle2.egleEat();
		}
		
	}

}
