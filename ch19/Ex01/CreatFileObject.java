package ch19.Ex01;

import java.io.File;
import java.io.IOException;

//주의 : 이클립스에서 파일을 생성 시 C:\에 생성할 때 권한 문제로 오류가 발생할 수 있다.
	//관리자 권한으로 이클립스 실행하거나 C 아래에 폴더 생성

//File 객체 내의 폴더 식별자를 적용할 경우
	//C:\abc\abc.txt

//1 windows인 경우 : String path="C:\\abc\\abc.txt"        ""내에 특수문자를 처리하기 위한 기호. \
	//window 10인 경우 : String path="C:/abc/abc.txt"
//2 Mac인 경우 : String path="C:/abc/abc.txt" 

//호환을 위해 공통적으로 사용할 수 있는 코드 작성하는 법
//String path="C:"+File.separator+"abc"File.separator+"abc.txt"

public class CreatFileObject {
	public static void main(String[] args) throws IOException {
		//1 File 객체를 사요애서 폴더 생성. 해당 파일이나 폴더가 존재하지 않는 경우
		File tempDir=new File("C:/temp001");
		if (!tempDir.exists()) { //해당 경로에 파일이나 폴더가 존재하면 true 아니면 false
			tempDir.mkdir(); //폴더 생성
		}
		System.out.println(tempDir.exists());
		
		//2 File 객체를 사용해서 파일 생성
		File newFile = new File("C:/temp001/newfile.txt"); 
		//C:\ 파일을 생성랗 경우 권한 문제로 파일 생성 예외 발생 시 이클립스를 관리자 권한으로 실행
		if (!newFile.exists()) {
			newFile.createNewFile(); //File을 생성할 때 예외가 발생할 수 있다. 예외처리 필요
		}
		System.out.println(newFile.exists());
		
		//3 파일 구분자
		File newFile2=new File("C:\\temp001\\newfile01.txt"); //windows10 하위 버전용
		File newFile3=new File("C:/temp001/newfile02.txt"); //windows10, Mac
		if (!newFile2.exists()) {newFile2.createNewFile();}
		if (!newFile3.exists()) {newFile3.createNewFile();}
		System.out.println(newFile2.exists());
		System.out.println(newFile3.exists());
		
		//모든 OS에서 공통으로 식별 가능한 코드
		File newFile4=new File("C:"+File.separator+"temp001"+File.separator+"newfile01.txt");
		if (!newFile4.exists()) {newFile4.createNewFile();}
		System.out.println(newFile4.exists());
		
		//4 절대 경로로 처리: 다른 시스템으로 이동된 경우 그 시스템 환경에 맞도록 설정이 필요
		File newFile5=new File("C:/temp001/newfile05.txt");
		System.out.println(newFile5.getAbsolutePath()); //file 객체에 저장된 파일의 절대 경로를 출력
		
		//5 상대 경로로 처리 <= 권장
		//현재 나의 작업 폴더의 위치
		System.out.println(System.getProperty("user.dir"));
			//이클립스 실행 폴더 위치
		File newFile6=new File("newfile06.txt");
		if (!newFile4.exists()) {newFile6.createNewFile();}
		System.out.println(newFile6.getAbsolutePath());
		
		
		
		
		
	}
}
