package by.academy.lesson8;

public class Phone {

	String number;
	String model;
	double height;
	
	public Phone() {
		super();
	}
	
	public Phone(String number, String model) {
		this.number = number;
		this.model = model;
	}
	
	public Phone(String number, String model, double height) {
		this(number,model);
		this.number = number;
		this.model = model;
		this.height = height;
	}
	
	public void receiveCall(String name) {
		System.out.println("Звонит " + name);
	}

	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "number: " + number + " model: " + model + " height: " + height;
	}
}
