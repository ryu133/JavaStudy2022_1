package ch16.Ex08;

abstract class Fruit{ //pancil만 타입으로 접근할 수 없도록 설정하기
	public abstract void print();
}

//DTO(Data Transfer Object): getter,setter
//VO(Value Object): getter
//데이터를 받아서 전송하는 중간자 역할
//계층간에 값을 받아서 전송, 중간자 역할
class Generic<T extends Fruit>{ //T: B,C 클래스만 올 수 있다
	
	public T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public String toString() {
		return t.toString();
	}
	public void printing() {
		t.print();
	}
}
class Apple extends Fruit{
	String name;
	int price;
	Apple(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"이고 가격은 "+price;
	}
	@Override
	public void print() {
		
	}
	
}

class Strawberry extends Fruit{
	String name;
	int price;
	Strawberry(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"이고 가격은 "+price;
	}
	@Override
	public void print() {
		
	}
}
class Banana extends Fruit{
	String name;
	int price;
	Banana(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"이고 가격은 "+price;
	}
	@Override
	public void print() {
		
	}
}
class Pancil{
	String name;
	int price;
	Pancil(String name,int price) {
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return name+"이고 가격은 "+price;
	}
}


public class ExRestricGenericType {
	public static void main(String[] args) {
		Generic<Apple> applePrinter=new Generic();
		applePrinter.setT(new Apple("a1", 1000));
		
		Apple apple=applePrinter.getT();
		System.out.println(apple);
		apple.print();
		
		Generic<Banana> bananaPrinter=new Generic();
		bananaPrinter.setT(new Banana("b1", 1000));
		
		Banana banana=bananaPrinter.getT();
		System.out.println(banana);
		banana.print();
		
		Generic<Strawberry> strawberryPrinter=new Generic();
		strawberryPrinter.setT(new Strawberry("s1", 1000));
		
		Strawberry strawberry=strawberryPrinter.getT();
		System.out.println(strawberry);
		strawberry.print();
		
//		GenericPrinter<Pencil> pancilPrinter=new GenericPrinter();
//		pancilPrinter.setT(new Pancil("p1", 1000));
//		
//		Pancil pancil=pancilPrinter.getT();
		
//		pancil.print();
		
	}
}
