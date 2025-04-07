package basicio;

import java.io.*;

public class ReadFiles {
	public static void main(String[] args) {
		int data;
		//읽을 파일 이름 지정
		String fname = "src/basicio/ReadFiles.java";
		
		try {
			//읽을 파일 이름으로 FileInputStream 생성
			FileInputStream fis = new FileInputStream(fname);
			//한 바이트씩 읽어 문자로 변환하여 출력
			while ((data = fis.read()) != -1) {
				char c = (char) data;
				System.out.print(c); 
			} 
		} catch (FileNotFoundException e) {
			System.err.println("다음 파일이 없습니다. : " + fname); 
		} catch (IOException e) {
			System.err.println(e); 
		}
		System.out.println();
	} 
}

//public FileInputStream(String filename) throws FileNotFoundException
//public FileInputStream(File file) throws FileNotFoundException
//public FileInputStream(FileDescriptor fd)

