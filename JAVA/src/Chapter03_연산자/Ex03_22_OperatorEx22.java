package Chapter03_연산자;

// // 비교 연산자

public class Ex03_22_OperatorEx22 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoerCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
		/* str2와 "abc" 의 내용이 같아도 객체가 다르기 때문에 ==로 배교하면 false 결과가 나옴
		*	equals()는 객체가 달라도 내용이 같으면 true를 반환한다
		* 	대소문자를 구별하지않고 구분 시에는 equalsIgnoreCase()를 사용  
		*
		*
		*/
	}

}
