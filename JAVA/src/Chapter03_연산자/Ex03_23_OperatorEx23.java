package Chapter03_연산자;

//  비교 연산자

public class Ex03_23_OperatorEx23 {
	public static void main(String[] args) {
		
		float f = 0.1f;		//f에 0.10000000149011612
		double d = 0.1;		//d에 0.10000000000000001
		double d2 = (double)f;
		
		
		System.out.printf("10==10.0f %b%n", 10==10.f);
		System.out.printf("0.1==0.1f %b%n", 0.1==0.1f);
		System.out.printf("f=%19.17f%n", f);
		System.out.printf("d=%19.17f%n", d);
		System.out.printf("d2=%19.17f%n", d2);
		System.out.printf("d==f %b%n", d==f);
		System.out.printf("d==f2 %b%n", d==d2);
		System.out.printf("d2==f %b%n", d2==f);
		System.out.printf("(float)d==f %b%n", (float)d==f);
		
		// %b = boolean값을 표현
		
//		10==10.0f true
//		0.1==0.1f false 
//		f=0.10000000149011612
//		d=0.10000000000000000
//		d2=0.10000000149011612
//		d==f false
//		d==f2 false
//		d2==f true
//		(float)d==f true
		
		

		
	}

}
