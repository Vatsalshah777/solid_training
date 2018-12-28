package execerise_refactored;

import com.meditab.training.lsp.exercise.Duck;
import com.meditab.training.lsp.exercise.ElectronicDuck;

public class Pool {
	public void run() {

		ElectronicDuck electricDuck = new ElectronicDuck();
		electricDuck.quack();
		electricDuck.swim();
	}

	private void quack(Duck... ducks) {
		for (Duck duck : ducks) {
			duck.quack();
		}
	}

	private void swim(Duck... ducks) {
		for (Duck duck : ducks) {
			duck.swim();
		}
	}

	public static void main(String[] args) {
		Pool pool = new Pool();
		pool.run();
	}
}
