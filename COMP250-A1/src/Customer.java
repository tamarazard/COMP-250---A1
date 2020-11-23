
public class Customer {
	private String name;
	private int balance;
	private Basket basket;
	
	public Customer(String name, int balance) {
		this.name = name;
		this.balance = balance;
		
		this.basket = new Basket();
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public Basket getBasket() {
		return this.basket;
	}
	
	public int addFunds(int amount) {
		if(amount<0) throw new IllegalArgumentException("A negative amount can't be added to the balance");
		balance+= amount;
		return balance;
	}
	
	public int addToBasket(Reservation reservation) {
		int numOfReserv=0;
		if(reservation.reservationName().equalsIgnoreCase(this.name)) {
			this.basket.add(reservation);
			numOfReserv += basket.getNumOfReservations();
			return numOfReserv;
		}else throw new IllegalArgumentException();
	}
	
	public int addToBasket(Hotel hotel, String roomType, int numbOfNights, boolean breakfast) {
		int numOfReserv = 0;
		if(breakfast=true) {
			BnBReservation reservation = new BnBReservation(name,hotel , roomType, numbOfNights);
			basket.add(reservation);
			numOfReserv += basket.getNumOfReservations();
			
		} else {
			HotelReservation reservation = new HotelReservation(name, hotel, roomType, numbOfNights);
			basket.add(reservation);
			numOfReserv += basket.getNumOfReservations();
		}
		
		return numOfReserv;
	}
	
	
	public int addToBasket(Airport one, Airport two) {
		int numOfReserv = 0;
		FlightReservation reservation = new FlightReservation(name, one , two);
		basket.add(reservation);
		numOfReserv += basket.getNumOfReservations();
		
		return numOfReserv;
		
	}
	
	public boolean removeFromBasket(Reservation reservation) {
		if(basket.remove(reservation)){
			return true;
		}else return false;
		
		
	}
	
	
	public int checkOut() {
		if(balance<basket.getTotalCost()) {
			throw new IllegalArgumentException("Insufficient funds");
		}else {
			balance -= basket.getTotalCost();
			basket.clear();
			return balance;
		}
		
	}
	
}
