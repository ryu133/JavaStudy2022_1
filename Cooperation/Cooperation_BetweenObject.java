package Cooperation;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

//객체간의 협업
//		학생의 전재산: 100,000원
//	학생	: 버스를 타면 -1000원, 지하철을 타면 -1500원
//	버스	: 1000원		승객수 증가 수입 증가
//	지하철: 1500원		승객수 증가 수입 증가

class Student{
	String studentName; //학생 이름
	int money; //학생이 가진 돈, 초기값: 100,000원
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	public void takeBus(Bus bus) { //학생이 버스를 탔을 때 버스에 돈을 지불해야 함
		bus.take(1000);
		this.money-=1000;
		System.out.println(studentName+"님 "+bus.BusName+"번 버스를 탔습니다. 즐거운 하루되세요. ");
	}
	public void takeOutBus(Bus bus) { //버스에서 내림
		bus.takeOut();
		System.out.println(studentName+"님 "+bus.BusName+"번 버스를 내렸습니다. 굿바이~~~. ");
	}
	public void takeSubway(Subway subway) { //지하철 타기
		subway.take(1500);
		this.money-=1500;
		System.out.println(studentName+"님 "+subway.lineNumber+"호선 지하철를 탔습니다. 즐거운 하루되세요. ");
	}
	public void takeOutSubway(Subway subway) { //지하철 내리기
		subway.takeOut();
		System.out.println(studentName+"님 "+subway.lineNumber+"호선 지하철를 내렸습니다. 안녕 ~~~");
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
		System.out.println(studentName+"님의 남은 돈은 "+money+"입니다.");
	}
}

class Bus{
	int BusName; //(버스 번호) 6617, 03, .. (입력받아서 생성자의 매개변수로 저장)
	int passengerCount; //승객수 
	int money; //버스 수입
	
	public Bus(int BusName) {
		this.BusName=BusName;
		
	}
	
	public void take(int money) { //버스의 수입과 승객수를 처리
		this.money+=money;
		this.passengerCount++;
	}
	public void takeOut() {//버스 승객수 감소
		this.passengerCount--;
	}
	public void showInfo() {
		System.out.println("버스 "+BusName+"번의 승객은 "+passengerCount+"명이고 수입은 "+money+" 입니다. ");
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
	String lineNumber; //1호선, 2호선,.. (입력받아서 생성자의 매개변수로 저장하여 활성화)
	int passengerCount; //승객수
	int money; //수입
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) { //지하철의 수입과 승객수를 처리
		this.money+=money;
		this.passengerCount++;
	}
	public void takeOut() { //지하철 승객수 감소
		this.passengerCount--;
	}
	public void showInfo() {
		System.out.println("지하철 "+lineNumber+"호선의 승객은 "+passengerCount+"명이고 수입은 "+money+" 입니다. ");
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
			System.out.println("1. 학생객체 생성  | 2. 학생정보 출력 및 선택  \r\n"
					+ "		3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료");
			System.out.println("=============================================");
			System.out.println("선택 >>");
			int selectNo=scanner.nextInt();
			
			if (selectNo==1) {
				System.out.println("학생이름 : ");
				String studentName=scanner.next();
				System.out.println("돈 입력 : ");
				int money=scanner.nextInt();
				
				Student student=new Student(studentName, money);
				students.add(student);
				
			}else if (selectNo==2) {
				System.out.println("=====학생정보 출력=====");
				System.out.println(students);
				System.out.println("학생선택(이름입력)>>");
				String studentName=scanner.next();
				
				Student student=findStudent(studentName);
				sn=student.getStudentName();
				
				
			}else if (selectNo==3) {
				
				System.out.println("버스 번호 입력 >>");
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
				System.out.println("버스 번호 입력 >>");
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
				System.out.println("지하철 노선 입력 >>");
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
				System.out.println("지하철 노선 입력 >>");
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
		System.out.println("프로그램 종료");
		
		
		
		
	}
}
