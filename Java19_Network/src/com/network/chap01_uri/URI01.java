package com.network.chap01_uri;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class URI01 {
	public static void main(String[] args) throws URISyntaxException, IOException {
		//URI 클래스
		URI u = new URI("https://www.google.com/search?q=%EC%82%AC%EA%B3%BC&oq=&gs_lcrp=EgZjaHJvbWUqBggAEEUYOzIGCAAQRRg7MgoIARAuGLEDGIAEMg0IAhAAGIMBGLEDGIAEMgoIAxAAGLEDGIAEMgcIBBAAGIAEMgcIBRAuGIAEMhAIBhAuGK8BGMcBGLEDGIAEMgcIBxAAGIAEMhAICBAuGIMBGNQCGLEDGIAEMhAICRAuGIMBGNQCGLEDGIAE0gELMzg5MzU2MWowajeoAgCwAgA&sourceid=chrome&ie=UTF-8");
		
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getQuery());//url에서 데이터를 주고받는 부분);
				
				
		URL url = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0azWb7Rl8nurvcSMYBgDVjG0YDP56OGYFaA&s");
		 
		
		URLConnection urlConn = url.openConnection();
		
		//입력스트림, 네트워크 상에 존재하는 이미지를 읽어온다.이미지를 읽어온다.
		DataInputStream di = new DataInputStream(urlConn.getInputStream());
		
		//출력스트림. 입력받은 이미지를 내컴퓨터에 저장
		FileOutputStream fo = new FileOutputStream("java.png");
		
		byte[] b = new byte[1];
		while(di.read(b,0,1) != -1) {
			fo.write(b,0,1);
		}
		System.out.println("완료");
		di.close();
		fo.close();
	}
}















