package chap11.lecture.p01object;

public class App05Equals {
	public static void main(String[] args) {
		Car car1 = new Car("kia", "k5");
		Car car2 = new Car("kia", "k5");
		
		System.out.println(car1.equals(car2)); // true : 만약 Car의 company와 model이 같으면
	}
}

class Car {
	private String company;
	private String model;
	
	public Car(String company, String model) {
		super();
		this.company = company;
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		if(obj instanceof Car) {
			Car c = (Car) obj;
			if(c.model.equals(this.company)) {
				return true;
			}
			if(c.model.equals(this.model)) {
				return true;
			}
		}
		return false;
		*/
		
		
		if(obj instanceof Car) {
			
			Car c = (Car) obj;
			return this.company.equals(c.company) && this.model.equals(c.model);
		
		}
		return false;
	}
	
}