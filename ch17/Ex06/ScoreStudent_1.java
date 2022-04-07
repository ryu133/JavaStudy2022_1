package ch17.Ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//1. 학생수: 임의의 학생수 값을 입력했을 때 ArrayList의 capacity 크기 지정
//2. 점수 입력: 입력받은 학생 수에 따라서 점수 입력. ArrayList에 객체로 저장.(for문으로)
//3. 점수 리스트: ArrayList의 student 객체를 가져와서 score(점수) 출력
//4. 분석: 최고점수, 평균점수 출력
//5. 종료: 루프 탈출

/*
 *1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
----------------------------------------------------
선택> 
1
학생수를 입력하세요 : 
5
입력완료
----------------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
----------------------------------------------------
선택> 
2
학생수 만큼 점수를 입력하시오 : 
1 번 학생 점수를 입력하세요 : 60
입력완료
2 번 학생 점수를 입력하세요 : 70
입력완료
3 번 학생 점수를 입력하세요 : 80
입력완료
4 번 학생 점수를 입력하세요 : 90
입력완료
5 번 학생 점수를 입력하세요 : 100
입력완료
----------------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
----------------------------------------------------
선택> 
3
60
70
80
90
100
----------------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
----------------------------------------------------
선택> 
4
최고점수 : 100
평균점수 : 80.0
----------------------------------------------------
1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
----------------------------------------------------
선택>
 
 */

class Student{
	int score; //객체 생성 & 생성자 & setter 로 값 할당
				//private 일 경우 생성자와 setter로 값 할당 가능
	
	Student(){}
	
	Student(int score){
		this.score=score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}

public class ScoreStudent_1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<Student> arr = new ArrayList<Student>();
		
		
        boolean run = true;
        int studentNum = 0;
        while(run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.println("선택> ");
            int selectNo = scanner.nextInt(); 

            if(selectNo == 1) {
                System.out.println("학생수를 입력하세요 : ");
                studentNum=scanner.nextInt();
                System.out.println("입력완료");
                
            } else if(selectNo == 2) {
            	//(studentNum)번 학생 점수를 입력하세요 : (점수) 
            	//입력완료
            	if (studentNum==0) {
					System.out.println("학생 수를 먼저 입력하세요.");
				}else {
					for (int i = 0,j=1; i < studentNum; i++,j++) {
						Student student=new Student(); //직접 필드 score 에 값 할당
						System.out.print(j+"번 학생 점수를 입력하세요 : ");
						student.score=scanner.nextInt();
						arr.add(i, student);
						System.out.println("입력완료");
						try {
							arr.remove(j);
						} catch (Exception e) {}
					}
				}
					
            } else if(selectNo == 3) {
            	//점수 리스트 출력, 객체 생성 후 필드의 값 직접 출력 or getter로 출력
        		for (int i = 0; i < studentNum; i++) {
//        			System.out.println(arr.get(i));
        			Student student=arr.get(i);
//        			System.out.println(student.score);
        			System.out.println(student.getScore());
				}
            	
             
            } else if(selectNo == 4) {
            	
            	if (studentNum==0) {
					System.out.println("학생 수를 먼저 입력하세요.");
				}else {
					int maxScore=0;
					int sum=0;
            		for (int i = 0; i < arr.size(); i++) {
            			Student student=arr.get(i);
            			maxScore=(student.score>maxScore)?student.score:maxScore; //3항 연산자
            			sum+=student.score;
//            			if (student.score>maxScore) {
//            				maxScore=student.score;
//            			} 
            		}	
            		System.out.println("최고점수 : " + maxScore);
            		System.out.println("평균점수 : " + (float) sum / studentNum);
				}
         
            } else if(selectNo == 5) {
            	
            	run=false;
            	//break;
              }
        }
        scanner.close();
        System.out.println ("프로그램 종료");
	}
}
