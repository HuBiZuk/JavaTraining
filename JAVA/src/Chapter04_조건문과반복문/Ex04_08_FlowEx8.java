package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_08_FlowEx8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민번호를 입력: ");
		String regNo = scan.nextLine();
		
		char gender = regNo.charAt(7); //입력받은 번호의 8번째 문자를 젠더에 저장
		
		switch(gender) {
		case '1': case '3':
			System.out.println("당신은 남자 입니다.");
			break;
		case '2': case '4':
			System.out.println("당신은 여자 입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록 번호.");
		}

	}
}
