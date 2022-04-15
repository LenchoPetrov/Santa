package project;

public class DollFactory extends WorkshopFactory {
	@Override
	public Toy createToy(String toyName) {
		if(toyName == "DOLL") {
			return new Doll();
		}
		System.out.println("Unknown toy");
		return null;		
	}
}
