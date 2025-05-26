package com.test01;

public class ArrayTest01 {
	
	public void testArray1() {
		//배열을 사용하는이유
//		int num1 = 10;
//		int num2 = 20;
//		int num3 = 30;
//		int num4 = 40;
//		int num5 = 50;
//		int num6 = 60;
//		
//		int sum = 0;
//		
//		sum += num1;
//		sum += num2;
//		sum += num3;
//		sum += num4;
//		sum += num5;
//		sum += num6;
		
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*10;
		}
		
		int sum = 0;
//		sum += arr[0];
//		sum += arr[1];
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
	}
	public void testArray2() {
		//배열 사용 방법
		//선언
		//자료형[] 변수명;
		//자료형 변수명[];
		//선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것.
//		int[] iarr;
//		char carr[];
//		
//		//할당
//		//new 타입[크기];
//		//new 연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자.
//		iarr = new int[3]; //3짜리 공간을 할당한 배열을 iarr변수에 참조시킴.
//		int size = 5;
//		iarr = new int[size]; //반드시 크기가 들어가야함. 크기를 할당하는 건데 크기를 지정 안하면 에러남.
		//배열 사이즈를 반드시 손으로 숫자로 넣지 않아도 됨.
		
		
		//선언과 할당
		int[] iarr = new int[5];
		char carr[] = new char[10];
		
		System.out.println("iarr: "+iarr);
		System.out.println("carr: "+carr);
		
		System.out.println("iarr의 hashcode: "+ iarr.hashCode());
		System.out.println("carr의 hashcode: "+ carr.hashCode());
		//메모리와 같은 하드웨어에 접근을 못하기 때문에 접근하기 위해서 해시값을 이용해 찾아간다.
		//주소는 아니지만 주소라고 생각하고 편하게 생각하자.
		//같은 해시는 같은 메모리공간이라고 생각하자.
		

		System.out.println("iarr의 길이: "+ iarr.length);
		System.out.println("carr의 길이: "+ carr.length);
		
		//
		double[] darr = new double[10];
		System.out.println("darr의 길이 : "+ darr.length);
		System.out.println("darr의 hashcode : "+ darr.hashCode());
		
		//배열의 길이 변경
		//darr.length = 30; //이렇게 못바꾼다.
		
		darr = new double[30]; //배열의 길이를 변경한 코드가 아닌, 새로운 배열을 할당하여 주소값을 덮어 씌운것.
		System.out.println("darr의 길이 : "+ darr.length);
		System.out.println("darr의 hashcode : "+ darr.hashCode());
		
		//배열 삭제
		//직접 할당된 배열을 삭제 불가. 걍 널값을 넣어놔야됨.-> 참조된 주소를 끊음.
		darr = null; //할당된 메모리 참조하는 주소를 없애버림. 
		//해당하는 배열은 아무도 참조하고 있지 않기 때문에(GC:Garbage Collector) 시간이 지나면 알아서 삭제가 된다. -> 자바가 메모리관리에 좋은점이다.
		
		//System.out.println("삭제 후 darr의 길이 : "+ darr.length);
		//error : java.lang.NullPointerException <-널값의 길이를 구한다? 불가능함.
		
	}
	
	public void testArray3() {
		//정수 값을 저장하는 크기가 5인 배열
		int[] iarr = new int[5];
		
		//System.out.println(iarr[0]);
		
		for(int i=0; i<iarr.length; i++) {
			System.out.println(iarr[i]);
		}
		//0출력.
		//heap영역은 값이 없는 공간이 존재할 수 없다.
		//배열을 선언하고 할당을 하면 지정된 값으로 초기화 진행.
		
		//char[] carr = new char[1];
		//System.out.println(carr[0]); //<=공백이 들어가있음.
		
		
		//퀴즈.
		//기본값 외의 값으로 채워 넣으면서 배열을 생성하고 싶다. 
		int[] iarr2= {11,22,33,44,55}; //js와 동일.
		for(int i=0; i<iarr2.length; i++) {
			System.out.println("iarr2 : "+iarr2[i]);
		}
		
	}
}












