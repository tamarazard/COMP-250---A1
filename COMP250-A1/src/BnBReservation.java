
public class BnBReservation extends HotelReservation{
	
	public BnBReservation(String reservationName, Hotel hotel, String type, int numbOfNights) {
		super(reservationName, hotel, type, numbOfNights);
	}

	public int getCost() {
		int cost = super.getCost() + 1000*this.getNumOfNights();
		return cost;
	}
}
