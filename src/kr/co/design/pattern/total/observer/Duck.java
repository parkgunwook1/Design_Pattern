package kr.co.design.pattern.total.observer;

import java.util.ArrayList;
import java.util.List;

public class Duck {

	// 옵저버 패턴을 사용하면 그 객체의 상태에 관심을 가지고 있는 옵저버에게 해당 객체의 상태가 바뀌었음을 알릴 수 있다.
	// mvc 구조도 옵저버 패턴의 일종이라고 할 수 있다. -> 모델(데이터)이 변경되면 자동으로 뷰(인터페이스)가 새로 그려지기 때문이다.

	private List<Observer> observers;
	private int studyHours;

	public Duck() {
		observers = new ArrayList<>();
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public void setStudyHours(int studyHours) {
		this.studyHours = studyHours;
		startStudy();
	}

	private void startStudy() {
		notifyObservers();
	}

	public int getStudyHours() {
		return studyHours;
	}
}
