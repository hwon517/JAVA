package socket;

import java.io.*;
import java.net.*;

public class BasicServerSocket {
	public static void main(String[] args) {
		try {
			System.out.println(">> 서버를 시작합니다.");
			ServerSocket myServerSocket = new ServerSocket(7070);
			System.out.println(">> 클라이언트가 접속하길 기다리고 있습니다.");

			// 클라이언트 접속때까지 대기
			Socket mySocket = myServerSocket.accept(); 
			System.out.println(">> 클라이언트가 접속에 성공했습니다.");

			//클라이언트 소켓에 스트림을 연결
			BufferedReader in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
			PrintWriter out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

			//클라이언트 소켓으로부터 받은 메시지를 화면에 출력
			System.out.println("[클라이언트] "+ in.readLine());

			// 클라이언트 소켓에 메시지 전송
			String msg = "서버에 접속하신 것을 환영합니다!";
			out.println(msg);
			out.flush();
			System.out.println("[서버] " + msg);
			
			// 클라이언트 소켓 종료
			mySocket.close();
		} catch(IOException e) {
			System.out.println(e.toString());
		}
	}
}