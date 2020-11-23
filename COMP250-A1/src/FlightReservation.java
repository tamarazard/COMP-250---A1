
public class FlightReservation extends Reservation{
	
	private Airport departure;
	private Airport arrival;
	
	public FlightReservation(String reservationName, Airport departure, Airport arrival) {
		super (reservationName);
		if(departure.equals(arrival)) {
			throw new IllegalArgumentException("The two airports should be different airports");
		}
		this.departure = departure;
		this.arrival = arrival;
	}
	
	public int getCost() {
		int distance = Airport.getDistance(departure, arrival);
		double fuelsCost = (distance/167.52)*124;
		double airportFees = departure.getFees() + arrival.getFees();
				
		double cost = fuelsCost + airportFees + 5375;
		return (int)Math.ceil(cost);
		
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof FlightReservation) {
			if(((FlightReservation) o).reservationName().equalsIgnoreCase(this.reservationName())) {
				if(((FlightReservation) o).departure.equals(this.departure)) {
					if(((FlightReservation) o).arrival.equals(this.arrival)) {
								return true;
							}
							
						}
					}
				}

		return false;
	}

}

