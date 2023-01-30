package innerclass;

class OutClass1{ //외부 클래스
	private int num = 10; // 외부 클래스 private 변수
	private static int sNum = 20; // 외부 클래스 정적 변수
	

	private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언
	
	public OutClass1() {
		inClass = new InClass(); // 외부 클래스 디폴트 생성자. 외부 클래스가 생성되고 난 후에 내부 클래스 생성 가능
	}

	
	class InClass{
		int inNum = 100;
		//static int sInNum = 200; 내부 클래스에 정적 변수 선언 불가능. 오류 발생 
	
	
		void inTest() {
			System.out.println("OutClass num = " + num +"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum +"(외부 클래스의 정적 변수)");
		}
	
		//static void sTest(){} 정적 메서드 또한 생성 불가능 
		
		//왜 내부 클래스에는 정적 변수, 정적 메서드 생성이 불가할까? 
		/* 이유는, 내부 클래스 자체가 생성되는 방식이 외부 클래스가 생성되고 난 후에 탄생하는 규칙입니다. 
		 * 그에 반해, 정적 변수 및 메서드는 클래스와 상관없이 생성되므로 이 규칙을 꺨 수 있기 떄문에 하나의 약속입니다.
		 * */
	}
	public void usingClass() {
		inClass.inTest();
	}
	
}

public class InnerTest1 {

	public static void main(String[] args) {
		OutClass1 outClass = new OutClass1();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();

	}

}
