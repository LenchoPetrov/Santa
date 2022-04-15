package project;

public abstract class WorkshopFactory {
	public abstract Toy createToy(String toyName);
	
	public Toy produceToy(String toyName) {
		Toy toy = createToy(toyName);
		toy.prepare();
		return toy;
	}
}