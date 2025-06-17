
package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int no = 6;
		int cnt = 1;
		
		while(((n-1)/no)>=1) {
			cnt++;
			no=no+(cnt*6);
		}
		
		System.out.println(cnt);
	}
}
//1 1		6*n
//2 6
//3 12
//4 18