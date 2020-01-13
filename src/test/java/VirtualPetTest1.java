import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest1 {

	@Test
	public void shouldSayHedwigtheOwl() {
		VirtualPet1 underTest = new VirtualPet1((int) (Math.random() * 50 + 1), (int) (Math.random() * 50 + 1),
				(int) (Math.random() * 50 + 1));
		String result = underTest.getResponse();

		assertEquals("Hedwig the Owl", result);
	}

}