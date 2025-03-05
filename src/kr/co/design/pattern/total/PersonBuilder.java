package kr.co.design.pattern.total;

public class PersonBuilder {

	// builder 패턴을 사용하면 생성자의 매개변수가 많을 때 사용하면 명확성을 가질 수 있다.
	// 현업에서 10개가 넘는 생성자 변수가 많을 때를 흔히 볼 수 있는데
	// 이 때 builder 패턴의 도입이 시급함을 알 수 있다.
	
	private String name;
	private String address;

	private PersonBuilder() {

	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static class Builder {
		private String name;
		private String address;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public PersonBuilder build() {
			PersonBuilder person = new PersonBuilder();
			person.name = this.name;
			person.address = this.address;
			return person;
		}
	}

	public static void main(String[] args) {
		PersonBuilder person = new PersonBuilder.Builder()
				.setAddress("seoul").setName("park").build();

		person.getAddress();
		person.getName();
	}
}
