package javaProgrammingLanguage.Chapter02.변수;
/* 	형식화된 출력 - printf()
 * 
 *  # 지시자
 *	%b : boolean 형식으로 출력
 *	%d : 10진(decimal) 정수의 형식으로 출력 
 *	%o : 8진(octal) 정수의 형식으로 출력
 * 	%x, %X : 16진(hexa-decimal 정수의 형식으로 출력
 * 	%f : 부동 소수점(floating-point) 형식으로 출력
 *  %e, %E : 지수(exponent)표현식의 형식으로 출력
 *  %c : 문자(character) 로 출력
 *  %s : 문자열(String) 로 촐력	
 * 	%n : 줄바꿈을 넣는 포맷 지정자
 */


public class Ex02_04_PrintEx1 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger =10;
		long big = 100_000_000_000L; // long big = 1000000000000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum = 010; 	// 8진수 10, 10진수=8
		int hexNum = 0x10; 	// 16진수 10, 10진수 = 16
		int binNum = 0b10; 	// 2진수 10, 10진수 = 2 
		
		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d%n", c, (int)c);
		System.out.printf("finger = [%5d]%n", finger);
		System.out.printf("finger = [%-5d]%n", finger);
		System.out.printf("finger = [%05d]%n", finger);
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex);
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%2, %d%n", Integer.toBinaryString(binNum), binNum);
				
		

				
		
	}
	

}
