package Phase2;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * A flight of this application.
 * 
 * @author Zhenyu She
 * 
 */
public class Flight implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7563225209546756709L;
	private String flightNumber;
	private Date departureDateandTime;
	private Date arrivalDateandTime;
	private String airline;
	private String origin;
	private String destination;
	private double cost;
	private int numSeats;
	private SimpleDateFormat dateFormat = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm");

	/**
	 * Creates a Flight object that will hold all of the flight's information
	 * given flight number, departure date and time, arrival date and time,
	 * airline, origin, destination, and cost.
	 * 
	 * @param flightNumber
	 *            flight number/name of this Flight
	 * @param departureDateandTime
	 *            departure date and time of this Flight in format:
	 *            "YYYY-MM-DD HH:MM"
	 * @param arrivalDateandTime
	 *            arrival date and time of this Flight in format:
	 *            "YYYY-MM-DD HH:MM"
	 * @param airline
	 *            airline of this Flight
	 * @param origin
	 *            where this Flight starts
	 * @param destination
	 *            where this Flight is headed to
	 * @param cost
	 *            how much this Flight costs.
	 */
	public Flight(String flightNumber, String departureDateandTime,
			String arrivalDateandTime, String airline, String origin,
			String destination, double cost, int numSeats) {
		this.flightNumber = flightNumber;
		try {
			this.departureDateandTime = dateFormat.parse(departureDateandTime);
			this.arrivalDateandTime = dateFormat.parse(arrivalDateandTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.cost = cost;
		this.numSeats = numSeats;
	}

	/**
	 * Returns the flight number of this Flight.
	 * 
	 * @return the flight number of this Flight
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * Sets the flight number of this Flight to flightNumber.
	 * 
	 * @param flightnumber
	 *            the new flight number of this Flight
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Returns date and time of departure of this Flight.
	 * 
	 * @return date and time of departure of this Flight
	 */
	public String getDepartureDateandTime() {
		return dateFormat.format(departureDateandTime);
	}

	/**
	 * Sets the departure date and time for this Flight to departureDateandTime.
	 * 
	 * @param departureDateandTime
	 *            the new date and time of departure of this Flight in format of
	 *            "yyyy-MM-dd hh:mm"
	 */
	public void setDepartureDateandTime(String departureDateandTime) {
		try {
			this.departureDateandTime = dateFormat.parse(departureDateandTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns arrival date and time of this Flight.
	 * 
	 * @return arrival date and time of this Flight.
	 */
	public String getArrivalDateandTime() {
		return dateFormat.format(arrivalDateandTime);
	}

	/**
	 * Sets the arrival time of this Flight to arrivalDateandTime.
	 * 
	 * @param arrivalDateandTime
	 *            the new date and time of arrival of this Flight in format of
	 *            "yyyy-MM-dd hh:mm"
	 */
	public void setArrivalDateandTime(String arrivalDateandTime) {
		try {
			this.arrivalDateandTime = dateFormat.parse(arrivalDateandTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns the airline of this Flight.
	 * 
	 * @return the airline of this Flight
	 */
	public String getAirline() {
		return airline;
	}

	/**
	 * Sets the airline of this Flight to airline.
	 * 
	 * @param airline
	 *            the new airline this Flight
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}

	/**
	 * Returns the origin of this Flight.
	 * 
	 * @return the origin of this Flight
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin of this Flight to origin.
	 * 
	 * @param origin
	 *            the new origin of this Flight.
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Returns the destination of this Flight.
	 * 
	 * @return the destination of this Flight
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Set the destination of this Flight to destination.
	 * 
	 * @param destination
	 *            the new destination of this Flight
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Returns the total cost of this Flight.
	 * 
	 * @return the cost of the Flight
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * Sets the total cost of this Flight to cost.
	 * 
	 * @param cost
	 *            the new total cost of this Flight
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Sets the total number of seat in this Flight.
	 * @param numSeats 
	 * 
	 * @param numSeats
	 *            the new total number of Seats in this Flight
	 */
	public void setnumSeats(int numSeats){
		this.numSeats = numSeats;
	}
	
	/**
	 * Returns the total number of seat in this Flight.
	 * 
	 * @return the total number of seats in this Flight
	 */
	public int getNumSeats(){
		return numSeats;
	}

	private long getTravelDifference() {
		return arrivalDateandTime.getTime() - departureDateandTime.getTime();
	}

	/**
	 * Returns the total travel time of this Flight.
	 * 
	 * @return the total travel time of this Flight
	 * @throws ParseException
	 */
	public String TravelTime() {
		long l = getTravelDifference();
		long day = l / (24 * 60 * 60 * 1000);
		long hour = (l / (60 * 60 * 1000) - day * 24);
		long min = ((l / (60 * 1000)) - day * 24 * 60 - hour * 60);
		return day + " days " + hour + " hours " + min + " mins";
	}

	/**
	 * Returns the total travel time in hours of this Flight.
	 * 
	 * @return the total travel time in hours of this Flight
	 */
	public int travelTimeInHours() {
		long diff = getTravelDifference();
		return (int) (diff / (60 * 60 * 1000));
	}

	/**
	 * Returns the total travel time in minute of this Flight.
	 * 
	 * @return the total travel time in minutes of this Flight
	 */
	public int travelTimeInMins() {
		long diff = getTravelDifference();
		return (int) (diff / (60 * 1000));
	}

	/**
	 * Calculates and returns the amount of time this Flight takes off in hours
	 * rounded up.
	 * 
	 * @param date
	 *            a date and time
	 * @return time in hours in which the flight leaves from the given date
	 */
	public int leavesInHours(String date) {
		long diff = 0;
		try {
			Date arrival = dateFormat.parse(date);
			diff = departureDateandTime.getTime() - arrival.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int res = (int) (diff / (60 * 60 * 1000));
		if ((diff / (60 * 1000)) % 60 > 0) {
			res++;
		}
		return res;
	}

	/**
	 * Returns the date which this Flight leaves.
	 * 
	 * @return the date which this Flight leaves
	 */
	public String leavesOn() {
		SimpleDateFormat dayformat = new SimpleDateFormat("yyyy-MM-dd");
		return dayformat.format(departureDateandTime);
	}
	
	/**
	 * Returns a string representation of Flight with it's information included.
	 * 
	 * @return a string representation of Flight with its information including
	 *         flight number, departure time, arrival time, airline, origin,
	 *         destination and cost.
	 * @Override
	 */
	public String toString() {
		return flightNumber + "," + getDepartureDateandTime() + ","
				+ getArrivalDateandTime() + "," + airline + "," + origin + ","
				+ destination + "," + String.valueOf(cost) + " , " + String.valueOf(numSeats);
	}
}
