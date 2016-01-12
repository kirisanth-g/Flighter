/**
 * 
 */
package Phase2;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Makes an Itinerary of the Flights given. Itinerary will also calculate the
 * totalCost and totalTime of the whole Itinerary. It will also set a starting
 * point and destination point for the Itinerary. This is all based on all the
 * flights given during Itinerary creation.
 * 
 * @author Helen
 * 
 */
public class Itinerary {

	private ArrayList<Flight> flightSet;
	private double totalCost;
	private int totalTime;
	private String origin;
	private String destination;
	private String departDate;

	/**
	 * Constructor for an Itinerary given an Array of flights. Based on given
	 * argument, will calculate totalCost, totalTime and set the origin,
	 * destination and departure date of the Itinerary.
	 * 
	 * @param flights
	 *            which is an ArrayList of Flights.
	 */
	public Itinerary(ArrayList<Flight> flights) {

		this.flightSet = flights;
		this.totalCost = calcCost();
		this.totalTime = addUpTime();
		this.origin = (flightSet.get(0)).getOrigin();
		this.destination = (flightSet.get(flightSet.size() - 1))
				.getDestination();
		this.departDate = (flightSet.get(0)).getDepartureDateandTime()
				.substring(0, 10);

	}

	/**
	 * Returns all the Flights in an Array format.
	 * 
	 * @return an ArrayList of Flights.
	 */
	public ArrayList<Flight> getFlights() {
		return flightSet;
	}

	/**
	 * Returns the origin/starting point of this Itinerary.
	 * 
	 * @return the starting point of this Itinerary
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Returns the final destination of this Itinerary.
	 * 
	 * @return the destination of this Itinerary.
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Returns the date of departure of the first flight in this Itinerary.
	 * 
	 * @return the departDate
	 */
	public String getDepartDate() {
		return departDate;
	}

	/**
	 * Returns the total cost of this Itinerary.
	 * 
	 * @return totalCost of this Itinerary.
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * Calculates the total cost of this Itinerary. Used in constructor to set
	 * value of totalCost.
	 * 
	 * @return the cost of this Itinerary.
	 */
	private double calcCost() {
		double cost = 0;
		for (Flight flight : flightSet) {
			cost += flight.getCost();
		}
		return cost;
	}

	/**
	 * Adds up all the flight times and returns the total time in minutes. Used
	 * in constructor to set value of totalTime.
	 * 
	 * @return the total time that Itinerary will take.
	 */
	private int addUpTime() {
		int time = 0;
		for (Flight flight : flightSet) {
			time += flight.travelTimeInMins();
		}
		return time;
	}

	/**
	 * Returns the total time Itinerary will take for the all the Flights in
	 * minutes.
	 * 
	 * @return totalTime total time all the Flights in Itinerary take.
	 */
	public int getTotalTime() {
		return totalTime;
	}

	/**
	 * Returns the totalTime in the format HH:MM.
	 * 
	 * @return the totalTime in a formatted String.
	 */
	public String getTotalDuration() {
		int duration = addUpTime();
		int hours = duration / 60;
		int mins = duration % 60;
		String s_hours = String.format("%02d", hours);
		String s_mins = String.format("%02d", mins);
		return (s_hours + ":" + s_mins);
	}

	/**
	 * Makes a String representation of Itinerary.
	 * 
	 * @override
	 * @return a String representation of Itinerary
	 */
	public String toString() {
		ArrayList<Flight> flights = getFlights();
		String strFlights = "";
		for (Flight flight : flights) {
			strFlights += flight.toString() + "\n";
		}
		return (strFlights + "\n" + getTotalCost() + "\n" + getTotalDuration());
	}

	/**
	 * Compares the two itineraries to see if they are the same.
	 * 
	 * @param other
	 *            another Itinerary that is being compared to this Itinerary.
	 * @return True if the Itineraries are the same, False otherwise.
	 */
	public boolean equals(Itinerary other) {
		ArrayList<Flight> thisIten = this.getFlights();
		ArrayList<Flight> otherIten = other.getFlights();
		boolean result = (thisIten.equals(otherIten));
		return result;
	}

	/**
	 * Checks to see if Itinerary is valid. Itinerary origin and destination
	 * cannot be the same. No backtracking. Otherwise not a valid Itinerary.
	 * 
	 * @return True if Itinerary is valid Itinerary.
	 */
	public boolean isValid() {
		String start = this.getOrigin();
		String dest = this.getDestination();
		if (start.equals(dest)) {
			return false;
		}
		HashSet<String> origins = new HashSet<String>();
		for (Flight flight : flightSet) {
			origins.add(flight.getOrigin());
		}
		return origins.size() == getFlights().size();
	}
}
