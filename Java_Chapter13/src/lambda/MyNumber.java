package lambda;

@FunctionalInterface
public interface MyNumber {
	
	int getMaxNumber(int num1, int num2); // 추상 메서드 선언
	
	
	//함수형 인터페이스형은 하나의 메서드만 선언가능하다.
	//그 이유는 TestMyNumber 자바파일을 보면 MyNumber형인 maxNum변수는 하나의
	//람다식을 구현했기때문에 인터페이스 자바파일에서 두 개 이상의 메서드를 선언해 버리면 
	//혼동이 온다...
	
	//애초에 컴파일 오류를 막기위해 @FunctionalInterface를 만들어 주면 초반에 오류를 막을수 있다.  
}
