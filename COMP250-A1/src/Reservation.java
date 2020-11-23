
public abstract class Reservation {
	private String reservationName;
	
	public Reservation(String reservationName) {
		this.reservationName = reservationName;
	}

	
	public final String reservationName() {
		return this.reservationName;
	}
	
	public abstract int getCost();
	
	public abstract boolean equals(Object o);
}
