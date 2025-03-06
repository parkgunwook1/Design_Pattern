package kr.co.design.pattern.creational.abstractfactory;

public interface AbstractFactory {

	/**
	 * 추상 팩토리 패턴
	 * 
	 * 연관성이 있는 객체 군이 여러개 있을 경우 이들을 묶어 추상화하고, 어떤 구체적인 상황이 주어지면 팩토리 객체에서 집합으로 묶은 객체 군을
	 * 구현화하는 생성 패턴이다.
	 * 
	 * 클라이언트에서 특정 객체를 사용할 때 팩토리 클래스만을 참조하여 특정 객체에 대한 구현부를 감추어 역할과 구현을 분리시킬 수 있다. 즉 ,
	 * 추상 팩토리의 핵심은 제품 '군' 집합을 타입 별로 찍어낼 수 있다는 점이 포인트이다.
	 * 
	 * 모니터 , 마우스 , 키보드를 묶은 전자 제품군이 있는데 이들을 또 삼성 제품군이냐 애플 제품군이냐 로지텍 제품군이냐에 따라 집합이 브랜드
	 * 명으로 여러갈래로 나뉘게 될때, 복잡하게 묶이는 이러한 제품군들을 관리와 확장하기 용이하게 패턴화 한것이 추상 팩토리이다.
	 * 
	 * 즉, 추상 팩토리 패턴은 생성해야 할 객체 집합 군의 공통점에 초첨을 맞춘다.
	 */

	AbstractProductA createProductA();

	AbstractProductB createProductB();
}

// Product A1와 B1 제품군을 생산하는 공정군
class ConcreteFactory1 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}
}

// Product A2와 B2 제품군을 생산하는 공정군
class ConcreteFactory2 implements AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}

}