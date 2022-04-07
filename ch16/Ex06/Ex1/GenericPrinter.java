package ch16.Ex06.Ex1;

//generic class : 다양한 타입을 사용할 수 있는 클래스
public class GenericPrinter<T extends Material> { //다양한 어쩌구로 하는 프린터
	//타입 제한: material의 하위 클래스와 인터페이스(인터페이스도 extends 사용)만 T에 들어갈 수 있다.
	private T material;  //material: 참조변수.  객체(인스턴스)

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString(); //해당 객체의 toString() 메소드 호출
	}
	public void printing() { //메소드만 정의
		material.doPrinting();
	}
	
	
}
