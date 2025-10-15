package Chapter03_연산자;

public class Ex03_15_OperatorEx15 {
	public static void main(String[] args) {
		
		
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase -32);
		System.out.println(upperCase);
		/*
		 * 소문자를 대문자로 변경
		 * - 대문자 A가 소문자 a 보다 코드값이 32가 적으므로 소문자 a 코드값에서 32를 빼면됨
		 *   반대는 더해줌  
		 *   
		 *   * char형과 int형 간의 뺄셈연산 결과는 ini형이므로 연산 후 char형으로 다시 
		 *   	형변환 해야함
		 */
		
		
	}

}
