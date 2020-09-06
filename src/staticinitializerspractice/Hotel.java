package staticinitializerspractice;

public class Hotel {
	
	int noOfRooms = 12;
	int maxNoOfGuests=calculateMaxNoOfGuests();
	int occPerRoom = 2;
	
	
	private int calculateMaxNoOfGuests(){
		return noOfRooms*occPerRoom;
	}
	
	
	public static void main(String [] args){
		Hotel hotel = new Hotel();
		hotel.calculateMaxNoOfGuests();
		System.out.println("maxNoOfGuests "+hotel.maxNoOfGuests);
		System.out.println("noOfRooms "+hotel.noOfRooms);
		System.out.println("occPerRoom "+hotel.occPerRoom);
	}

}
