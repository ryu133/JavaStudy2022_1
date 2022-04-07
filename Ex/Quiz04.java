package Ex;

import java.util.Objects;

class E extends Object{//�ڹ��� ��� Ŭ������ object�� �ڽ� Ŭ�����̴�.
						//object Ŭ������ ���ǵ� �޼ҵ带 ����� �� �ִ�.
	String name;
	E(){} //�⺻ ������: Ŭ���� ���� �ٸ� �����ڰ� ������ �� �ܺο��� �⺻�����ڸ� ȣ���� �� �����Ǹ� �ȵ�
	E(String name){
		this.name=name; //�Ű����� �̸�, �����ο��� �Ű������� �޴� ������, �ʵ��� �������� ��� ������ ���
	}					//this: �ڽ��� ��ü
	@Override
	public String toString() { //��ü ��ü�� ����� �� toString() ȣ���
		return "�̸� : " + name + " "; //this.name
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) { //��ĳ���� ���Ӥ���������������������
		if (this.name == ((E)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
class Student2{
	int studentID;
	String name;
	int kor;
	int eng;
	
	Student2(int studentID,String name,int kor, int eng){
		this.studentID=studentID;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.studentID==((Student2)obj).studentID) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return studentID+", "+name+", "+kor+", "+eng;
	}
}
public class Quiz04 {
	public static void main(String[] args) {
		Student2 s1=new Student2(111,"a",88,85);
		Student2 s2=new Student2(222,"b",89,87);
		Student2 s3=new Student2(333,"c",87,88);
		Student2 s4=new Student2(111,"d",86,89);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		//studentID �� ���� ��� "���� �л��Դϴ�." ���
		//== : �⺻Ÿ��(boolean, byte, shot, int, long, double, float, char)  8
		//equals() : ����Ÿ��(�迭, ��ü, string)
		
		//object�� toString(),equals()�� ������
				// : ��ü�� �ּҸ� ��. �������ؼ� ��ü ���� Ư�� �ʵ��� ���� ��
		//toString():��ü ��ü�� ��� �� �ּҰ� ��µ� ��Ű����.Ŭ������@�ؽ��ڵ�
				//�������̵��ؼ� ��ü�� �ʵ� ���� ���
		//
//		System.out.println(s1.equals(s4)); //true
		if (s1.equals(s4)) {
			System.out.println("���� �л��Դϴ�.");
			
		}else {
			System.out.println("�ٸ� �л��Դϴ�.");
			
		}
		
		
		E e1=new E(); //�⺻������ ȣ��: ���� �ʵ��� ���� ���� �ʱ�ȭ��
		System.out.println(e1.name); //null
		E e2=new E("�����");
		System.out.println(e2.name);
		E e3=new E("�����");
		System.out.println(e2==e3); //����Ÿ���� ==�� ��ü�� �ּ� ��
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e2.equals(e3)); //equals() ��ü�� �ּ� ��
		//object�� toString(),equals()�� �������ؼ� ���
		
		
		
	}

}
