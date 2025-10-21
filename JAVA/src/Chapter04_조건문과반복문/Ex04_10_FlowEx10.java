package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_10_FlowEx10 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		System.out.print("점수를 입력하세요 (1~100) : ");

		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		score = Integer.parseInt(tmp);

		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'F';
		}
		System.out.println("학점은 : " + grade);
	}
}
