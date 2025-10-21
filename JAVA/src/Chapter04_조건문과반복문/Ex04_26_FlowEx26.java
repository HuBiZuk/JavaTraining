package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_26_FlowEx26 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// i를 1씩 증가시켜서 sum에 꼐속 더해 나간다.
		while ((sum += i++) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
		}
		
		
	}	
} 
