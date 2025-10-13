package javaProgrammingLanguage.Chapter02.변수;

import java.util.Scanner;

public class Ex02_06_ScannerEx {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두자릿수 정수 입력: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);	// 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용: " + input);
		System.out.printf("num=%d%n", num);
		
		
		
	}

}
