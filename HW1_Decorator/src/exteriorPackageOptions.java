
public class exteriorPackageOptions extends OptionDecorator {

	public exteriorPackageOptions(Vehicle newVehicle) {
		super(newVehicle);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getOptionsList() {
		return lVehicle.getOptionsList() + " Appearence Package,";
	}
	
	public double getPrice() {
		System.out.println("Adding 2500.10 for Appearance Package"); 
		return lVehicle.getPrice() + 2500.10;
	}

}
