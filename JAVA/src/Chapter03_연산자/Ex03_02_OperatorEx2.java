package Chapter03_연산자;

public class Ex03_02_OperatorEx2 {
	public static void main(String[] args) {
		int i=5, j=0;
		
		j = i++;
		System.out.println("j=i++; 실행후, i="+i+",j="+j);
		
		i=5;	// 결과를 비교하기위해, i와 j의 값을 다시 5와 0으로 변경
		j=0;
		
		j= ++i;
		System.out.println("j=++i; 실행 후, i="+i+", "+j);
		
	}

}
