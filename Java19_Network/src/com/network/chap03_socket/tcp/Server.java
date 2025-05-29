package com.network.chap03_socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		//소켓
		ServerSocket serverSocket = null;
		Socket serviceSocket = null;
		
		//출력스트림
		PrintWriter out = null;
		
		//입력스트림
		BufferedReader in = null;
		
		
		try {
			serverSocket = new ServerSocket(8888);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("client 요청을 기다립니다.");
		
		try {
			serviceSocket = serverSocket.accept();
			System.out.println("client가 접속했습니다...");
			
			//1. client에게 받은 내용을 
			//입력
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
			
			//2. 다시 보내주겠다.
			//출력
			out = new PrintWriter(serviceSocket.getOutputStream(),true/*자동으로 플러시하겠다.*/);
			
			String inputLine = null;
			while((inputLine = in.readLine())!= null) {
				System.out.println("[클라이언트가 보낸 메시지: "+inputLine+"]");
				out.println(inputLine+"[확인]");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				out.close();
				in.close();
				serviceSocket.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
