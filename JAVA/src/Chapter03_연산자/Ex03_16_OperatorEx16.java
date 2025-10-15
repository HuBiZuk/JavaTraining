package Chapter03_연산자;

// 형변환으로 소수점 버리기

public class Ex03_16_OperatorEx16 {
	public static void main(String[] args) {
		
		float pi = 3.141592f;
		float shortPi = (int)(pi * 1000) / 1000f;
		System.out.println(shortPi);
		
	}

}
