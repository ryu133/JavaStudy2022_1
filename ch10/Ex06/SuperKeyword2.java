package ch10.Ex06;
//super Ű����: �θ�(super) Ŭ����
class AA{
	int m;
	void abc() {
		System.out.println("AA class abc()");
		System.out.println(m);
	}
}
class BB extends AA{
	void abc() {
		System.out.println("BB class abc()");
	}
	void bcd() {
		super.m=300;
		super.abc(); //�θ��� abc ȣ�� 
	}
}
public class SuperKeyword2 {
	public static void main(String[] args) {
		BB bb=new BB();
		bb.bcd();
		System.out.println();
	}
}
