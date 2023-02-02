package lambda;

interface PrintString{
	void showString(String str);
}


public class LambdaTest {

	public static void main(String[] args) {
		
		PrintString lambdaPrint = str -> System.out.println(str);
		//1번. 인터페이스형 변수에 람다식 대입 방식
		lambdaPrint.showString("test");
		
		
		
		
		//2번. 매개변수로 전달하는 람다식
		showMyString(lambdaPrint); //1번에서 만든 람다식 변수를 showMyString()이라는 메서드에 새로 대입.
								   // 즉 메서드이 매개변수로 람다식을 대입한 변수 전달
		
		
		
		PrintString reStr = returnPrint();
		reStr.showString("hello");
		

	}
	
	public static void showMyString(PrintString lambda) { //매개변수를 인터페이스형으로 받겠다.
		lambda.showString("test2");
	}
	
	public static PrintString returnPrint() {
		return s-> System.out.println(s + " world");
	}

}
