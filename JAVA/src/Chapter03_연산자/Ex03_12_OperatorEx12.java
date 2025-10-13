package Chapter03_연산자;

public class Ex03_12_OperatorEx12 {
	public static void main(String[] args) {
		
		char c1 = 'a';	// 아스키코드 97
		
//		char c2 = c1+1;		// 컴파일 에러
		char c2 = 'a'+1;	// 컴파일 에러 없음 : 아스키코드 98
		
		System.out.println(c2);
		
	}

}
