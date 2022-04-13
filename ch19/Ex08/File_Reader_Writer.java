package ch19.Ex08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//Reader / Writer : char 단위 입출력. 문자만 처리하도록 특화된 추상 클래스
		//인코딩에 덜 신경써도 됨
	//byte: 1byte
	//char: 2byte, UTF-16으로 처리, 영문과 한글 2byte, 고정길이, 모든 언어를 처리함

	//FileReader,Filewriter: charset 지정 옵션이 없다. default charset 사용

public class File_Reader_Writer {
	public static void main(String[] args) {
		//1 파일 객체 생성
		File rwFile=new File("ch19/Ex08/rwFile.txt");
		
		try (Writer writer=new FileWriter(rwFile);) {//Writer: 추상 클래스, FileWriter: Writer를 구현한 자식 클래스
			//OutputStream: byte단위 출력, 추상 클래스, FileOutputStream,  문자,데이터,MP3,JPG,AVG,.. 모든 처리
			//W r i t e r : char 단위 출력, 추상 클래스, FileWriter, 문자 특화해서 처리
			
			writer.write("안녕하세요\n".toCharArray()); //String -> Char[]
			writer.write("Hello\n"); 
			writer.write('A');
			writer.write('\r');
			writer.write('\n');
			writer.write("반갑습니다",2,3);
			writer.flush();
			
		} catch (IOException e) {}
		
		//2 FileReader를 이용한 파일 읽기(Default MS949) <= Charset 지정 옵션 없음
		try (Reader reader=new FileReader(rwFile);) {
			int data;
			while ((data=reader.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (Exception e) {		}
		

		
	}
}
