package Cooperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//��ü���� ����
//		�л��� �����: 100,000��
//	�л�	: ������ Ÿ�� -1000��, ����ö�� Ÿ�� -1500��
//	����	: 1000��		�°��� ���� ���� ����
//	����ö: 1500��		�°��� ���� ���� ����

class Student{
	String studentName; //�л� �̸�
	int money; //�л��� ���� ��, �ʱⰪ: 100,000��
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) { //�л��� ������ ���� �� ������ ���� �����ؾ� ��
		bus.take(1000);
		this.money-=1000;
		System.out.println(studentName+"�� "+bus.BusName+"�� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���. ");
	}
	public void takeOutBus(Bus bus) { //�������� ����
		bus.takeOut();
		System.out.println(studentName+"�� "+bus.BusName+"�� ������ ���Ƚ��ϴ�. �¹���~~~. ");
	}
	public void takeSubway(Subway subway) { //����ö Ÿ��
		subway.take(1500);
		this.money-=1500;
		System.out.println(studentName+"�� "+subway.lineNumber+"ȣ�� ����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���. ");
	}
	public void takeOutSubway(Subway subway) { //����ö ������
		subway.takeOut();
		System.out.println(studentName+"�� "+subway.lineNumber+"ȣ�� ����ö�� ���Ƚ��ϴ�. �ȳ� ~~~");
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			if (this.studentName==((Student)obj).studentName) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(studentName);
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", money=" + money + "]";
	}
	
	public void showInfo() {
		System.out.println(studentName+"���� ���� ���� "+money+"�Դϴ�.");
	}
}

class Bus{
	int BusName; //(���� ��ȣ) 6617, 03, .. (�Է¹޾Ƽ� �������� �Ű������� ����)
	int passengerCount; //�°��� 
	int money; //���� ����
	
	public Bus(int BusName) {
		this.BusName=BusName;
		
	}
	
	public void take(int money) { //������ ���԰� �°����� ó��
		this.money+=money;
		this.passengerCount++;
	}
	public void takeOut() {//���� �°��� ����
		this.passengerCount--;
	}
	public void showInfo() {
		System.out.println("���� "+BusName+"���� �°��� "+passengerCount+"���̰� ������ "+money+" �Դϴ�. ");
	}

	public int getBusName() {
		return BusName;
	}

	public void setBusName(int busName) {
		BusName = busName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(BusName);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bus) {
			if (this.BusName==((Bus)obj).BusName) {
				return true;
			}
		}
		return false;
	}
	
}

class Subway{
	String lineNumber; //1ȣ��, 2ȣ��,.. (�Է¹޾Ƽ� �������� �Ű������� �����Ͽ� Ȱ��ȭ)
	int passengerCount; //�°���
	int money; //����
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) { //����ö�� ���԰� �°����� ó��
		this.money+=money;
		this.passengerCount++;
	}
	public void takeOut() { //����ö �°��� ����
		this.passengerCount--;
	}
	public void showInfo() {
		System.out.println("����ö "+lineNumber+"ȣ���� �°��� "+passengerCount+"���̰� ������ "+money+" �Դϴ�. ");
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(lineNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Subway) {
			if (this.lineNumber==((Subway)obj).lineNumber) {
				return true;
			}
		}
		return false;
	}
	
}

public class Cooperation_BetweenObject {
	
	private static Student findStudent(String studentName) {
		Student student=null;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i)!=null) {
				Student s1=students.get(i);
				if (studentName.equals(s1.getStudentName())) {
					student=s1;
					break;
				}
			}
		}
		return student;
	}
	private static Bus findBus(int BusName) {
		Bus bus=null;
		for (int i = 0; i < buses.size(); i++) {
			if (students.get(i)!=null) {
				Bus b1=buses.get(i);
				if (BusName==b1.getBusName()) {
					bus=b1;
					break;
				}
			}
		}
		return bus;
	}
	private static Subway findSubway(String lineNunber) {
		Subway subway=null;
		for (int i = 0; i < subways.size(); i++) {
			if (students.get(i)!=null) {
				Subway s1=subways.get(i);
				if (lineNunber.equals(s1.getLineNumber())) {
					subway=s1;
					break;
				}
			}
		}
		return subway;
	}
	
	static String sn;
	static ArrayList<Student>students=new ArrayList<>();
	static ArrayList<Bus>buses=new ArrayList<>();
	static ArrayList<Subway>subways=new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.println("=============================================");
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ����  \r\n"
					+ "		3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����");
			System.out.println("=============================================");
			System.out.println("���� >>");
			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				System.out.println("�л��̸� : ");
				String studentName=scanner.next();
				System.out.println("�� �Է� : ");
				int money=scanner.nextInt();
				
				Student student=new Student(studentName, money);
				students.add(student);
				
			}else if (selectNo==2) {
				System.out.println("=====�л����� ���=====");
				System.out.println(students);
				System.out.println("�л�����(�̸��Է�)>>");
				String studentName=scanner.next();
				
				Student student=findStudent(studentName);
				sn=student.getStudentName();
				
				
			}else if (selectNo==3) {
				
				System.out.println("���� ��ȣ �Է� >>");
				int busName=scanner.nextInt();
				Student student=findStudent(sn);
				if (findBus(busName)==null) {
					Bus bus=new Bus(busName);
					buses.add(bus);
				}
				Bus bus=findBus(busName);
				student.takeBus(bus);
				student.showInfo();
				bus.showInfo();
				
			}else if (selectNo==4) {
				System.out.println("���� ��ȣ �Է� >>");
				int busName=scanner.nextInt();
				Student student=findStudent(sn);
				if (findBus(busName)==null) {
					Bus bus=new Bus(busName);
					buses.add(bus);
				}
				Bus bus=findBus(busName);
				student.takeOutBus(bus);
				student.showInfo();
				bus.showInfo();
				
			}else if (selectNo==5) {
				System.out.println("����ö �뼱 �Է� >>");
				String lineNumber=scanner.next();
				Student student=findStudent(sn);
				if (findSubway(lineNumber)==null) {
					Subway subway=new Subway(lineNumber);
					subways.add(subway);;
				}
				Subway subway= findSubway(lineNumber);
				student.takeSubway(subway);
				student.showInfo();
				subway.showInfo();
			}else if (selectNo==6) {
				System.out.println("����ö �뼱 �Է� >>");
				String lineNumber=scanner.next();
				Student student=findStudent(sn);
				if (findSubway(lineNumber)==null) {
					Subway subway=new Subway(lineNumber);
					subways.add(subway);;
				}
				Subway subway= findSubway(lineNumber);
				student.takeOutSubway(subway);
				student.showInfo();
				subway.showInfo();
				
			}else if (selectNo==7) {
				break;
			}
			
		}
		scanner.close();
		System.out.println("���α׷� ����");
		
		
		
		
	}
}
