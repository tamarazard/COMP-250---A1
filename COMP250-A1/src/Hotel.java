
public class Hotel {
	private String name;
	private Room[] rooms;
	
	public Hotel(String name,Room[] rooms) {
		this.rooms = rooms;
		
		int n = this.rooms.length;
		
		Room[] copyRooms = new Room[n];
			
			for(int i=0; i<n ; i++) {
				copyRooms[i] = new Room(rooms[i]);
			}
			
		this.name = name;
		this.rooms = copyRooms;
		
	}
	
	public int reserveRoom(String type) {
	
		Room room = Room.findAvailableRoom(rooms, type);
		if(room == null) {
			throw new IllegalArgumentException("Room not unavailable");
		 }
			
		else {
			room.changeAvailability();
			return room.getPrice();
		}
		
	}
	
	public boolean cancelRoom(String type) {
		return Room.makeRoomAvailable(this.rooms, type);
	}		
}