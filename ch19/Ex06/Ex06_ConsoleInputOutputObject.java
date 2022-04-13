package ch19.Ex06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Scanner;

//콘솔에서 배열 100byte 이하 한글을 입력받은 값을 input.txt에 저장, Charset.defaultCharset() 사용
//input.txt 파일에서 값을 읽어서 콘솔에 출력

//1 System.in : 콘솔에서 입력
//2 FileOutputStream : 입력받은 값을 파일에 저장하기 
//3 FileInputStream : 저장된 파일의 내용 읽어오기
//4 System.out : 콘솔에서 출력

public class Ex06_ConsoleInputOutputObject {
	public static void main(String[] args) throws IOException  {
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("한글 입력 >>");
//		File file=new File("ch19/Ex06/input.txt");
//		InputStream is=null;
//		OutputStream os=null;
//		
//		os=new FileOutputStream(file);
//		byte[] byteArray1=new byte[100];
//		byteArray1=scanner.nextLine().getBytes();
//	
//		os.write(byteArray1);
//		os.flush();
//	
//		
//		byte[] byteArray2=new byte[100];
//		int count;
//		
//		is = new FileInputStream(file);
//		while ((count=is.read(byteArray2))!=-1) { 
//			System.out.println(new String(byteArray2,Charset.defaultCharset()));
//		}
//		
//		os.close();
//		is.close();
				
		
		
		
		
		//1 콘솔에서 한글 입력 받기 (System.in) <=byte[] 배열을 생성해서 한글을 처리함.
		InputStream ips=System.in; //new로 생성하지 않고 연결만 설정, 콘솔에서 입력 값을 받음
		System.out.println("한글을 입력 하세요 >>");
		
		byte[] arr1=new byte[100];
		int count1=ips.read(arr1); //arr1에 byte로 \r,\n을 포함한 전체가 들어감. count1: 배열 안에 값이 들어간 개수
		//int data=ips.read(); //한글을 처리하지 못한다. data에는 1byte read한 값이 저장
		
		//2 입력받은 한글을 파일에 저장하기. (FileOutputStream)
		File f1=new File("ch19\\Ex06\\input.txt");
		OutputStream fos=new FileOutputStream(f1); //덮어쓰기
		
		fos.write(arr1); //버퍼(RAM)에만 쓰여짐
		fos.flush(); //버퍼에 쓰인 내용을 파일에 쓰기
		
		//3 저장된 파일에서 값을 읽기. (FileInputStream)
		InputStream fis=new FileInputStream(f1); //read(): 한글을 처리하지 못함. read(byte[]): 한글 처리 가능
		byte[] arr2=new byte[100];
		
		int count2=fis.read(arr2); //read(byte[]): 배열 단위로 읽는다
//		int data2=fis.read(); //read(): 1byte씩 읽는다
		
		//4 읽어온 배열을 콘솔에 출력 하기. (System.out)
		OutputStream ops=System.out; //콘솔에 출력: byte[]
		
		ops.write(arr2);
		ops.flush();
		
		ips.close();
		fis.close();
		fos.close();
		ops.close();
		
	}
}
