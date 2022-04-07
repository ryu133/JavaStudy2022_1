package Ex;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[]  = {95, 88, 76, 62, 55};
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("과목 이름 >> ");
			String name=scanner.next();
			for (int i = 0; i < score.length; i++) {
				if(course[i].equals(name)) {
					int n = score[i];
					System.out.println(name+"의 점수는 "+n);
					break;
				}
				if(i==course.length-1) {
					System.out.println("없는 과목임");
				}
			}
			
			 if (name.equals("그만")) {
					scanner.close();
					break;
			}
//			 else if(!course[0].equals(name)&&!course[1].equals(name)&&!course[2].equals(name)&&!course[3].equals(name)&&!course[4].equals(name)){
//				System.out.println("없는 과목입니다.");
//			}
		}
	}
}
