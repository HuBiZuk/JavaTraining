package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_05_FlowEx5 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해 주세요 : ");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}else if(score < 94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}else if(score < 84) {
				opt = '-';
			}
		}else if(score >= 70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			}else if(score < 74) {
				opt = '-';
			}
		}else if(score >= 60) {
			grade = 'D';
			if(score >= 68) {
				opt = '+';
			}else if(score < 64) {
				opt = '-';
			}
		}else {
			grade = 'F';
		}
		System.out.printf("당신의 학점은 %C%C 입니다. %n", grade, opt);
		
	}
}
