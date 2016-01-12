/**
 * 
 */
package Phase2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * A user in the application.
 * 
 * @author Kirisanth
 */
public abstract class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4912010307234397232L;
	private static ArrayList<Flight> flights = new ArrayList<Flight>();
	private static ArrayList<Client> clients = new ArrayList<Client>();
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private static ArrayList<String> locations;

	/**
	 * Creates a new User with the given last name, first name, email, and
	 * address.
	 * 
	 * @param lastName
	 *            the last name of this User
	 * @param firstName
	 *            the first name of this User
	 * @param email
	 *            the email of this User
	 * @param address
	 *            the address of this User
	 */
	public User(String lastName, String firstName, String email, String address) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
	}

	/**
	 * Returns the flights that leave on date from origin and travel to
	 * destination.
	 * 
	 * @param date
	 *            the date of departure
	 * @param origin
	 *            the place of departure
	 * @param destination
	 *            the place of arrival
	 * @return ArrayList of flights that leave on date from origin and travel to
	 *         destination
	 */
	public static ArrayList<Flight> getFlights(String date, String origin,
			String destination) {
		ArrayList<Flight> res = new ArrayList<Flight>();
		for (Flight flight : flights) {
			if (flight.leavesOn().equals(date)
					&& flight.getOrigin().equals(origin)
					&& flight.getDestination().equals(destination)) {
				res.add(flight);
			}
		}
		return res;
	}

	/**
	 * Returns all possible itineraries sorted by total cost, form origin to
	 * destination leaving on date, with 6 hours or less of transferring from
	 * one flight to another.
	 * 
	 * @param date
	 *            the date of departure
	 * @param origin
	 *            the place of departure
	 * @param destination
	 *            the place of arrival
	 * @return ArrayList of all possible itineraries sorted by total cost, form
	 *         origin to destination leaving on date, with >=6 hours of transfer
	 *         time
	 */
	public static ArrayList<Itinerary> getItinerariesSortedByCost(String date,
			String origin, String destination) {
		ArrayList<Itinerary> result = getItineraries(date, origin, destination);
		Collections.sort(result, new CostComparator());
		return result;
	}

	/**
	 * Returns all possible itineraries sorted by total travel time, form origin
	 * to destination leaving on date, with 6 hours or less of transferring from
	 * one flight to another.
	 * 
	 * @param date
	 *            the date of departure
	 * @param origin
	 *            the place of departure
	 * @param destination
	 *            the place of arrival
	 * @return ArrayList of all possible itineraries sorted by total travel
	 *         time, form origin to destination leaving on date, with >=6 hours
	 *         of transfer time
	 */
	public static ArrayList<Itinerary> getItinerariesSortedByTime(String date,
			String origin, String destination) {
		ArrayList<Itinerary> result = getItineraries(date, origin, destination);
		Collections.sort(result, new TimeComparator());
		return result;
	}

	/**
	 * Returns the first name of this User.
	 * 
	 * @return the first name of this User
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of this User to firstName.
	 * 
	 * @param firstName
	 *            the new first name of this User
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of this User.
	 * 
	 * @return the last name of this User
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of this User to lastName.
	 * 
	 * @param lastName
	 *            the new last name of this User
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the address of this User.
	 * 
	 * @return the address of this User
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address of this User to address.
	 * 
	 * @param address
	 *            the new address of this User
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Returns the email of this User.
	 * 
	 * @return the email of this User
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email of this User to email.
	 * 
	 * @param email
	 *            the new email of this User
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Returns all the flights of this application.
	 * 
	 * @return all the flights of this application
	 */
	public static ArrayList<Flight> getFlights() {
		return flights;
	}

	/**
	 * Returns all the clients of this application.
	 * 
	 * @return all the clients of this application
	 */
	public static ArrayList<Client> getClients() {
		return clients;
	}

	@Override
	public String toString() {
		return lastName + "," + firstName + "," + email + "," + address;
	}

	/**
	 * Returns all possible itineraries form origin to destination leaving on
	 * date, with 6 hours or less of transferring from one flight to another.
	 * 
	 * @param date
	 *            the date of departure
	 * @param origin
	 *            the place of departure
	 * @param destination
	 *            the place of arrival
	 * @return ArrayList of all possible itineraries form origin to destination
	 *         leaving on date, with >=6 hours of transfer time
	 */
	public static ArrayList<Itinerary> getItineraries(String date,
			String origin, String destination) {
		ArrayList<Itinerary> res = new ArrayList<Itinerary>();
		ArrayList<Flight> validFlights = getValidInitFlights(date, origin);
		locations = new ArrayList<String>();
		locations.add(origin);
		ArrayList<ArrayList<Flight>> itineraries = createItineraries(date,
				origin, destination, validFlights);
		for (ArrayList<Flight> itinerary : itineraries) {
			Itinerary itin = new Itinerary(itinerary);
			if (itin.isValid()) {
				res.add(itin);
			}
		}

		return res;
	}

	private static ArrayList<ArrayList<Flight>> createItineraries(String date,
			String origin, String destination, ArrayList<Flight> flights) {
		ArrayList<ArrayList<Flight>> itineraries = new ArrayList<ArrayList<Flight>>();
		for (Flight flight : flights) {
			if (flight.getOrigin().equals(origin)
					&& flight.getDestination().equals(destination)) {
				ArrayList<Flight> travelFights = new ArrayList<Flight>();
				travelFights.add(flight);
				itineraries.add(travelFights);
			} else if (flight.getOrigin().equals(origin)) {
				String flightDestination = flight.getDestination();
				locations.add(flightDestination);
				String newDate = flight.getArrivalDateandTime();
				ArrayList<Flight> possibleTransferFlights = getValidConnectionFlights(
						newDate, flightDestination);
				ArrayList<ArrayList<Flight>> transferFlights = createItineraries(
						newDate, flightDestination, destination,
						possibleTransferFlights);
				if (!transferFlights.isEmpty()) {
					for (ArrayList<Flight> connectingFlights : transferFlights) {
						connectingFlights.add(0, flight);
					}
					itineraries.addAll(transferFlights);
				}
				locations.remove(locations.size() - 1);
			}
		}
		return itineraries;
	}

	private static ArrayList<Flight> getValidConnectionFlights(String date,
			String origin) {
		ArrayList<Flight> res = new ArrayList<Flight>();
		for (Flight flight : flights) {
			int leavesIn = flight.leavesInHours(date);
			String destination = flight.getDestination();
			if (leavesIn >= 0 && leavesIn <= 6
					&& flight.getOrigin().equals(origin)
					&& !locations.contains(destination)) {
				res.add(flight);
			}
		}
		return res;
	}

	private static ArrayList<Flight> getValidInitFlights(String date,
			String origin) {
		ArrayList<Flight> res = new ArrayList<Flight>();
		for (Flight flight : flights) {
			if (flight.leavesOn().equals(date)
					&& flight.getOrigin().equals(origin)) {
				res.add(flight);
			}
		}
		return res;
	}

	/**
	 * Reads in the file with all flight information located at path for
	 * internal use.
	 * 
	 * @param path
	 *            the location of the file to read
	 * @throws FileNotFoundException
	 */
	public static void uploadFlightInfo(String path)
			throws FileNotFoundException {
		ArrayList<ArrayList<String>> info = reader(path);
		for (ArrayList<String> flight : info) {
			double price = Double.parseDouble(flight.get(6));
			int seats = Integer.parseInt(flight.get(7));
			flights.add(new Flight(flight.get(0), flight.get(1), flight.get(2),
					flight.get(3), flight.get(4), flight.get(5), price, seats));
		}
	}

	/**
	 * Reads in the file with all client information located at path for
	 * internal use.
	 * 
	 * @param path
	 *            the location of the file to read
	 * @throws FileNotFoundException
	 */
	public static void uploadClientInfo(String path)
			throws FileNotFoundException {
		ArrayList<ArrayList<String>> info = reader(path);
		for (ArrayList<String> client : info) {
			clients.add(new Client(client.get(0), client.get(1), client.get(2),
					client.get(3), client.get(4), client.get(5)));
		}
	}

	private static ArrayList<ArrayList<String>> reader(String path)
			throws FileNotFoundException {
		Scanner file = new Scanner(new File(path));
		ArrayList<ArrayList<String>> info = new ArrayList<ArrayList<String>>();
		while (file.hasNext()) {
			String line = file.nextLine();
			info.add(new ArrayList<String>(Arrays.asList(line.split(String
					.valueOf(',')))));
		}
		file.close();
		return info;
	}
}
