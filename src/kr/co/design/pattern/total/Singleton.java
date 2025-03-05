package kr.co.design.pattern.total;

public class Singleton {
	private static Singleton instance = null;

	// 외부에서 Singleton 생성자를 무분별하게 선언하지 못하게 private으로 선언
	private Singleton() {
	}

	public static Singleton getInstance() {
		// 오직 한 개의 instance만 선언할 수 있다.
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
