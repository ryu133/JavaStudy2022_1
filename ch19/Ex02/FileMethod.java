package ch19.Ex02;

import java.io.File;

public class FileMethod {
	public static void main(String[] args) {
		//1 C:\에 작업 폴더 생성
		File tempDir=new File("C:/temp");
		if (!tempDir.exists()) {tempDir.mkdir();}
		
		//2 파일 객체 생성 (C:\Windows)
		File file=new File("C:/Windows");
		
		//3 파일 객체의 여러 메소드 사용
		System.out.println("절대 경로 출력: "+file.getAbsolutePath());
		System.out.println("폴더의 존재 유무: "+file.isDirectory());
		System.out.println("파일의 존재 유무: "+file.isFile());
		System.out.println("파일/폴더 이름 출력: "+file.getName());
		System.out.println("부모 폴더 출력: "+file.getParent());
		
		File newFile1=new File("C:/temp/abc");
		System.out.println(newFile1.mkdir()); //폴더를 생성한 경우 true 이미 존재해서 생성하지 못한 경우 false
			//여러 이유로 인해 false: 생성하지 못했다. (권한 문제라거나 이미 존재하거나 등)
		System.out.println(newFile1.exists());
		
		File newFile2=new File("C:/temp/bcd/cde"); //하위의 폴더를 한번에 생성하기
		System.out.println(newFile2.mkdir()); //false, 하위폴더까지 생성 불가
		System.out.println(newFile2.mkdirs()); //true, 하위폴더까지 생성
		
		
		File newFile3=new File("C:/temp/def/hij/klm");
		System.out.println(newFile3.mkdirs()); //생성하면 true, 생성하지 못하면 false
		
		//4 File 객체를 사용해서 하위 폴더의 정보 추출
		File[] fname=file.listFiles(); //file: "C:/windows"하위의 모든 폴더나 파일의 이름을 File 배열에 저장
		for (File k : fname) {
			System.out.println((k.isDirectory()?"폴더: ":"파일: ")+k.getName());
		}
		
		
		
		
		
		
	}
}
