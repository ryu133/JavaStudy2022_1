package ch10.Ex05;
class AAAA{ //static �޼ҵ� �������̵� �Ұ�
	static void print() {
		System.out.println("AAAA class");
	}
}
class BBBB extends AAAA{
	static void print() {
		System.out.println("BBBB class");
	}
}
public class OverlapStaticMethod {
	public static void main(String[] args) {
		//1 ��ü ���� ���� ȣ��
	
		
		//2 ��ü ���� �� ȣ��
		AAAA aaaa=new AAAA();
		aaaa.print(); //A class
		BBBB bbbb=new BBBB();
		bbbb.print(); //B
		AAAA aabb=new BBBB();
		aabb.print(); //A
		
	}
}
