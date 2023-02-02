package lambda;


//기존 객체지향에서 인터페이스 구현 후 호출 방식
public class TestStringConcat {

	public static void main(String[] args) {
		StringConcatImpl sImpl = new StringConcatImpl();
		
		sImpl.makeString("Hello", "Java");
		//1번 여기까지는 클래스를 만들어 인터페이스를 구현하고 호출하는 방식(기존 방식)
		
		//2번 밑에부터는 람다식으로 구현
		StringConcat concat= (s1,s2) -> System.out.println(s1 + "  " + s2);
		//인터페이스형 변수에 람다식 대입하는 것(오리지널 방식)
		concat.makeString("Hello", "Java");
		
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+ "  " + s2);
				
			}
		}; //3번 익명 내부 클래스로 생성하는 람다식(사실상 2번과 동일한 속성임)
		
		
		concat2.makeString("Hello", "Java");
		
		
		

	}

}
