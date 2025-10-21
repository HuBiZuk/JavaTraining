package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_28_FlowEx28 {
	public static void main(String[] args) {
		int input =0, answer =0;

		answer = (int)(Math.random()*100) +1;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("1~100사이 정수 입력 : ");
			input = scan.nextInt();
			
			if(input > answer) {
				System.out.println("더 작음");
			}else if(input < answer){
				System.out.println("더 큼");				
			}
			
		} while(input!=answer);	// 같지 않으면 while 반복 = 같으면 빠져나옴
		System.out.println("정답");
	
	}	
} 
