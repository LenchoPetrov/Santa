package project;

public class BicycleFactory extends WorkshopFactory {

	@Override
	public Toy createToy(String toyName) {
		if(toyName == "BICYCLE") {
			return new Bicycle();
		}
		System.out.println("Unknown toy");
		return null;		
	}
}
