package Constructor;


public class hotelBooking {
	String guestName ;
	String roomType ;
	int nights;

	public hotelBooking() {
		guestName ="Anuj";
		roomType = "Non-ac";
		nights =2;
	}
	public hotelBooking(String guestName, String roomType,int nights) {
		this.guestName=guestName;
		this.roomType=roomType;
		this.nights= nights;
	}
	public hotelBooking(hotelBooking h) {
		this.guestName=h.guestName;
		this.roomType=h.roomType;
		this.nights= h.nights;
	}
	public void display() {
		System.out.println("Guest Name : "+guestName);
		System.out.println("roomType : "+ roomType);
		System.out.println("Nights : "+nights);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Defult Constructor");
		hotelBooking obj1 = new hotelBooking();
		obj1.display();
		System.out.println();
		System.out.println("Parameterize Constructor");
		hotelBooking obj2 = new hotelBooking("madhav","ac_room",3);
		obj2.display();

		System.out.println();

		System.out.println("Copy Constructor");
		hotelBooking obj3 = new hotelBooking(obj2);
		
		obj3.display();



	}

}
