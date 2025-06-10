package com.test4.view;

import java.util.Scanner;

import com.test4.controller.MemberController;
import com.test4.model.vo.Member;

public class MemberMenu {
	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		int sel = 0;
		while(true) {
			System.out.println("====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("6. 회원 정보 정렬");
			System.out.println("9. 프로그램 종료");
			System.out.println("실행할 항목 번호 입력 : ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch(sel) {
			case 1:
				insertMember();
				break;
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAllMember();
				break;
			case 6:
				sortMember();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			}
		}
		
	}
	
	public void insertMember() {
		if (mc.getMemberCount() >= MemberController.SIZE) {
            System.out.println("정원 초과");
            return;
        }
		
		System.out.print("아이디 입력: ");
        String id = sc.nextLine();

        if (mc.checkId(id) != null) {
            System.out.println("동일한 아이디 존재. 등록 실패");
            return;
        }
        System.out.print("비밀번호 입력: ");
        String pwd = sc.nextLine();
        
        System.out.print("이름 입력: ");
        String name = sc.nextLine();
        
        System.out.print("나이 입력: ");
        int age = sc.nextInt(); sc.nextLine();
        
        System.out.print("성별(M/F): ");
        char gender = sc.nextLine().charAt(0);
        
        System.out.print("이메일 입력: ");
        String email = sc.nextLine();

        Member m = new Member(id, pwd, name, age, gender, email);
        mc.insertMember(m);
        System.out.println("성공적으로 회원 등록 완료");
    }
	
	
	
	public void searchMember() {
		System.out.println("====== 회훤 정보 검색 ======");
        System.out.println("1. 아이디로 검색");
        System.out.println("2. 이름으로 검색");
        System.out.println("3. 이메일로 검색");
        System.out.print("메뉴 선택: ");
        int menu = sc.nextInt(); 
        sc.nextLine();

        System.out.print("검색어 입력: ");
        String search = sc.nextLine();
        Member result = mc.searchMember(menu, search);

        if (result != null) {
            System.out.println("검색 결과: " + result.information());
        } else {
            System.out.println("검색된 결과가 없습니다.");
        }
	}
	
	
	public void updateMember() {
		System.out.println("====== 회훤 정보 수정 ======");
        System.out.println("1. 비밀번호 수정");
        System.out.println("2. 이름 수정");
        System.out.println("3. 이메일 수정");
        System.out.print("메뉴 선택: ");
        int menu = sc.nextInt(); 
        sc.nextLine();
        
        System.out.print("변경할 회원 아이디: ");
        String id = sc.nextLine();
        
        if (mc.checkId(id) == null) {
            System.out.println("해당 아이디 없음");
            return;
        }
        Member m = mc.checkId(id);
        System.out.print("변경할 내용 ");
        String update = sc.nextLine();
        
        mc.updateMember(m, menu, update);
        
        System.out.println("업데이트 됨");
        
	}
	
	
	public void deleteMember() {
		System.out.print("삭제할 회원 아이디: ");
        String useId = sc.nextLine();
        if (mc.checkId(useId) == null) {
            System.out.println("해당 아이디 없음");
            return;
        }
        System.out.println("정말 삭제하시겠습니까?(y/n) : ");
        String yn = sc.next();
        
        if(yn.equals("y")) {
        	mc.deleteMember(useId);
        }
        System.out.println("회원 정보가 삭제되었습니다.");
        
	}
	
	
	public void printAllMember() {
		Member[] members = mc.getMem();
		System.out.println("====== 전체 회원 목록 ======");
		for (int i = 0; i < members.length; i++) {
			if(members[i]==null) {
				return;
			}else {
				System.out.println(members[i].information());
			}
            
        }
	}
	
	
	public void sortMember() {
		System.out.println("====== 회원 정보 정렬 ======");
        System.out.println("1. 아이디 오름차순");
        System.out.println("2. 아이디 내림차순");
        System.out.println("3. 나이 오름차순");
        System.out.println("4. 나이 내림차순");
        System.out.println("5. 성별 내림차순 (F > M)");
        System.out.print("메뉴 선택: ");
        int menu = sc.nextInt(); 
        sc.nextLine();
        
        switch (menu) {
        case 1:  
        	for(int i=0;i<10;i++) {
        		System.out.println(mc.sortIdAsc(i));
        	}
        	break;
        case 2:  
        	for(int i=0;i<10;i++) {
        		System.out.println(mc.sortIdDesc());
        	}
        	break;
        case 3:  
        	mc.sortAgeAsc(); 
        	break;
        case 4:  
        	mc.sortAgeDesc(); 
        	break;
        case 5:  
        	mc.sortGenderDesc(); 
        	break;
        default: 
        	System.out.println("잘못된 값입니다."); 
        	return;
        }
  
        
	}
}












