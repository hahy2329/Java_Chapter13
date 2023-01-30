package innerclass;

class Outer{
	int outNum = 100;
	static int sNum =200;
	
	Runnable getRunnable(int i) { //Runnable 인터페이스는 자바에서 스레드를 만들 때 사용하는 인터페이스
		int num = 100; // 지역변수
		
		class MyRunnable implements Runnable{ // 지역 내부 클래스
			
			int localNum = 10; // 지역 내부 클래스의 인스턴스 변수
			
			@Override
			public void run() {
				// i = 20;  변수 i와 num은 지역변수인데, 지역 내부 클래스에서 사용하는 메서드의 지역변수는 모두 상수로 바뀌기에 바꿀수 x
				// num = 50;
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)" );
				System.out.println("sNum =" + sNum + "(외부 클래스 정적 변수) ");
				
				
			}
			
		}
		
		return new MyRunnable();
		
	}
}



public class LocalInnerTest {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		
		Runnable runner = out.getRunnable(10);
		runner.run();

	}

}
