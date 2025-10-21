package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_07_FlowEx7 {
	public static void main(String[] args) {
		System.out.print("가위(1) 바위(2) 보(3) 중 하나를 입력");
		Scanner scan = new Scanner(System.in);
		
		int user = scan.nextInt(); 
		int com = (int)(Math.random() * 3) + 1; // 1~3 중 하나 핸덤 
		
		if(user==1) {
			System.out.println("YOU = 가위");
		}else if(user==2) {
			System.out.println("YOU = 바위");
		}else if(user==3){
			System.out.println("YOU = 보");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		
		if(com==1) {
			System.out.println("COM = 가위");
		}else if(user==2) {
			System.out.println("COM = 바위");
		}else if(user==3){
			System.out.println("COM = 보");
		}else {
			System.out.println("COM 오류남.");
		}
			
		
		switch(user -com) {
		case 2: case -1:
			System.out.println("졌습니다");
			break;
		case 1: case -2: 
			System.out.println("이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			break;
		}
		
		
	}
}
