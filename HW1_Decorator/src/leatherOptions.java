
public class leatherOptions extends OptionDecorator {

	public leatherOptions(Vehicle newVehicle) {
		super(newVehicle);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getOptionsList() {
		return lVehicle.getOptionsList() + " Leather Seats,";
			}
	
	public double getPrice() {
		System.out.println("Adding 550.50 for Leather Seats"); 
		return lVehicle.getPrice() + 550.50;
	}

}
