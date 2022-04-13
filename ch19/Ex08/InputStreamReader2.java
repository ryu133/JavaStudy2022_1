package ch19.Ex08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;



public class InputStreamReader2 {
	public static void main(String[] args) {
		//1 콘솔 입력(MS949): default charset, byte 스트림

		//InputStreamReader : byte -> char로 변환
		//System.in: 콘솔 입력, byte
		//ist은 변환된 char 
		try {
			InputStreamReader isr=new InputStreamReader(System.in,"MS949");
			System.out.println("한글을 입력하세요. >>");
			int data;
			while ((data=isr.read())!='\r') { //콘솔 입력 대기
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println(isr.getEncoding());
		} catch (Exception e) {		}
		
		System.out.println("=========================");
	
		//2 콘솔 입력(UTF-8)
		try (InputStreamReader isr=new InputStreamReader(System.in,"UTF-8");) 
	{
		System.out.println("한글을 입력하세요. >>");
		int data;
		while ((data=isr.read())!='\r') { //콘솔 입력 대기
			System.out.print((char)data);
		}
		System.out.println();
		System.out.println(isr.getEncoding());
	} catch (Exception e) {		}
		
		
	}
}
