package socket;

import java.io.*;
import java.net.*;

public class BasicClientSocket {
	public static void main(String[] args) {
		try {
			//서버 주소와 포트번호를 지정하여 서버에 접속
			Socket mySocket = new Socket("127.0.0.1", 7070); 
			System.out.println(">> 서버 접속에 성공했습니다.");
			
			//서버 소켓에 스트림을 연결
			BufferedReader in = 
					new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out = 
					new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

			//서버 소켓에 메시지 전송
			String msg = "안녕하세요? 클라이언트입니다.";
			out.println(msg);
			out.flush();
			System.out.println("[클라이언트] " + msg);

			//서버 소켓으로부터 받은 메시지를 화면에 출력
			System.out.println("[서버] "+ in.readLine());

			//서버 소켓 종료
			mySocket.close();
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}