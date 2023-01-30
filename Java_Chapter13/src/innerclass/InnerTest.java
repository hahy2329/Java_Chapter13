package innerclass;


class OutClass{ // 외부 클래스
	private int num = 10; // 외부 클래스 private변수
	private static int sNum = 20; // 외부 클래스 정적 변수(외부 클래스가 생성되지 않아도 사용 가능)
	
	static class InStaticClass{ //정적 내부 클래스
		int inNum = 100; // 정적 내부 클래스의 인스턴스 변수
		static int sInNum = 200; // 정적 내부 클래스의 정적 변수
		
		void inTest() { //정적 내부 클래스의 일반 메서드
 			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용");
 			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
 			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
		}
		
		static void sTest() {
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용");
		}
		
	}
		
		
	
	
	
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		// 외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();
		System.out.println("정적 내부 클래스의 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
		

	}

}
