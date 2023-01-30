package innerclass;

class Outer2{
	
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {

			@Override
			public void run() { //익명 내부 클래스, Runnable 인터페이스 생성.
				System.out.println(i);
				System.out.println(num);
				
			}
			
		}; // 클래스 끝에 세미콜론(;)을 붙여줘야 한다.
	}
	
	
}
public class AnonymouslnnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerable = out.getRunnable(10);
		runnerable.run();
	

	}

}
