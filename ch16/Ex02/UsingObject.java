package ch16.Ex02;

//Object는 모든 객체를 저장할 수 있다
//상품을 저장하는 클래스에 object 타입으로 저장하면 모든 객체를 담을 수 있다
//object의 장점: 모든 객체를 담을 수 있다 (캐스팅)
		//단점: 매번 다운캐스팅을 해야함
			//:약한 타입 체크: 실행시 ClassCastException이 발생될 수 있다. 

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
//object를 사용해서 모든 상품을 저장하는 클래스 생성
class Goods1{
	private Object object=new Object(); //모든 클래스는 object 타입으로 변환

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) { //object 타입으로 업캐스팅됨
		this.object = object;
	}
	
}

class Pancil{
	String name;
	int price;
	Pancil(String name,int price){
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "이름: "+name+", 가격: "+price;
	}
}


public class UsingObject {
	public static void main(String[] args) {
		Goods1 goods1=new Goods1();
		goods1.setObject(new Apple("apple3", 4000) );
		System.out.println((Apple)goods1.getObject());
		((Apple)goods1.getObject()).abc();
		
		Goods1 goods2=new Goods1();
		goods2.setObject(new Pancil("pancil3", 4000) );
		System.out.println((Pancil)goods2.getObject());
		
	}
}
