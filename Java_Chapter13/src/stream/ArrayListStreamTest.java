package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		ArrayList<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream(); // 스트림 생성
		stream.forEach(s-> System.out.println(s)); // 배열의 요소 하나씩 출력
		System.out.println();
		
		sList.stream().sorted().forEach(s -> System.out.println(s));
		//스트림을 새로 생성 할껀데 오름차순으로 하나씩 출력해달라.
		
		
		
	}

}
