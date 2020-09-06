
abstract class OptionDecorator implements Vehicle{

	protected Vehicle lVehicle;
	
	public OptionDecorator (Vehicle newVehicle) {
		lVehicle = newVehicle;
	}
	
	public String getOptionsList() {
		return lVehicle.getOptionsList();
	}
	
	public double getPrice() {
		return lVehicle.getPrice();
	}
	
}
