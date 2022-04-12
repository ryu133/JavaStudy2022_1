package ch19.Ex04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileInputStream2 {
	public static void main(String[] args) throws IOException {
		//1 입력 파일 생성
		File inFile=new File("ch19\\Ex04\\FileInputStream1.txt");
		
		InputStream is=null;//객체 선언 //finally 블록에서 close()를 사용하기 위해
		
		//2. #1 byte 단위 읽기 (한 바이트씩 읽어서 처리)
		try {
			is=new FileInputStream(inFile); //객체 생성
			int data;
			while ((data = is.read()) !=-1) { //영문만 있으므로 read()만 사용, 한글일 경우 read(byte 배열)
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} finally {
			if (is !=null) {
				try {
					is.close(); //null일 때 close를 하면 IOException 발생
				} catch (IOException e) {
					
				}
			}
		}
		
		
		
		System.out.println("\n======try-with resource{} 로 구현하기===========");
		
		
		try (InputStream is1_1=new FileInputStream(inFile);){
//			try(with resource: 객체 생성) <= close()가 자동으로 됨, FileInputStream Closeable 인터페이스를 구현
			int data;
			while ((data = is1_1.read()) !=-1) { //영문만 있으므로 read()만 사용, 한글일 경우 read(byte 배열)
				System.out.print((char)data);
			}
		} catch (IOException e) {
			System.out.println("파일을 찾지 못했습니다.");
		} 
		
		System.out.println();
		System.out.println();
		
		//3. #2-1 n-byte 단위로 읽기(byte[]의 처음 위치에서부터 읽은 데이터 저장): 여러 바이트를 동시에 읽어서 처리속도가 빠름
			//배열의 방의 크기만큼 읽어와서 byte배열에 저장
		InputStream is2=new FileInputStream(inFile); //throws로 처리
		byte[] byteArray1=new byte[9]; //배열방 9개, 0~8까지
		int count1;
		while ((count1=is2.read(byteArray1))!=-1) { //-1: 파일의 마지막까지
				//is2.read(): 1byte씩 읽는다			//한글 처리 못함
				//is2.read(byteArray1): 9byte씩 읽는다. byteArray1에 저장
				//count1: 9, 9, 2
			for (int i = 0; i < count1; i++) {
				System.out.print((char)byteArray1[i]);
			}
//			System.out.println(": count1= "+count1);
//			System.out.println();
//			System.out.println("==========================");
//			String str=new String(byteArray1,Charset.forName("MS949"));
//			System.out.println(str);
		}
		System.out.println();
 
		is2.close();
		
		//3. #2-2 n-byte 단위로 한글 읽기(배열 단위로 읽어서 한글 처리)
		InputStream is3=new FileInputStream(inFile);
		byte[] byteArray2=new byte[100];
		int count2;
		
		while ((count2=is3.read(byteArray2))!=-1) { //count2=100,-1
			System.out.println(new String(byteArray2,Charset.forName("MS949")));
		}
		is3.close();
		
		System.out.println("=================");
		
		//4 #3 n-byte 단위로 읽어서 저장. offset,length 사용
		InputStream is4=new FileInputStream(inFile);
		byte[] byteArray3=new byte[9];
		
		int offset=3;
		int length=6;
		int count3=is4.read(byteArray3,offset,length); 
		//length만큼 앞에서 읽어와서 byte[]에 offset위치에 저장
		
		for (int i = 0; i < (offset+count3); i++) {
			System.out.print((char)byteArray3[i]);
		}
		
		is4.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
