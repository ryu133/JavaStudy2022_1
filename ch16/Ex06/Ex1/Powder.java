package ch16.Ex06.Ex1;

public class Powder extends Material{
	public void doPrinting() {
		System.out.println("파우더 재료로 출력");
	}
	@Override
	public String toString() {
		return "재료는 파우더";
	}
}
