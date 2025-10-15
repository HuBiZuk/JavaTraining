package Chapter03_연산자;

import java.util.Scanner;

//  논리 연산자 : 논리 부정 연산자

public class Ex03_27_OperatorEx27 {
	public static void main(String[] args) {

		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b);
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!b=%b%n", !!!b);
		System.out.println();
		
		System.out.printf("ch = %c%n", ch);
		System.out.printf("ch<'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		System.out.printf("!('a'<ch && ch<='z')=%b%n", !('a'<=ch && ch <='z'));
		System.out.printf("'a'<ch && ch<='z')=%b%n", 'a'<=ch && ch <='z');
		
		
		
	}

}
