package java11.chapter07.EscapingReferences;

public class Customer {
	private String name;

	public String getName() {
		return name;
	}

	public Customer(String name) {
		this.name = name;
	}
	
		public String toString() {
		return name;
	}
	
}
