package Chapter03_연산자;

import java.util.Scanner;

//  논리 연산자

public class Ex03_25_OperatorEx25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
		
		System.out.println("문자를 하나 입력하세요.>");
		String input = scan.nextLine();
		ch = input.charAt(0);	// charAt = 맨앞 한글자만 사용
		
		if('0'<= ch && ch <= '9') {
			System.out.printf("입력하긴 문자는 숫자입니다. %n");
		}
		if(('a'<=ch && ch <= 'z') || ('A'<=ch && ch <='z')) {
			System.out.printf("입력하신 문자는 영문자 입니다. %n");
		}

		
	}

}
