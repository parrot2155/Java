package com.chap02_throw;

import java.io.IOException;

public class MTest {

	public static void main(String[] args) /*throw IOException*/{//이제는 jvm이 알아서 처리하게 던진다.
		//throw
		//throws
		try {
			testA();
		}catch(IOException e) {
			e.printStackTrace(); //여기서 처리함.
		}
		
	}

	public static void testA() throws IOException{ //나도 처리 안함 ㅅㄱ
		testB();
	}
	public static void testB() throws IOException{ //나도 처리 안하고 던질거임.
		testC();
	}
	public static void testC() throws IOException{ //<-이 예외 발생해도 호출한 애한테 던져버릴거임
		System.out.println("Hi~");
		
		/*try {
			throw new IOException();//예외 발생시키기~!
		}catch(IOException e) {
			e.printStackTrace();
		}*/
		
		throw new IOException();
		
		
		
		
		//예외처리를 해야한다. 
		//1. try-catch : 예외가 발생하는 그 위치에서 예외를 처리하겠다.
		//				
	}
	
	
}
