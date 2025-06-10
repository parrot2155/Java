package com.test3.controller;

import java.util.Scanner;

import com.test3.model.vo.Product;

public class ProductController {
	Product[] pro = new Product[10];
	int count =0;
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int sel;
		do {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("번호를 입력 : ");
			sel = sc.nextInt();
			switch(sel) {
				case 1:
					productInput();
					break;
				case 2:
					productPrint();
					break;
				case 9:
					System.out.println("프로그램 종료.");
			}
		}while(sel != 9);

	}
	public void productInput() {
		System.out.println("----제품 정보 추가----");
		int i = 0;
		while(i<10) {
			pro[i] = new Product();
			
			System.out.println("제품 번호 입력 : ");
			pro[i].setPld(sc.nextInt());
			
			System.out.println("제품 이름 입력 : ");
			pro[i].setpName(sc.next());
			
			System.out.println("제품 가격 입력 : ");
			pro[i].setPrice(sc.nextInt());
			
			System.out.println("제품 세금 입력 : ");
			pro[i].setTax(sc.nextDouble());
			count++;
			i++;
			System.out.println("계속 추가하시겠습니까?(y/n) : ");
			String ctn = sc.next();
			if(ctn.equals("y")) {
				continue;
			}else if(ctn.equals("n")) {
				break;
			}
		}
		
	}
	
	public void productPrint() {
		for(int j=0;j<count;j++) {
			
				System.out.println(pro[j].information());
			
		}
		
	}
}
