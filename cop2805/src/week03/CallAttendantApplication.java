package week03;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CallAttendantApplication {

	public static void main(String[] args) {
		//alphabet
		ArrayList<String> alpha = new ArrayList<>();
		alpha.add("A");
		alpha.add("B");
		alpha.add("C");
		alpha.add("D");
		alpha.add("E");
		alpha.add("F");
		alpha.add("G");
		alpha.add("H");
		alpha.add("I");
		alpha.add("J");
		alpha.add("K");
		alpha.add("L");
		alpha.add("M");
		alpha.add("N");
		
		// seats
		ArrayList<Seat> seats = new ArrayList<>();
		for(int i = 0; i< 30/*rows*/; i++) {
			seats.get(i).setSeatRow(i);
			
			for(int e = 0; e< 14; e++) {
				seats.get(e).setSeatColumn(alpha.get(e));
			}
		}
		
		
		
		// airplanes
		ArrayList<Airplane> airplanes = new ArrayList<>();
		airplanes.add(new Airplane("Boeing", "737", "1967", seats));
		airplanes.add(new Airplane("Boeing", "747", "1979", seats));
		airplanes.add(new Airplane("Boeing", "767", "1986", seats));
		airplanes.add(new Airplane("Boeing", "777", "1994", seats));
		airplanes.add(new Airplane("Boeing", "787", "2012", seats));
		airplanes.add(new Airplane("Boeing", "737", "1977", seats));
		airplanes.add(new Airplane("Boeing", "777", "1998", seats));
		airplanes.add(new Airplane("Boeing", "747", "1975", seats));
		
		// flights
		ArrayList<Flight> flights = new ArrayList<Flight>();
		flights.add(new Flight("ATL", "MCO", "2/14/2019"));
		flights.add(new Flight("Birmingham", "MCO", "11/15/2019"));
		flights.add(new Flight("MCO", "New York", "03/01/2019"));
		flights.add(new Flight("St. Louis", "Dallas", "02/01/2019"));
		flights.add(new Flight("Deland", "Miami", "03/21/2019"));
		flights.add(new Flight("Sanford", "Charlotte", "04/10/2019"));
		flights.add(new Flight("SanFrancisco", "Chicago", "05/25/2019"));
		flights.add(new Flight("San Juan", "MCO", "03/07/2019"));
		
		
		
		for(int i = 0; i<flights.size(); i++) {
			flights.get(i).setAirplane((airplanes.get(i)));
		}
		
		// Passengers
				ArrayList<Passenger> passengers = new ArrayList<>();
				passengers.add(new Passenger(flights.get(0),"Gee", "Wills", "1@gmail.com", "555-1234" ));
				passengers.add(new Passenger(flights.get(5), "Steph", "Feliciano", "Steph.Coral@gmail.com", "7872384485"));
				passengers.add(new Passenger(flights.get(2), "Bryant", "Vail", "BryantVail@gmail.com", "4076974422"));
				passengers.add(new Passenger(flights.get(1), "John", "Vail", "JV@gmail.com", "4075872233"));
				passengers.add(new Passenger(flights.get(8), "Lewis", " Vail", "LewisVIII@gmail.com", "4076975844"));
				
		
		//Planes & Flights Initialized
		
		Scanner scanner = new Scanner(System.in);
		//Intro CommandLine Statement
		
		
		String command = scanner.nextLine();
		while(true) {
			System.out.println("Main Menu: Please select Flight(\"F\")\n Passenger(\"P\" found by email)\n or \"A\" for AirplaneId");
			
			switch(command.trim()) {
			case "F" : 
				printFlights(flights);
				break;			
			case "P" : 
				userEmailPrompt();
				String resp;
				resp = scanner.nextLine();
				for(int i =0; i< passengers.size(); i++) {
					if(passengers.get(i).email == resp) {
						System.out.println(passengers.get(i).toString());
					}
				}
				break;
			case "A": 
				userAirplaneIdPrompt();
				resp = scanner.nextLine().trim();
				for(int i = 0; i<airplanes.size(); i++) {
					if(airplanes.get(i).airplaneId == Integer.parseInt(resp) ) {
						System.out.println(airplanes.get(i).toString());
						break;
					}
				}
			default: 
				System.out.println("Please try another entry, we weren't able to match that up");
			}
		}
	}
		

		
	private static boolean searchAirplaneId(String resp) {
		// 
		
		return false;
		
	}
	private static void userAirplaneIdPrompt() {
		// 
		System.out.println("Please enter in the integer for the airplane identification number: ");
		
	}

	//end static void main
	
	private static boolean userEmailPrompt() {
		// 
		String prompt = "Please enter email to search passenger information and return flight itenerary, or Flight Dock.";
		System.out.println(prompt);
		return true; 
	}

	public boolean clearLights(ArrayList<Seat> seats) {
		
		Iterator<Seat> iter = seats.iterator();
		while(iter.hasNext()) {
			Seat thisSeat = new Seat();
			thisSeat = iter.next();
			thisSeat.setAlertLightOff();
		}
		return true;
	}
	
	public static boolean printFlights(ArrayList<Flight> flights) {
		if(flights != null) {
			for(int i = 0; i<flights.size(); i++) {
				System.out.println(flights.get(i));	
			}
			return true;
			
		}
		else {
				System.out.println("No Flights to print");
				return false;
		}
	}//end printFlights
	

	
	/**
	 * 
	 * @param passenger
	 * @param passengers
	 * @return the true if (list.contains(passenger)), else: return false; 
	 */
	public static boolean passengerSearch(Passenger passenger, ArrayList<Passenger> passengers) {
		if(passengers.contains(passenger)) {
			return true;
		}
		else {
			return false;
		}
	}

}

class Seat{
	
	private int seatRow;
	private String seatColumn;
	private Flight flight;
	private boolean seatLightFlag; 
	public Passenger passenger; 

	public Seat() {
		this.seatRow = (Integer) null;
		this.seatColumn = (String) null;
		this.flight = null;
	}
	
	public void setSeatRow(int i) {
		// TODO Auto-generated method stub
		this.seatRow = i;
	}

	public void setSeatColumn(String seatColumn) {
		// TODO Auto-generated method stub
		this.seatColumn = seatColumn; 
	}

	public Seat(int seatRow, String seatColumn, Flight flight) {
		this.seatRow = seatRow; 
		this.seatColumn = seatColumn; 
		this.flight = flight; 
	}
	
	public boolean setPassenger(Passenger passenger) {
		if(passenger != null && this.flight.getPlane().seatsAvailable()) {
			//seat passenger
			return true;
		}else {
			return false;
		}
	}
	
	public boolean setAlertLightOff() {
		this.seatLightFlag = false; 
		return this.seatLightFlag; 
	}
	
	public boolean setAlertLightOn() {
		this.seatLightFlag = true; 
		return this.seatLightFlag; 
	}
	
	public boolean getSeatAlertState() {
		return this.seatLightFlag;
	}
}

class Flight{
	
	private String destination;
	private String departureLocation;
	private Airplane airplane;
	private String departureDateTime;

	public Flight() {
		this.destination = null;
		this.departureLocation = null;
		this.airplane = (Airplane) null;
		this.departureDateTime = null;
	}
	
	public Airplane getPlane() {
		// TODO Auto-generated method stub
		return this.airplane;
	}

	public Flight(String destination, String departureLocation,  String departureDateTime) {
		this.destination = destination; 
		this.departureLocation = departureLocation; 
		
		this.departureDateTime = departureDateTime;
		
	}
	
	public boolean setAirplane(Airplane plane) {
		if(plane != null) {
			this.airplane = plane; 
			return true;
		}else {
			return false; 
		}
	}
	
	private void initialize() {
		
	}
}

class Airplane{
	public Integer airplaneId;
	public String make;
	public String model;
	public String year; 
	public ArrayList<Seat> seats; 
	
	public Airplane(String make, String model, String year, ArrayList<Seat> seats) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.seats = seats;
	}

	public boolean seatsAvailable() {
		// TODO Auto-generated method stub
		return false;
	}
}

class Passenger{
	public ArrayList<Flight> journey; 
	public String firstname; 
	public String lastname; 
	public String email;
	public String phone; 
	public Seat currentSeat; 
	
	public Passenger(ArrayList<Flight> journey, String firstname, String lastname, String email, String phone, Seat currentSeat) {
		this.journey = journey;
		this.firstname = firstname;
		this.lastname = lastname; 
		this.email = email; 
		this.phone = phone; 
		this.currentSeat = currentSeat; 
	}
	
	public Passenger(Flight flight, String firstname, String lastname, String email, String phone, Seat currentSeat) {
		this.journey.add(flight);
		this.firstname = firstname;
		this.lastname = lastname; 
		this.email = email; 
		this.phone = phone; 
		this.currentSeat = currentSeat; 
	}
	
	public Passenger(Flight flight, String firstname, String lastname, String email, String phone) {
		this.journey.add(flight);
		this.firstname = firstname;
		this.lastname = lastname; 
		this.email = email; 
		this.phone = phone; 
		this.currentSeat = null; 
	}
	
	public boolean setCurrentSeat(Seat seat) {
		if(seat != null) {
			this.currentSeat = seat;
			return true;
		}
		else {
			return false; 
		}
	}
	
	public boolean toggleSeatAlert() {
		if(this.currentSeat.getSeatAlertState()) {
			return false;
		}else {
			return true; 
		}
	}
	
	public boolean setSeat(Seat seat) {
		if(seat != null) {
			this.currentSeat = seat;
			return true;
		}else {
			return false;
		}
		 
	}
	
	
	
}
















