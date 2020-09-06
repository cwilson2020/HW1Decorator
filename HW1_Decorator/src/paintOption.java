
public class paintOption extends OptionDecorator {

	public paintOption(Vehicle newVehicle) {
		super(newVehicle);
		// TODO Auto-generated constructor stub
	}


	
	public String getOptionsList() {
		return lVehicle.getOptionsList() + " Standard Paint,";
	}
	
	public double getPrice() {
		System.out.println("Subtracting  150.00 for Standard Paint"); 
		return lVehicle.getPrice() - 150;
	}

}
