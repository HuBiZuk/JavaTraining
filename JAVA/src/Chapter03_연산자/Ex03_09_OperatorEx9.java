package Chapter03_연산자;

public class Ex03_09_OperatorEx9 {
	public static void main(String[] args) {
		
		long a = 1_000_000 * 1_000_000;
		long b = 1_000_000 * 1_000_000L;

		System.out.println("a="+a);
		System.out.println("b="+b);
		
//		a=-727379968	오버플로우
//		b=1000000000000
	}

}
