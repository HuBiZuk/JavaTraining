package Chapter03_연산자;

// round 메서드 = 소수점 첫째자리에서 반올림을 하고 결과를 정수로 돌려줌

public class Ex03_18_OperatorEx18 {
	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);

		
	}

}
