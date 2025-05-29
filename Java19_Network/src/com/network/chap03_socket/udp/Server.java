package com.network.chap03_socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Server {
	//데이터 발신
	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket();
		System.out.println("서버입니다.");
		
		//보내고자 하는 data준비
		byte[] buff = "테스트 입니다.".getBytes();
		
		//datagramPacket 생성
		DatagramPacket sendPac = 
				new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),9999);
				
		//전송
		ds.send(sendPac);
		
		//종료
		ds.close();
		ds.disconnect();
		
	}
	
	
	
	
}












