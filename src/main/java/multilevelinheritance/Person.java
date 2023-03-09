package multilevelinheritance;

public class Person {

	private String name;
	private String place;

	public void setName(String name) {
		this.name = name;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Place is " + place);

	}

}
