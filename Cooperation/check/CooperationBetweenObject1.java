package cooperation.check;

import java.util.ArrayList;
import java.util.Scanner;

//객체간의 협업

/*   각 학생의 용돈: 100,000원
 *
  학생 : 버스를 탈 때(-1,000원) 지하철(-1,500원)
  버스 : 1,000원 승객 수 증가, 수입 증가
  지하철 : 1,500원 승객 수 증가, 수입 증가
 
 
 */

//김진수

class Student {
	String studentName; // 학생 이름
	int money; // 학생이 가진 돈, 초기값: 100,000원
	int using; // 버스나 지하철을 현재 타고 있는지 1이 타고 있음

	Student(String studentName) {
		this.studentName = studentName;
		this.money = 100000;
		System.out.println(this.studentName + "이 용돈을 100,000원 받았습니다.");
	}

	public void takeBus(Bus bus) { // 학생이 버스를 탔을 때 버스에 돈을 지불해야 한다.
		if (this.money < 1000) {
			System.out.println("돈이 없어서 못타요 ㅠㅠ");
		} else {
			bus.take(1000);
			this.money -= 1000;
			this.using = 1;
		}
	}

	public void takeOutBus(Bus bus) { // 버스에서 내림
		if (bus.passengerCount > 0) {
			bus.takeOut();
			this.using = 0;
		} else {
			System.out.println("학생이 없어요");
		}
	}

	public void takeSubway(Subway subway) { // 학생이 지하철을 탔을 때 지하철에 돈을 지불해야 한다.
		if (this.money < 1500) {
			System.out.println("돈이 없어서 못타요 ㅠㅠ");
		} else {
			subway.take(1500);
			this.money -= 1500;
			this.using = 1;
		}
	}

	public void takeOutSubway(Subway subway) { // 버스에서 내림
		if (subway.passengerCount > 0) {
			subway.takeOut();
			this.using = 0;
		} else {
			System.out.println("학생이 없어요");
		}
	}

}

class Bus {
	int busName; // 몇 번 버스냐 << 인풋 값을 받아서 버스 이름을 지정
	int passengerCount; // 승객 수
	int money; // 버스의 수입

	Bus(int busName) {
		this.busName = busName;
		System.out.println(this.busName + "번 버스를 만들었습니다.");
	}

	public void take(int money) { // 버스의 수입을 처리, 승객 수를 처리
		this.passengerCount++;
		this.money += money;
	}

	public void takeOut() {
		this.passengerCount--;
	}

}

class Subway {
	String lineNumber; // "1호선", "2호선"..
	int passengerCount;
	int money;

	Subway(String lineNumber) {
		this.lineNumber = lineNumber;
		System.out.println(this.lineNumber + " 지하철을 만들었습니다.");
	}

	public void take(int money) { // 버스의 수입을 처리, 승객 수를 처리
		this.passengerCount++;
		this.money += money;
	}

	public void takeOut() {
		this.passengerCount--;
	}
}

public class CooperationBetweenObject {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<>();
		ArrayList<Bus> busList = new ArrayList<>();
		ArrayList<Subway> subwayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 6; i++) { // 버스 5대 생성
			Bus b = new Bus(i * 100);
			busList.add(b);
		}

		for (int i = 1; i < 6; i++) { // 지하철 5대 생성
			Subway s = new Subway(i + "호선");
			subwayList.add(s);
		}

		while (true) {
			System.out.println("=============================================");
			System.out.println("1. 학생객체 생성  | 2. 학생정보 출력 및 선택  \r\n");
			System.out.println("=============================================");
			int choice = sc.nextInt();

			if (choice == 1) {

				for (int i = 0; i < 5; i++) {
					System.out.println("학생 이름:");
					String name = sc.next();
					Student s = new Student(name);
					studentList.add(s);
				}
			} else if (choice == 2) {
				System.out.println("=====학생정보 출력=====");
				for (Student k : studentList) {
					System.out.println(k.studentName + " " + k.money);
				}

				while (true) {
					System.out.println("학생 선택(이름입력)");
					String name = sc.next();
					Student s = null;
					for (Student k : studentList) {
						if (k.studentName.equals(name)) {
							s = k;
						}
					}

					System.out.println("대중교통 선택");
					System.out.println("3. 버스를 탐   4.  버스를 내림    5. 지하철을 탐   6. 지하철을 내림.   7. 종료 ");
					int secondChoice = sc.nextInt();
					if (secondChoice == 3) {
						System.out.println("몇 번 버스를 타시겠습니까?");
						int busnum = sc.nextInt();

						for (Bus bus : busList) {
							if (bus.busName == busnum) {
								s.takeBus(bus);
								System.out.println(s.studentName + "님 " + bus.busName + "번 버스를 탔습니다. 즐거운 하루 되세요.");
								System.out.println(s.studentName + "님의 남은 돈은 " + s.money + "입니다.");
								System.out.println("버스 " + bus.busName + "번의 승객은 " + bus.passengerCount + "명이고 수입은"
										+ bus.money + "입니다.");
							}
						}
					} else if (secondChoice == 4) {
						System.out.println("몇 번 버스에서 내리시겠습니까?");
						int busnum = sc.nextInt();

						for (Bus bus : busList) {
							if (bus.busName == busnum) {
								s.takeOutBus(bus);
								System.out.println(s.studentName + "님 " + bus.busName + "번 버스에서 내렸습니다. 굿바이~~");
								System.out.println(s.studentName + "님의 남은 돈은 " + s.money + "입니다.");
								System.out.println("버스 " + bus.busName + "번의 승객은 " + bus.passengerCount + "명이고 수입은"
										+ bus.money + "입니다.");
							}
						}

					} else if (secondChoice == 5) {
						System.out.println("몇 번 지하철을 타시겠습니까?");
						String subnum = sc.next();
						for (Subway sub : subwayList) {
							if (sub.lineNumber.equals(subnum)) {
								s.takeSubway(sub);
								System.out.println(s.studentName + "님 " + sub.lineNumber + "번 버스를 탔습니다. 즐거운 하루 되세요.");
								System.out.println(s.studentName + "님의 남은 돈은 " + s.money + "입니다.");
								System.out.println("지하철 " + sub.lineNumber + "의 승객은 " + sub.passengerCount + "명이고 수입은"
										+ sub.money + "입니다.");
							}
						}
					} else if (secondChoice == 6) {
						System.out.println("몇 번 지하철에서 내리시겠습니까?");
						String subnum = sc.next();
						for (Subway sub : subwayList) {
							if (sub.lineNumber.equals(subnum)) {
								s.takeOutSubway(sub);
								System.out.println(s.studentName + "님 " + sub.lineNumber + "번 지하철에서 내렸습니다. 굿바이~~");
								System.out.println(s.studentName + "님의 남은 돈은 " + s.money + "입니다.");
								System.out.println("지하철 " + sub.lineNumber + "의 승객은 " + sub.passengerCount + "명이고 수입은"
										+ sub.money + "입니다.");
							}
						}
					} else if (secondChoice == 7) {
						break;
					}
				}
			}

		}

	}
}
