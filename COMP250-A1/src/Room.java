
public class Room {	
	private String type; //indicates the type of the room
	private int price; //indicates in cents the price of the room
	private boolean available = true; //to check if the room is available or not
	 
	public String getType() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void changeAvailability(){
		this.available =! this.available;
	}
	
	public static Room findAvailableRoom(Room[] rooms, String type) {
		if(rooms==null) {
			return null;
		}
		
		for(int i=0; i<rooms.length ; i++) {
			if(rooms[i].type.equals(type) && rooms[i].available==true) {
					return rooms[i];
					}
		}
		return null;
	
}
	public Room(String type) {										
		
		if (type.equalsIgnoreCase("Double")) {
			this.price = 9000;
			this.available = true;
			this.type=type;
			
		}
		else if (type.equalsIgnoreCase("Queen")) {
			this.price = 11000;
			this.available = true;
			this.type=type;
		}
		else if (type.equalsIgnoreCase("King")) {
			this.price = 15000;
			this.available =true;
			this.type=type;
		}
		else { 
			throw new IllegalArgumentException ("No room of such type can be created");
		}
	}
	
	public Room (Room r) {
		this.type = r.type;
		this.available = r.available;
		this.price = r.price;
		
	}

	public static boolean makeRoomAvailable(Room[] rooms , String type) {
		for(int i=0; i<rooms.length; i++) {
			
			if(rooms[i].getType().equalsIgnoreCase(type)) {
				if(!rooms[i].available) {
					rooms[i].changeAvailability();
					return true;
					}
			}
		
		}
		
		return false;
		
	}

}
