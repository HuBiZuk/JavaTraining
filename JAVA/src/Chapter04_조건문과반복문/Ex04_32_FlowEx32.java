package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_32_FlowEx32 {
	public static void main(String[] args) {
		int menu =0;
		int num =0;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요(종료=0) : ");
			
			String tmp = scan.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if(!(1 <= menu && menu <= 3)) {
				System.out.println("잘못입력");
				continue;
			}
			System.out.println("선택메뉴=" + menu + "번 입니다.");
			
		}
		
		

	}
} 
