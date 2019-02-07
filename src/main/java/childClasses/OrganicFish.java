package childClasses;

import interfaces.Swims;
import orgRobClass.OrganicPet;

public class OrganicFish extends OrganicPet implements Swims {

	public OrganicFish(String name, String type, int age) {
		super(name, type, age);

	}

	public void swim() {
		System.out.println("is swimming...");
		
	}
	public void layEggs() {
		System.out.println("laid eggs...");
	}

	@Override
	public void energizePet() {

	}

}