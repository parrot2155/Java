package com.test4.controller;

import com.test4.model.vo.Member;
import java.util.Arrays;
import java.util.Comparator;

public class MemberController {
    public static final int SIZE = 10;
    private int memberCount;
    private Member[] mem = new Member[SIZE];

    {
        mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    public int getMemberCount() { 
    	return memberCount; 
    }
    public Member[] getMem() { 
    	return mem; 
    }

    public Member checkId(String userId) {
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                return mem[i];
            }
        }
        return null;
    }

    public void insertMember(Member m) {
        if (memberCount < SIZE) {
            mem[memberCount++] = m;
        }
    }

    public Member searchMember(int menu, String search) {
        for (int i = 0; i < memberCount; i++) {
            switch (menu) {
                case 1: 
                	if (mem[i].getUserId().equals(search)) {
                		return mem[i]; 
                	}
                	break;
                case 2: 
                	if (mem[i].getName().equals(search)) {
                		return mem[i]; 
                	}
                	break;
                case 3: 
                	if (mem[i].getEmail().equals(search)) {
                		return mem[i]; 
                	}
                	break;
            }
        }
        return null;
    }

    public void updateMember(  Member m,int menu, String update) {
        switch (menu) {
            case 1: 
            	m.setUserPwd(update); 
            	break;
            case 2: 
            	m.setName(update); 
            	break;
            case 3: 
            	m.setEmail(update); 
            	break;
        }
        
    }

    public void deleteMember(String userId) {
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                for (int j = i; j < memberCount - 1; j++) {
                    mem[j] = mem[j + 1]; //인덱스 하나씩 앞으로 밀기
                }
                memberCount--;
                mem[memberCount] = null;//맨뒤자리 없애기
                break;
            }
        }
    }

    public Member[] sortIdAsc(int k) {
    	Member[] copy = mem.clone();
    	System.out.println(copy[0]);
    	Member[] str = new Member[SIZE];
    	
    	for(int i=0;i<memberCount-1;i++) {
    		for(int j=i+1;j<memberCount;j++) {
    			int res = copy[i].getUserId().compareTo(copy[j].getUserId());
    			if(res == 1) {
    				str[0]=copy[i];
    				copy[i]=copy[j];
    				copy[j]=str[0];
    			}
    		}
    	}
    	
//    	@Override 
//    	int compareTo(copy c) {
//            return c.getUserId() - getUserId();
//        }
    	
    	//배열에서 아이디값을 꺼내서 compareTo로 다른 아이디값이랑 계속 비교.
    	//원래 배열에서 꺼내서 비교해서 클론한 배열에 넣는데, 계속 비교하면서 두개씩 자리바꾸기 조건을 계속 실행한다...?
    	//이중for문 안에 조건문
    	//선택정렬 버블정렬
        return copy;
    }

    public Member[] sortIdDesc() {
	    	Member[] copy = mem.clone();
	    	System.out.println(copy[0]);
	    	Member[] str = new Member[SIZE];
	    	
	    	for(int i=0;i<memberCount-1;i++) {
	    		for(int j=i+1;j<memberCount;j++) {
	    			int res = copy[i].getUserId().compareTo(copy[j].getUserId());
	    			if(res == 1) {
	    				str[0]=copy[i];
	    				copy[i]=copy[j];
	    				copy[j]=str[0];///?s
	    			}
	    		}
	    	}

    	    return copy;
        
    }

    public Member[] sortAgeAsc() {
    	Member[] copy = mem.clone();
    	
	    	Member[] str = new Member[SIZE];
	    	
	    	for(int i=0;i<memberCount-1;i++) {
	    		for(int j=0;j<memberCount;j++) {
	    			if(copy[i].getAge()<copy[j].getAge()) {
	    				str[0]=copy[i];
	    				copy[i]=copy[j];
	    				copy[j]=str[0];
	    			}
	    		}
	    	}
		return copy;
        
    }

    public Member[] sortAgeDesc() {
		return null;
       
    }

    public Member[] sortGenderDesc() {
		return null;
        
    }
}
