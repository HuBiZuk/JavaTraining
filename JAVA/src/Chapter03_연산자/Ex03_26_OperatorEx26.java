package Chapter03_연산자;

import java.util.Scanner;

//  논리 연산자 : 효율적인 연산

public class Ex03_26_OperatorEx26 {
	public static void main(String[] args) {

		int a = 5;
		int b = 0;

		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a!=0 || ++b!=0 = %b%n", a!=0 || ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		System.out.printf("a==0 && ++b!=0 =%b%n", a==0 && ++b!=0);
		System.out.printf("a=%d, b=%d%n", a, b);
		
		
	}

}
