package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		/*
		//기존 배열에 요소에 대한 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); 
			
		}
		System.out.println();
		
		//스트림방식 
		Arrays.stream(arr).forEach(n -> System.out.print(n+" "));
		//forEach 괄호 안은 람다식 활용
		*/
		
		
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sumVal);
		System.out.println(count);
	}

}
