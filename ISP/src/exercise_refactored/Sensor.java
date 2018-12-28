package exercise_refactored;

import java.util.Random;

public class Sensor {
	public void register(timed_door tods) {
		while (true) {
			if (isPersonClose()) {
				tods.proximityCallback();
				break;
			}
		}
	}

	private boolean isPersonClose() {
		return new Random().nextBoolean();
	}
}