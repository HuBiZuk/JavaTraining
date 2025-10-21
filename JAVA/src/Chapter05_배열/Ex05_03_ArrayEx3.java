package Chapter05_배열;

import java.util.Arrays;

public class Ex05_03_ArrayEx3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		//배열 arr에 1~5를 저장한다
		for(int i=0; i<arr.length; i++)
			arr[i] = i +1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length: ");
		
	}	
}
