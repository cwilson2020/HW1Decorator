
public class sunroofOption extends OptionDecorator {

	public sunroofOption(Vehicle newVehicle) {
		super(newVehicle);
		// TODO Auto-generated constructor stub
	}


	
	public String getOptionsList() {
		return lVehicle.getOptionsList() + " Sun Roof,";
	}
	
	public double getPrice() {
		System.out.println("Adding 3000.00 for a Sun Roof"); 
		return lVehicle.getPrice() + 3000.00;
	}

}
