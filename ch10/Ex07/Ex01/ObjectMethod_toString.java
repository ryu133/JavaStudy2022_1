package ch10.Ex07.Ex01;
//object class�� toString �޼ҵ� : ��ü�� ����� �� object tostring() ȣ��
//tostring(): ��Ű����.Ŭ������@�ؽ��ڵ�
//�ؽ��ڵ�: ��ü�� ����Ű�� �ִ� �� �޸𸮿� ������ �ؽ��ڵ�� ��ȯ(��ȣȭ)
//�������ؼ� ��� : ��ü�� ������ ����� ��/ �ʵ� ��, �޼ҵ� ȣ���� ��
class A{
	int m=3;
	int n=4;
}
class B{ //extends Object
	int a=3;
	int b=4;
	
	@Override
	public String toString() {
		return "a : "+a+", b : "+b;
	}
}
public class ObjectMethod_toString {
	public static void main(String[] args) {
		A a=new A();
		System.out.println(a);//��Ű����.Ŭ������@�ؽ��ڵ�  (16����)
		System.out.println(a.toString());
		System.out.printf("%x\n",a.hashCode()); //x: 16����
		
		B b=new B();
		System.out.println(b); //tostring() �������ؼ� ��ü�� �ʵ� ������ ���
		
		
	}
}
