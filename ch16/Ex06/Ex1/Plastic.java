package ch16.Ex06.Ex1;

public class Plastic extends Material{
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력");
	}
	@Override
	public String toString() {
		return "재료는 플라스틱";
	}
}
