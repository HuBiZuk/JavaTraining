package Chapter02_변수;

public class Ex02_02_VarEx2 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x: " + x + "y: " + y);
		
		tmp = x;
		x =  y;
		y = tmp;
		
		System.out.println("x: "+ x + "y: " + y);
		
		
		
	}
}
