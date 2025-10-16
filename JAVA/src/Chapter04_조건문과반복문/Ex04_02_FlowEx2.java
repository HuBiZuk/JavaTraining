package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_02_FlowEx2 {
	public static void main(String[] args) {
		int input;
		System.out.print("숫자 하나를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0){
			System.out.println("입력숫자는 0");
		}
		if(input!=0){
			System.out.println("입력숫자는 0이 아님");
			System.out.printf("입력숫자는 %d입니다.", input);
			
		}
	}

}
