package JAVA연습;

import java.util.Scanner;

public class 사칙연산계산기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double result = 0;
		double num = 0;
		boolean run1 = true;

		System.out.println("계산기 시작!");
		while (run1) {
			boolean run = true;
			System.out.print("숫자를 입력: ");
			num = scan.nextDouble();
			scan.nextLine();
			result = num;

			while (run) {
				double num1 = 0;
				String sic = null;

				System.out.print("연산자를 입력: ");
				sic = scan.nextLine();

				switch (sic) {
				case "+":
					System.out.print("숫자를 입력: ");
					num1 = scan.nextDouble();
					scan.nextLine();
					result += num1;
					if (result % 1 == 0) {
						System.out.println("결과: " + (int) result);
					} else {
						System.out.println("결과: " + result);
					}
					break;

				case "-":
					System.out.print("숫자를 입력: ");
					num1 = scan.nextDouble();
					scan.nextLine();
					result -= num1;
					if (result % 1 == 0) {
						System.out.println("결과: " + (int) result);

					} else {
						System.out.println("결과: " + result);
					}
					break;

				case "x", "*":
					System.out.print("숫자를 입력: ");
					num1 = scan.nextDouble();
					scan.nextLine();
					result *= num1;
					if (result % 1 == 0) {
						System.out.println("결과: " + (int) result);
					} else {
						System.out.println("결과: " + result);
					}
					break;

				case "%", "/":
					System.out.print("숫자를 입력: ");
					num1 = scan.nextDouble();
					scan.nextLine();
					result /= num1;
					if (result % 1 == 0) {
						System.out.println("결과: " + (int) result);
					} else {
						System.out.println("결과: " + result);
					}
					break;

				case "=":
					if (result % 1 == 0) {
						System.out.println("결과: " + (int) result);
					} else {
						System.out.println("결과: " + result);
					}
					break;

				case "end":
					run = false;
					break;

				} // 스위치

			} // while
			System.out.println("종료");

		}

	} // main
} // class
