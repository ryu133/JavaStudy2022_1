package cooperation.check;

import java.util.ArrayList;
import java.util.Scanner;

/* ��ü���� ����
 * 
 * Student : �ʱⰪ : 100000	������ Ż��(������-1000)		����ö�� Ż�� (������-1500)
 * 
 * Bus : 1,000��, �°� �� ����, ���� ����
 * 
 * Subway : 1,500��, �°� �� ����, ���� ����
 * 
 */

//������

class Student {
	String studentName;						// �л��̸�
	int money;								// ������, �ʱⰪ 100000(10����)
	
	Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// ���� ������
	public void takeBus(Bus bus) {			// �л��� Bus�� ſ�� ��, Bus�� ���� ����
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeOutBus(Bus bus) {		// �л��� Bus�� ������ ��
		bus.takeOut();
	}
	
	// ����ö ������
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeOutSubway(Subway subway) {
		subway.takeOut();
	}
	
	@Override
	public String toString() {
		return studentName + "\t" + money;
	}

	
}


class Bus{
	int busName;							// ���� ��ȣ (ex. 100������, 200������), ��ǲ���޾� �����ڿ��� �Ҵ�
	int passengerCount;						// �°� ��
	int money;								// ���� ����
	
	Bus(int busName) {
		this.busName = busName;
	}
	
	public void take(int money) {			// ������ ����, �°� ���� ó���ϴ� �޼ҵ�
		this.money += money;
		this.passengerCount += 1;
	}
	
	public void takeOut() {					// ���� ������ �״�� , �°��� -1 ó�� �޼ҵ�
		this.passengerCount -= 1;
	}
	
	
}


class Subway{
	String lineNumber;						// ���γѹ� (ex. 1ȣ��, 2ȣ��...), ��ǲ���޾� �����ڿ��� �Ҵ�
	int passengerCount;						// �°� ��
	int money;								// ���� ����
	
	Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {			// ����ö�� ����, �°� ���� ó���ϴ� �޼ҵ�
		this.money += money;
		this.passengerCount += 1;
	}
	
	public void takeOut() {					// ����ö ������ �״�� , �°��� -1 ó�� �޼ҵ�
		this.passengerCount -= 1;
	}
	
}



public class CooperationBetweenObject {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String selectStudent = null;
		Bus bus = new Bus(100);
		Subway subway = new Subway("1ȣ��");
		
		while(true) {
			System.out.println("==========================================================");
			System.out.println("1. �л���ü ����  | 2. �л����� ��� �� ����");
			System.out.println("3. ������ Ž |  4.  ������ ���� 5. ����ö�� Ž , 6. ����ö�� ����.   7. ����");
			System.out.println("==========================================================");
			
			int selectNum = sc.nextInt();
			
			
			if (selectNum == 1) {
				System.out.println("ù ��° �л��� �̸��� �Է��� �ּ���");
				String studentName = sc.next();
				System.out.println("ù ��° �л��� ���� �Է��� �ּ���");
				int money = sc.nextInt();
				Student student = new Student(studentName, money);
				studentList.add(student);
				
				System.out.println("�� ��° �л��� �̸��� �Է��� �ּ���");
				String studentName2 = sc.next();
				System.out.println("�� ��° �л��� ���� �Է��� �ּ���");
				int money2 = sc.nextInt();
				Student student2 = new Student(studentName2, money2);
				studentList.add(student2);
				
				System.out.println("�� ��° �л��� �̸��� �Է��� �ּ���");
				String studentName3 = sc.next();
				System.out.println("�� ��° �л��� ���� �Է��� �ּ���");
				int money3 = sc.nextInt();
				Student student3 = new Student(studentName3, money3);
				studentList.add(student3);
				
				System.out.println("�� ��° �л��� �̸��� �Է��� �ּ���");
				String studentName4 = sc.next();
				System.out.println("�� ��° �л��� ���� �Է��� �ּ���");
				int money4 = sc.nextInt();
				Student student4 = new Student(studentName4, money4);
				studentList.add(student4);
				
				System.out.println("�ټ� ��° �л��� �̸��� �Է��� �ּ���");
				String studentName5 = sc.next();
				System.out.println("�ټ� ��° �л��� ���� �Է��� �ּ���");
				int money5 = sc.nextInt();
				Student student5 = new Student(studentName5, money5);
				studentList.add(student5);
				
			} else if (selectNum == 2) {
				System.out.println("=====�л����� ���=====");
				System.out.println("�л��̸�" + "\t" + "������");
				for (int i = 0; i < studentList.size(); i++) {
					System.out.println(studentList.get(i));
				}
				
				System.out.println();
				System.out.println("�л�����(�̸��Է�)>>");
				selectStudent = sc.next();
				System.out.println(selectStudent + "�л��� ���õǾ����ϴ�.");
				
			} else if (selectNum == 3) {
				
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "���� " + bus.busName + "�� ������ �����ϴ�. ��ſ� �Ϸ�Ǽ���.");
						studentList.get(i).takeBus(bus);
						System.out.println(studentList.get(i).studentName + "���� ���� ���� " + studentList.get(i).money + "�� �Դϴ�.");
						System.out.println("���� " + bus.busName + "���� �°��� " + bus.passengerCount + "�̰� ������ " + bus.money + "�� �Դϴ�.");
					}
				}
				
				
			} else if (selectNum == 4) {
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "���� " + bus.busName + "�� ������ ���Ƚ��ϴ�. ������ ������.");
						studentList.get(i).takeOutBus(bus);
						System.out.println(studentList.get(i).studentName + "���� ���� ���� " + studentList.get(i).money + "�� �Դϴ�.");
						System.out.println("���� " + bus.busName + "���� �°��� " + bus.passengerCount + "�̰� ������ " + bus.money + "�� �Դϴ�.");
					}
				}
				
				
			} else if (selectNum == 5) {
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "���� " + subway.lineNumber + "����ö�� �����ϴ�. ��ſ� �Ϸ�Ǽ���.");
						studentList.get(i).takeSubway(subway);
						System.out.println(studentList.get(i).studentName + "���� ���� ���� " + studentList.get(i).money + "�� �Դϴ�.");
						System.out.println("����ö " + subway.lineNumber + "�� �°��� " + subway.passengerCount + "�̰� ������ " + subway.money + "�� �Դϴ�.");
					}
				}
			} else if (selectNum == 6) {
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "���� " + subway.lineNumber + "����ö�� ���Ƚ��ϴ�. ������ ������.");
						studentList.get(i).takeOutSubway(subway);
						System.out.println(studentList.get(i).studentName + "���� ���� ���� " + studentList.get(i).money + "�� �Դϴ�.");
						System.out.println("����ö " + subway.lineNumber + "�� �°��� " + subway.passengerCount + "�̰� ������ " + subway.money + "�� �Դϴ�.");
					}
				}
			} else if (selectNum == 7) {
				break;
			}
		}
		
		sc.close();
		

	}

}
