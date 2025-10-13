package javaProgrammingLanguage.Chapter02.변수;


public class Ex02_11_FloatToBinEx {
	public static void main(String[] args) {

		// float 타입이 실제로 저장되는 지 확인하기
		
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f);
		
		System.out.printf("%f%n", f);
		System.out.printf("%x%n", i);	// 16진수로 출력
		
		
	}
}
