
public class Basket {
	private Reservation[] reservation;
	private int numbOfReserv;
	
	public Basket() {
		this.reservation = new Reservation[] {};
		
	}
	
	public Reservation[] getProducts() {
		Reservation[] clonedReservation = reservation.clone();
		return clonedReservation;
	}
	
	public int add(Reservation reserv) {
		Reservation[] newReserv = new Reservation[numbOfReserv + 1];
		for(int i=0; i< reservation.length; i++) {
			newReserv[i] = reservation[i];
		}
		
		newReserv[numbOfReserv] = reserv;
		reservation = newReserv;
		numbOfReserv++;
		return numbOfReserv;
		
		
	}
	
	public boolean remove(Reservation reserv) {
		if (reservation.length==0) {
			return false;
		}
		
		int j = -1;
		numbOfReserv = reservation.length;
		
		Reservation[] updatedReserv = new Reservation[numbOfReserv-1];
		
		for (int i=0; i<numbOfReserv; i++) {
			if(reserv.equals(reservation[i])) {
				j = i;
				break;
			}
		}
			
			if (j==-1) {
				return false;
			}
				
					for (int k=0 ; k<j ; k++) {
						updatedReserv[k] = reservation[k];
					}
			
			for(int t=j; t<numbOfReserv-1; t++ ) {
			updatedReserv[t] = reservation[t+1];
		}
					
		reservation = updatedReserv;
		return true;
	}
	
	public void clear() {
		reservation = new Reservation[] {};
		
	}
	
	public int getNumOfReservations() {
		int numb = reservation.length;
		return numb;
	}
	
	public int getTotalCost() {
		int totalCost=0;
		for(int i=0; i<=reservation.length-1; i++) {
			totalCost += reservation[i].getCost();
		}
		return totalCost;
	}
	
}
