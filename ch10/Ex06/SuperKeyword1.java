package ch10.Ex06;
//super: �θ� Ŭ����(��Ӱ��迡�� �θ�)
//this: �ڱ� �ڽ��� ��ü

//�������̵�: �θ��� �޼ҵ尡 ������ ��Ե��� ����
class A{
	void abc() {
		System.out.println("A class abc()");
	}
}
class B extends A{
	@Override
	void abc() {
		System.out.println("B class abc()");
	}
	void bcd() {
		abc(); //this. ������ 
		super.abc(); 
	}
}
public class SuperKeyword1 {
	public static void main(String[] args) {
		//��ü ����
		B bb=new B();
		//�޼ҵ� ȣ��
		bb.bcd(); //B class abc()
		
	}
}
