package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String myTurn = null;
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보! >> ");
			int n = (int)(Math.random()*3);
			myTurn=scanner.next();
			
			if (myTurn.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				scanner.close();
				break;
			}
			else {
				if(str[n].equals("가위")) {
					if (myTurn.equals(str[0])) {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 비겼습니다.");
					}
					else if (myTurn.equals(str[1])) {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 이겼습니다.");
					}
					else {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 졌습니다.");
					}
				}
				else if(str[n].equals("바위")) {
					if (myTurn.equals(str[0])) {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 졌습니다.");
					}
					else if (myTurn.equals(str[1])) {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 비겼습니다.");
					}
					else {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 이겼습니다.");
					}
				}
				else{
					if (myTurn.equals(str[0])) {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 이겼습니다.");
					}
					else if (myTurn.equals(str[1])) {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 졌습니다.");
					}
					else {
						System.out.println("사용자= "+myTurn+", 컴퓨터= "+str[n]+" 사용자가 비겼습니다.");
					}
				}
			}
			
			
		
			
		}
			
	}
}

