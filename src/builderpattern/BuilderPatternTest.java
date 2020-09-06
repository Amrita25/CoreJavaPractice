package builderpattern;

public class BuilderPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();

	}

}
