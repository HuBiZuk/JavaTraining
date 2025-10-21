package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_27_FlowEx27 {
	public static void main(String[] args) {

		int num;
		int sum = 0;
		boolean flag = true; // while 조건식으로 사용
		Scanner scan = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요.(0=end)");
		
		while(flag) {	
			System.out.print("입력: ");
			
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum += num;
			}else {
				flag = false;
			}
		}
		System.out.println("합계: " + sum);
		
		
		
	}	
} 
