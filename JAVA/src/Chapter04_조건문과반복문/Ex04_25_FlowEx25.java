package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_25_FlowEx25 {
	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("숫자를 입력");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;
			System.out.printf("sum = %3d num = %d%n", sum, num);
			num /= 10;	// num = num /10; (num을 10으로 나눈 값을 다시 num 에 저장
		}
		System.out.println("각 자리수의 합: " + sum);
		
	}	
} 
