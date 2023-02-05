package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;



class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >=s2.getBytes().length) {
			return s1;
		}
		else {
			return s2;
		}
	} // reduce()메서드가 호출될 때 불리는 메서드, 두 문자열 길이를 비교
	
	
	
	
	
}

public class ReduceTest {

	/*
	 * reduece()메서드 방식은 총 2가지 방법이 있다.
	 * 첫 째, reduce()메서드 방식을 이용하는 방식.
	 * 
	 * 둘 째, BinaryOperator 인터페이스를 구현한 클래스를 사용하는 방식.
	 * 
	 * 
	 * 두 개의 방식을 모두 사용해보자.
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~~", "hello", "Good Morning", "반갑습니다~~~"};
		
		System.out.println(Arrays.stream(greetings).reduce("", (s1,s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			}
			
			else {
				return s2;
			}
			
		}));
			
			
	
		
		
		
		
		//BinaryOperator인터페이스를 구현하여 사용 방식
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
