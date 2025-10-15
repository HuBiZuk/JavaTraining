package Chapter03_연산자;

// 소수점 버리고 반올림학기

public class Ex03_17_OperatorEx17 {
	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		System.out.println(shortPi);

		
	}

}
