package com.test01;

import java.util.Scanner;

public class SwitchTest01 {
	/*switch(조건){
		case 값1:
		case 값2:  (세미콜론 아님. 그냥 콜론이 들어감.
	}
	*/
	
	public void test1() {
		int no = 1;
		
		switch(no) {
			case 1: System.out.println("1입니다.");
				return;//메소드를 종료
			case 2: System.out.println("2입니다.");
				break;//해당하는 스위치문만 종료
			case 3: System.out.println("3입니다.");
				break;
			default:
				System.out.println("다른 숫자입니다.");
		}
		
		char ch = 'e';
		
		switch(ch) {
		case 'a':
			System.out.println("a입니다.");
			break;
		case 'b':
			System.out.println("b입니다.");
			break;
		case 'c':
			System.out.println("c입니다.");
			return;
		default:
			System.out.println("다른 알파벳 입니다.");
		}
		//break와 return 차이 : break일때는 switch문을 끝냄. return일 경우에는 메소드를 끝냄.(return 받으면 뒤에 메소드 다 실행 안됨.)
		
		//return; 사실 메소드 맨 밑에는 return이 숨겨져있다고 생각하면 된다.
	}
	
	public void test2() {
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		System.out.print("month 입력");
		String month = sc.next();
		//사계절 판단.
		
		switch(month) {
		case "1":  //실행할게 없으면 밑에거 실행함. -> 동일한 처리결과를 처리할때 사용함.
		case "3":
		case "5":
		case "7":
		case "8":	
		case "10":
		case "12":
			System.out.println("31일 까지 있는 달입니다.");
			break;
		case "2":
			System.out.println("28일or29일 까지 있는 달입니다.");
			break;
		case "4":
		case "6":
		case "9":
		case "11":
			System.out.println("30일 까지 있는 달입니다.");
			break;
		
		default:System.out.println("1~12까지 입력해야 합니다.");
		}
	}
	
	
	
}





