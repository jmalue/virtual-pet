import java.util.Scanner;

public class VirtualPetApp1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet1 myPet = new VirtualPet1((int) (Math.random() * 50 + 1), (int) (Math.random() * 50 + 1),
				(int) (Math.random() * 50 + 1));

		System.out.println("Hedwig the Owl");
		System.out.println("\nHunger:    " + myPet.getHunger());
		System.out.println("Water:     " + myPet.getWater());
		System.out.println("Boredom:     " + myPet.getBoredom());

		System.out.println("\nHow do you want to make Hedwig happy?");
		System.out.println("1. Feed Hedwig");
		System.out.println("2. Give Hedwig a drink");
		System.out.println("3. Play with Hedwig");

		String optionEntered = input.nextLine();

		if (optionEntered.contentEquals("1")) {
			System.out.println("You fed Hedwig an eeylop!");
			System.out.println("\nHunger = " + (myPet.getHunger() + 1) + "\nThirst = " + (myPet.getWater() - 1)
					+ "\nBoredom = " + myPet.getBoredom());
		} else if (optionEntered.contentEquals("2")) {
			System.out.println("You gave Hedwig pumpkin juice!");
			System.out.println("\nHunger = " + (myPet.getHunger()) + "\nThirst = " + (myPet.getWater() + 1)
					+ "\nBoredom = " + myPet.getBoredom());
		} else {
			System.out.println("You let Hedwig out of his cage to fly around!");
			System.out.println("\nHunger = " + myPet.getHunger() + "\nThirst = " + myPet.getWater() + "\nBoredom = "
					+ (myPet.getBoredom() + 1));
		}
		myPet.tick();

		input.close();
	}
}
