package com.network.chap03_socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		Socket clientSocket = null;
		PrintWriter out = null;
		BufferedReader in = null;
		BufferedReader stdIn = null;
		
		try {
			clientSocket = new Socket("localhost",8888);
			System.out.println("server에 접속합니다.");
			
			//스트림을 만듭시다.
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			String inputLine = null;
			while((inputLine=stdIn.readLine())!=null) {
				out.println(inputLine);
				System.out.println("server로 부터 다시 받은 메시지: "+in.readLine());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				stdIn.close();
				in.close();
				out.close();
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//서버에서 연결요청을 기다리다가 accept를 통해 응답하고 클라이언트에서 보낸 값을 돌려보낸다.
		//로컬환경.기본적인 프로그램끼리 데이터 주고받기기능.
		
	}
}







