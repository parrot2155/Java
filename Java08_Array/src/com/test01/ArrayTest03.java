package com.test01;

public class ArrayTest03 {
	
	public void prn(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void shallowCopy() {
		//얕은 복사
		//주소만 복사한다.
		int[] oArr = {1,2,3,4,5};
		int[] cArr = oArr; 
		
		System.out.println("oArr");
		prn(oArr);
		System.out.println("cArr");
		prn(cArr); 
		//결과는 같지만 참조하는 주소만 복사한거기 때문에 같은 배열을 참조중인거임.
		
		//원본배열에 값을 변경
		oArr[0] = 99;
		
		System.out.println("oArr 변경 후");
		System.out.println("1.oArr");
		prn(oArr);
		System.out.println("2. cArr");
		prn(cArr);  //동일한 배열을 가리키고 있기 때문에 다 같이 바뀐다
		
		System.out.println("oArr의 해시코드 : "+ oArr.hashCode());
		System.out.println("cArr의 해시코드 : "+ cArr.hashCode());
		//참조하는 배열이 같기 때문에 해시코드도 같다.
	}
	
	public void deepCopy1() {
		//깊은 복사 - 동일한 새로운 배열  하나 생성하고 값만 복사해 오는 것
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[5];
		
		//for문을 이용하여 값을 1:1로 복사
		for(int i=0; i<oArr.length; i++) {
			cArr[i] = oArr[i];
		}
		System.out.println("[oArr]");
		prn(oArr);
		System.out.println("[cArr]");
		prn(cArr);
		
		//원본 배열의 값 변경해보자.
		oArr[0] = 99;
		
		System.out.println("변경 후");
		System.out.println("[oArr]");
		prn(oArr);
		System.out.println("[cArr]");
		prn(cArr);
		//값 안바뀜.
		
		System.out.println("oArr의 해시코드 : "+ oArr.hashCode());
		System.out.println("cArr의 해시코드 : "+ cArr.hashCode());
	}
	
	public void deepCopy2() {
		//arraycopy()
		//Syste.에 있는 arraycopy() 활용
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		System.arraycopy(oArr, 1, cArr, 3, 3);  //**
		 //.arraycopy(복사할 배열, 복사시작할인덱스, 받을 배열, 받을 배열 시작 인덱스, 받을 값 개수)
		System.out.println("[oArr]");
		prn(oArr);
		System.out.println("[cArr]");
		prn(cArr);
		
		System.out.println("oArr의 해시코드 : "+ oArr.hashCode());
		System.out.println("cArr의 해시코드 : "+ cArr.hashCode());
	}
	
	public void deepCopy3() {
		//clone() 이용한 복사
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		System.out.println("cArr의 해시코드 : "+ cArr.hashCode());
		
		cArr = oArr.clone(); //**
		
		System.out.println("[oArr]");
		prn(oArr);
		System.out.println("[cArr]");
		prn(cArr);
		
		System.out.println("oArr의 해시코드 : "+ oArr.hashCode());
		System.out.println("cArr의 해시코드 : "+ cArr.hashCode());
		//원본 배열을 통쨰로 복사하여 새로운 배열을 할당한다.
		//배열의 크기까지 똑같이 바뀐다.
		//해시값이 바뀌는걸 보면 클론으로 인해 복제된 새로운 배열을 리턴해주는것이다.
	}
}












