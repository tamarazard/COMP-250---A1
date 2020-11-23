
public class HotelReservation extends Reservation {
	private Hotel hotel;
	private String type;
	private int numbOfNights;
	private int price;
	
	public HotelReservation(String reservationName, Hotel hotel, String type, int numbOfNights) {
		super (reservationName);
		this.hotel = hotel;
		this.type = type;
		this.numbOfNights = numbOfNights;
		this.price = hotel.reserveRoom(type);
		
		
		
	}
		
	
	public int getNumOfNights() {
		return this.numbOfNights;
	}
	
	@Override 
	public int getCost() {
		int cost = this.price*this.numbOfNights;
		return cost;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof HotelReservation) {
			if(((HotelReservation) o).reservationName().equalsIgnoreCase(this.reservationName())) {
				if(((HotelReservation) o).hotel.equals(this.hotel)){
					if(((HotelReservation) o).type.equalsIgnoreCase(this.type)){
						if(((HotelReservation) o).numbOfNights==this.numbOfNights){
							if(((HotelReservation) o).getCost()==this.getCost()) {
								return true;
							}
							
						}
					}
				}
			}
			
		}

		return false;
	}

}
