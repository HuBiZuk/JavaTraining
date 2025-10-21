package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_33_FlowEx33 {
	public static void main(String[] args) {

		// for문에 Loop1 이라는 이름 붙이기
		Loof1 : for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5)
						break Loof1;	// 루프탈출
//						break;			// for 탈출
//						continue Loof1; // 루프 끝으로
//						continue;		// for 끝으로
					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println();
		}
	}
} 
