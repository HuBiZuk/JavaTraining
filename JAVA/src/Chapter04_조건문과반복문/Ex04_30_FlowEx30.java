package Chapter04_조건문과반복문;

import java.util.Scanner;

public class Ex04_30_FlowEx30 {
	public static void main(String[] args) {
		int sum =0;
		int i =0;
		
		while(true) {
			if(sum>100)
				break;
			++i;		// sum이 100이 넘으면 여기 실행안함
			sum += i;	// 
		} //end of while
		System.out.println("i= " + i);
		System.out.println("sum= " + sum);
		
	}
} 
