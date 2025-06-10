package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=0;i<n;i++) {
			StringBuffer str = new StringBuffer(sc.next());
			for(int j=0;j<str.length();j++) {
				if(j<(str.length()-1)){
					if(str.charAt(j)!=str.charAt(j+1)) {
						str.insert(j+1," ");
						j++;
					}
				}
				
			}
			boolean chk = false;
			String[] ch = str.toString().split(" ");
			for(int j=0;j<ch.length;j++) {
				for(int k=(j+1);k<ch.length;k++) {
						if(ch[j].charAt(0)==ch[k].charAt(0)){
						chk = true;
						break;
					}
				}
			}
			if(chk != true) {
				cnt++;
			}	
		}
		System.out.println(cnt);
	}
}