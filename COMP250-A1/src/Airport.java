
public class Airport {
	
	private int x; // An int indicating the x-coordinate of the airport on a world map with a scale to 1 km. 
	private int y; // An int indicating the y-coordinate of the airport on a world map with a scale to 1 km. 
	private int fees; //An int indicating the airport fees (in cents) associated to this airport
	
	public Airport(int x,int y,int fees) {
		this.x = x;
		this.y =y;
		this.fees = fees;
		
	}
	
	public int getFees() {
		return this.fees;
	}
	
	public static int getDistance(Airport one , Airport two) {
		double distance = Math.sqrt(Math.pow(one.x - two.x , 2) + Math.pow(one.y-two.y, 2));
		return (int) Math.ceil(distance);
		
	}

}