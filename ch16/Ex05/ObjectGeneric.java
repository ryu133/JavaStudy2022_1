package ch16.Ex05;


class Apple{
	String name;
	int price;
	Apple(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void abc() {
		System.out.println("abc() print");
	}
	@Override
	public String toString() { //객체 자체를 출력시 객체의 주소 대신 필드의 정보를 출력하게 설정
		return "이름: "+name+", 가격: "+price;
	}
}

class Pancil{
	String name;
	int price;
	Pancil(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void bcd() {
		System.out.println("bcd() print");
	}
	@Override
	public String toString() {
		return "이름: "+name+", 가격: "+price;
	}
}

//generic class를 사용해서 객체를 저장 후 값 읽어오기
class Goods<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}

public class ObjectGeneric {
	public static void main(String[] args) {
		Goods<Apple> goods1=new Goods(); //goods1은 apple 데이터 타입이다
		goods1.setT(new Apple("apple1", 1000) );
		System.out.println(goods1.getT()); //generic은 다운캐스팅이 불필요
		(goods1.getT()).abc(); //
		
		Goods<Pancil> goods2=new Goods(); //goods1은 apple 데이터 타입이다
		goods2.setT(new Pancil("pancil1", 1100) );
		System.out.println(goods2.getT());
		(goods2.getT()).bcd();
		
		
	}
}
