package ch10.Ex07.Ex04;
class AA{
	String name;
	AA(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
	public boolean equals(Object obj) {
		if (this.name==((AA)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}
class BB{
	String name;
	BB(String name){
		this.name=name;
	}
	@Override
	public String toString() { //��Ű����.Ŭ������@�ؽ��ڵ� ==> name �ʵ��� ���� ����
		return name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name==((BB)obj).name) {
			return true;
		}else {
			return false;
		}
	}
}
public class StringEx2 {
	public static void main(String[] args) {
		String s1=new String("�ȳ�");
		String s2="�ȳ�"; //���� ����
		
		System.out.println(s1); //string Ŭ������ tostring()�� ������ �Ǿ�����
		System.out.println(s2);//string Ŭ��������  equals() ������ �ӵ��̤��ִ�
		//���� ���ϵ��� ������
		AA aa1=new AA("�ȳ�");
		AA aa2=new AA("�ȳ�");
		
		System.out.println(aa1);
		System.out.println(aa1.equals(aa2));
		//��ü �ּҸ� ���ϱ� ���� ���� ����1 ����2
		
		BB bb1=new BB("�ȳ�");
		BB bb2=new BB("�ȳ�");
		
		System.out.println(bb1);
		
		
		
	}
}
