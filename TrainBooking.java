package placement;

public class TrainBooking {
	String name;
	int age;
	int seatNo;
	String from;
	String to;
	boolean isBooked;
	
	void bookSeat()
	{
		if(isBooked==false)
		{
			isBooked=true;
			System.out.println("Seat booked successfully");
		}else {
		System.out.println("Seat already booked");
		}
	}
	void cancelSeat()
	{
		if(isBooked==true)
		{
			isBooked=false;
			System.out.println("Seat cancelled successfully");
		}else {
		System.out.println("Seat was not booked");
		}
	}
	void display()
	{
		System.out.println("Passenger Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("From: "+from);
		System.out.println("To: "+to);
		System.out.println("Seat Number: "+seatNo);
		System.out.println("Booked: "+isBooked);
	}
	public static void main(String[] args)
	{
		TrainBooking seat=new TrainBooking();
		seat.seatNo=13;
		seat.name="Satya";
		seat.age=20;
		seat.from="Chennai";
		seat.to="Kuppam";
		
		seat.display();
		seat.bookSeat();
		seat.display();
		seat.cancelSeat();
		seat.display();
	}
	
}
