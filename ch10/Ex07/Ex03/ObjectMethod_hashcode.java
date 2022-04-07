package ch10.Ex07.Ex03;

import java.util.HashMap;
//HashMap: key =�� ���� ����Ǵ� �ڷᱸ��
// key�� �ߺ��� �� ����.
// hashmap�� key�� ��ü�� ������ ��� key �� ����Ǵ� ��ü�� �ߺ����� �ʴ� ������ ������ ������ �ؾ��Ѵ�
// object Ŭ������  hashcode()�� ����ؼ� ��ü�� key�� ����� ��� �ߺ����� �ʵ��� ������ �� �ִ�.
class A{
	String name;
	A(String name){
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name==((A)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		return name;
	}
}
class B{ //hashcode () & equals() ������ <<== ��� ���� �� ������ ��ü�� �ν�
	String name;
	B(String name){
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if (this.name==((B)obj).name) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return name;
	}
}
public class ObjectMethod_hashcode {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1=new HashMap<>(); //<Integer <== key, String <== Value
		hm1.put(1, "������1");
		hm1.put(1, "������2"); //1:������1=>������2
		hm1.put(2, "������3");
		
		System.out.println(hm1); 
		
		System.out.println("============");
		
		HashMap<A, String> hm2=new HashMap<>(); //equals()�� ������ �Ǿ�����
		hm2.put(new A("ù ��°"), "������1"); //hashcode() ������ �ȵǾ�����
		hm2.put(new A("ù ��°"), "������2");
		hm2.put(new A("�� ��°"), "������3");
		
		System.out.println(hm2); //(���� ��µ�)hashmap�� �߸� ������ ���
		
		System.out.println("===============");
		
		HashMap<B, String> hm3=new HashMap<>(); //hashcode() & equals() ������=> ��� �� ������ �� ������ ��ü
		hm3.put(new B("ù ��°"), "������1");
		hm3.put(new B("ù ��°"), "������2");
		hm3.put(new B("�� ��°"), "������3");
		
		System.out.println(hm3); //hashmap ������ ����� ������ ��� : key�� �ߺ��Ǹ� �ȵȴ�
		//hm3(hashmap)�� tostring() �޼ҵ尡 ������ �Ǿ��ִ�
		
		System.out.println("ù ��°".hashCode());
		System.out.println("ù ��°".hashCode());
		
	}
}
