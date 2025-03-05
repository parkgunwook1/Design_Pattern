package kr.co.design.pattern.total.observer;

public class Main {

	public static void main(String[] args) {
		Duck duck = new Duck();
		Observer observer = new Observer(duck , "park");
		Observer observer1 = new Observer(duck , "gun");

		duck.setStudyHours(3);
	}

}
