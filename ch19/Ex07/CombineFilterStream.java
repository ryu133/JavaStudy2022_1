package ch19.Ex07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//하나의 기반 스트림에 Filter 스트림을 여러 개 혼합애서 사용 가능하다.
	//제일 마지막에 처리하는 스트림의 메소드 사용 여부에 따라 순서를 정할 수 있다.(제일 마지막에 사용할 스트림을 선언해야 함)

//기반 스트림 FileOutputStream : 파일에 쓰기(하드에 쓴다)
//필터 스트림 BufferedOutputStream, DataOutputStream
//B: 버퍼(RAM)를 사용해서 빠르게 처리
//D: 다양한 포맷 방식을 그대로 처리

public class CombineFilterStream {
	public static void main(String[] args) {
		//파일 생성
		File dataFile=new File("ch19/Ex07/file2.data");
		
		//데이터 쓰기
		try (OutputStream os=new FileOutputStream(dataFile);//기반 스트림
				BufferedOutputStream bos=new BufferedOutputStream(os);//Filter 스트림: 추가기능, 단동 사용(x)
				DataOutputStream dos=new DataOutputStream(bos);)//Filter 스트림: 추가기능, 단동 사용(x)
		{
			dos.writeInt(35);
			dos.writeDouble(5.8);
			dos.writeChar('A');
			dos.writeUTF("안녕하세요");
			dos.flush();
		} catch (Exception e) {		}
		
		//3 데이터 읽기
		try (InputStream is=new FileInputStream(dataFile); //기반 스트림
				BufferedInputStream bis=new BufferedInputStream(is); //Filter 스트림: 추가기능, 단동 사용(x)
				DataInputStream dis=new DataInputStream(bis);) //Filter 스트림: 추가기능, 단동 사용(x)
		{
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readUTF());
		} catch (Exception e) {		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
