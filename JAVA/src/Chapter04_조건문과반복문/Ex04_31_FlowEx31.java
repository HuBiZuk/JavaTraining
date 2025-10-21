package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_31_FlowEx31 {
	public static void main(String[] args) {
		for(int i= 0; i<=10; i++) {
			if(i%3==0) 
				continue;	// 블럭의 끝으로 이동 반목문을 벗어나진 않음
			System.out.println(i);
			
		}
	}
} 
