public class VirtualPet1 {

	public static void main(String[] args) {
	}

	int hunger;
	int thirst;
	int boredom;

	// Constructor
	public VirtualPet1(int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public void tick() {
		hunger++;
		thirst++;
		boredom--;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWater() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public void feedPet() {
		this.hunger++;
		this.thirst--;

	}

	public void sipWater() {
		this.thirst += 1;
	}

	public void isBored() {
		this.boredom -= 1;
	}

	public String getResponse() {

		return "Hedwig the Owl";
	}

}
