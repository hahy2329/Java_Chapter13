package lambda;

//기존 객체지향에서 인터페이스 구현방식
public class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "  " + s2);
		
	}

}
