package com.network.chap03_socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
	//데이터 수신
	//포트넘버를 맞춰줘서 받아야 한다.
	
	public static void main(String[] args) throws IOException {
		//소켓
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("클라이언트입니다.");
		
		//저장할 배열 생성
		byte[] buff = new byte[1024];
		
		//패킷 수신
		DatagramPacket recievePac = new DatagramPacket(buff,buff.length);
		
		ds.receive(recievePac);
		
		//데이터 확인
		System.out.println(new String(recievePac.getData()));
		
		//종료
		ds.close();
		ds.disconnect();
		
		
		
	}
	
	
	
}












