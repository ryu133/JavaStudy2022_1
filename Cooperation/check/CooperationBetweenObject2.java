package cooperation.check;

import java.util.ArrayList;
import java.util.Scanner;

/* 객체간의 협업
 * 
 * Student : 초기값 : 100000	버스를 탈때(가진돈-1000)		지하철을 탈때 (가진돈-1500)
 * 
 * Bus : 1,000원, 승객 수 증가, 수입 증가
 * 
 * Subway : 1,500원, 승객 수 증가, 수입 증가
 * 
 */

//여원준

class Student {
	String studentName;						// 학생이름
	int money;								// 가진돈, 초기값 100000(10만원)
	
	Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스 승하차
	public void takeBus(Bus bus) {			// 학생이 Bus를 탓을 때, Bus에 돈을 지불
		bus.take(1000);
		this.money -= 1000;
	}
	public void takeOutBus(Bus bus) {		// 학생이 Bus를 내렸을 때
		bus.takeOut();
	}
	
	// 지하철 승하차
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
	int busName;							// 버스 번호 (ex. 100번버스, 200번버스), 인풋값받아 생성자에서 할당
	int passengerCount;						// 승객 수
	int money;								// 버스 수입
	
	Bus(int busName) {
		this.busName = busName;
	}
	
	public void take(int money) {			// 버스의 수입, 승객 수를 처리하는 메소드
		this.money += money;
		this.passengerCount += 1;
	}
	
	public void takeOut() {					// 버스 수입은 그대로 , 승객수 -1 처리 메소드
		this.passengerCount -= 1;
	}
	
	
}


class Subway{
	String lineNumber;						// 라인넘버 (ex. 1호선, 2호선...), 인풋값받아 생성자에서 할당
	int passengerCount;						// 승객 수
	int money;								// 버스 수입
	
	Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {			// 지하철의 수입, 승객 수를 처리하는 메소드
		this.money += money;
		this.passengerCount += 1;
	}
	
	public void takeOut() {					// 지하철 수입은 그대로 , 승객수 -1 처리 메소드
		this.passengerCount -= 1;
	}
	
}



public class CooperationBetweenObject {
	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String selectStudent = null;
		Bus bus = new Bus(100);
		Subway subway = new Subway("1호선");
		
		while(true) {
			System.out.println("==========================================================");
			System.out.println("1. 학생객체 생성  | 2. 학생정보 출력 및 선택");
			System.out.println("3. 버스를 탐 |  4.  버스를 내림 5. 지하철을 탐 , 6. 지하철을 내림.   7. 종료");
			System.out.println("==========================================================");
			
			int selectNum = sc.nextInt();
			
			
			if (selectNum == 1) {
				System.out.println("첫 번째 학생의 이름을 입력해 주세요");
				String studentName = sc.next();
				System.out.println("첫 번째 학생의 돈을 입력해 주세요");
				int money = sc.nextInt();
				Student student = new Student(studentName, money);
				studentList.add(student);
				
				System.out.println("두 번째 학생의 이름을 입력해 주세요");
				String studentName2 = sc.next();
				System.out.println("두 번째 학생의 돈을 입력해 주세요");
				int money2 = sc.nextInt();
				Student student2 = new Student(studentName2, money2);
				studentList.add(student2);
				
				System.out.println("세 번째 학생의 이름을 입력해 주세요");
				String studentName3 = sc.next();
				System.out.println("세 번째 학생의 돈을 입력해 주세요");
				int money3 = sc.nextInt();
				Student student3 = new Student(studentName3, money3);
				studentList.add(student3);
				
				System.out.println("네 번째 학생의 이름을 입력해 주세요");
				String studentName4 = sc.next();
				System.out.println("네 번째 학생의 돈을 입력해 주세요");
				int money4 = sc.nextInt();
				Student student4 = new Student(studentName4, money4);
				studentList.add(student4);
				
				System.out.println("다섯 번째 학생의 이름을 입력해 주세요");
				String studentName5 = sc.next();
				System.out.println("다섯 번째 학생의 돈을 입력해 주세요");
				int money5 = sc.nextInt();
				Student student5 = new Student(studentName5, money5);
				studentList.add(student5);
				
			} else if (selectNum == 2) {
				System.out.println("=====학생정보 출력=====");
				System.out.println("학생이름" + "\t" + "가진돈");
				for (int i = 0; i < studentList.size(); i++) {
					System.out.println(studentList.get(i));
				}
				
				System.out.println();
				System.out.println("학생선택(이름입력)>>");
				selectStudent = sc.next();
				System.out.println(selectStudent + "학생이 선택되었습니다.");
				
			} else if (selectNum == 3) {
				
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "님이 " + bus.busName + "번 버스를 탔습니다. 즐거운 하루되세요.");
						studentList.get(i).takeBus(bus);
						System.out.println(studentList.get(i).studentName + "님의 남은 돈은 " + studentList.get(i).money + "원 입니다.");
						System.out.println("버스 " + bus.busName + "번의 승객은 " + bus.passengerCount + "이고 수입은 " + bus.money + "원 입니다.");
					}
				}
				
				
			} else if (selectNum == 4) {
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "님이 " + bus.busName + "번 버스를 내렸습니다. 조심히 가세요.");
						studentList.get(i).takeOutBus(bus);
						System.out.println(studentList.get(i).studentName + "님의 남은 돈은 " + studentList.get(i).money + "원 입니다.");
						System.out.println("버스 " + bus.busName + "번의 승객은 " + bus.passengerCount + "이고 수입은 " + bus.money + "원 입니다.");
					}
				}
				
				
			} else if (selectNum == 5) {
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "님이 " + subway.lineNumber + "지하철을 탔습니다. 즐거운 하루되세요.");
						studentList.get(i).takeSubway(subway);
						System.out.println(studentList.get(i).studentName + "님의 남은 돈은 " + studentList.get(i).money + "원 입니다.");
						System.out.println("지하철 " + subway.lineNumber + "의 승객은 " + subway.passengerCount + "이고 수입은 " + subway.money + "원 입니다.");
					}
				}
			} else if (selectNum == 6) {
				for (int i = 0; i < studentList.size(); i++) {
					if (selectStudent.equals(studentList.get(i).studentName)) {
						System.out.println(studentList.get(i).studentName + "님이 " + subway.lineNumber + "지하철을 내렸습니다. 조심히 가세요.");
						studentList.get(i).takeOutSubway(subway);
						System.out.println(studentList.get(i).studentName + "님의 남은 돈은 " + studentList.get(i).money + "원 입니다.");
						System.out.println("지하철 " + subway.lineNumber + "의 승객은 " + subway.passengerCount + "이고 수입은 " + subway.money + "원 입니다.");
					}
				}
			} else if (selectNum == 7) {
				break;
			}
		}
		
		sc.close();
		

	}

}
