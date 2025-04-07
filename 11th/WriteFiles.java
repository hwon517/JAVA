package basicio;

import java.io.*;

public class WriteFiles {
	public static void main(String[] args) {
		int data;
		FileInputStream fis;
		FileOutputStream fos;
		String inFname = "src/basicio/WriteFiles.java";
		String outFname = "src/basicio/WriteFiles.back";

		try {
			//읽을 파일 이름으로 FileInputStream 생성
			fis = new FileInputStream(inFname);
			//새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(outFname); 
			//한 바이트씩 읽어 FileOutputStream으로 출력
			while ((data = fis.read()) != -1) {
				fos.write(data); 
			} 	
			System.out.println(outFname + " : 파일이 생성되었습니다.");
		} catch (IOException e) {
			System.err.println(e); 
		}
	} // end main  
}