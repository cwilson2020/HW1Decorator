
public class buildVehicle {

	public static void main(String[] args) {
		Vehicle v = new exteriorPackageOptions(
				new leatherOptions(
						new sunroofOption(
								new paintOption(							
										new BaseVehicle()))));


		System.out.println ("All Options: " + v.getOptionsList());
		System.out.println ("Total Price: " + String.valueOf(v.getPrice()));
	}

}
