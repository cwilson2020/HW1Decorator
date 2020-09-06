
public class BaseVehicle implements Vehicle {

	@Override
	public String getOptionsList() {
		
		return "";
	}

	@Override
	public double getPrice() {
		System.out.println("Base Price: 20,000"); 
		return 20000;
	}

}
