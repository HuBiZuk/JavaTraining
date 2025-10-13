package Chapter02_변수;

public class Ex02_01_VarEx1 {
	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000; // 변수 age값에 2000을 더해 변수 year에 저장
		age = age + 1; 	// 변수 age에 저장된 값을 1 증가시킨다.
		
		System.out.println(year);
		System.out.println(age);
		
		
	}
}
