package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_11_FlowEx11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 입력(-)포함: ");
		String regNo = scan.nextLine();
		char gender = regNo.charAt(7); // 8번째임 7번째 아님

		switch (gender) {
		case '1': case '3':
			switch (gender) {
			case '1':
				System.out.println("2000년 이전 출생 남자");
				break;
			case '3':
				System.out.println("2000년 이후 출생 남자");
			}
			break;
		case '2': case '4':
			switch(gender) {
			case '2':
				System.out.println("2000년 이전 출생 여자");
				break;
			case '4':
				System.out.println("2000년 이후 출생 여자");
				break;
			}
			break;
		default:
			System.out.println("유효하지 않는 주민번호 입니다.");
		}
		
	}
}
