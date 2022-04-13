package ch19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

//InputStreamReader: byte 데이터를 char 포멧으로 변환하는 객체
	//byte 포맷은 인코딩을 잘 지정해야 함
	//char 포멧으로 바꾸면 인코딩 타입을 신경쓰지 않아도 됨


public class InputStreamReader1 {
	public static void main(String[] args) {
		//파일 객체 생성
		File isr=new File("ch19/Ex08/isr.txt"); //isr.txt는 UTF-8로 저장됨
		
		try (Reader reader =new FileReader(isr);) //FileReader는 인코딩 설정이 되지 않음. default Encoding만 사용함
		{
			int data;
			while ((data=reader.read())!=-1) { //MS949
				System.out.print((char)data);
			}
		} catch (Exception e) {		}
		
		System.out.println("\n=========================");
		
		//2 FileInputStream + InputStreamReader를 이용한 파일 읽기
			//InputStreamReader(is,"UTF-8");  byte -> char 변환
		try (InputStream is=new FileInputStream(isr);
				InputStreamReader isr1=new InputStreamReader(is, "UTF-8");) //isr1: char로 변환됨
		{
			int data;
			while ((data=isr1.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {		}

		
		
		
	}
}
