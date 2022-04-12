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
		Scanner scanner=new Scanner(System.in);
		System.out.println("한글 입력 >>");
		File file=new File("ch19/Ex06/input.txt");
		InputStream is=null;
		OutputStream os=System.out;
		
		os=new FileOutputStream(file);
		byte[] byteArray1=new byte[100];
		byteArray1=scanner.nextLine().getBytes();
	
		os.write(byteArray1);
		os.flush();
	
		
		byte[] byteArray2=new byte[100];
		int count;
		
		is = new FileInputStream(file);
		while ((count=is.read(byteArray2))!=-1) { 
			System.out.println(new String(byteArray2,Charset.defaultCharset()));
		}
		
		os.close();
		is.close();
				
		
		
		
	
		
		
	}
}
