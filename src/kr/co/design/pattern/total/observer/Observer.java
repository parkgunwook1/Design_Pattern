package kr.co.design.pattern.total.observer;

public class Observer {
	
	// 공부를 하려는 Duck과 그런 Duck을 감시하는 Observer 클래스를 둔다.
	// Observer 생성자에게 duck 객체를 파라미터로 주입하고 , 해당 Duck 객체가 공부를 시작하면 
	// Observer들에게 그 사실을 알려준다.
	private Duck duck;
	private int studyHours;
	private String instanceName;
	
	public Observer(Duck duck , String instanceName) {
		this.duck = duck;
		this.instanceName = instanceName;
		duck.registerObserver(this);
	}
	
	public void update() {
		studyHours = duck.getStudyHours();
		display();
	}
	
	public void display() {
		System.out.println(instanceName + "님이 " + "Current conditions : " + studyHours + " hours");
	}

}
