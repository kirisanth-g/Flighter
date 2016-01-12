package Phase2;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * A go between for automarker and the application.
 * 
 * @author Kirisanth
 */
public class Driver {

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
		Client.uploadFlightInfo(path);
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
		Client.uploadClientInfo(path);
	}

	/**
	 * Returns the Client with the given email.
	 * 
	 * @param email
	 *            the email of this Client
	 * @return the Client with the given email
	 */
	public static String getClient(String email) {
		ArrayList<Client> clients = Client.getClients();
		for (Client client : clients) {
			if (client.getEmail().equals(email)) {
				return client.toString();
			}
		}
		return "";
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
	 * @return String of flights that leave on date from origin and travel to
	 *         destination
	 */
	public static String getFlights(String date, String origin,
			String destination) {
		String res = "";
		ArrayList<Flight> flights = Client
				.getFlights(date, origin, destination);
		for (Flight flight : flights) {
			res += flight.toString() + "\n";
		}
		res = res.trim();
		return res;
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
	 * @return String of all possible itineraries form origin to destination
	 *         leaving on date, with >=6 hours of transfer time
	 */
	public static String getItineraries(String date, String origin,
			String destination) {
		String res = "";
		ArrayList<Itinerary> itineraries = Client.getItineraries(date, origin,
				destination);
		for (Itinerary itinerary : itineraries) {
			res += itinerary.toString() + "\n";
		}
		res = res.trim();
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
	 * @return String of all possible itineraries sorted by total cost, form
	 *         origin to destination leaving on date, with >=6 hours of transfer
	 *         time
	 */
	public static String getItinerariesSortedByCost(String date, String origin,
			String destination) {
		String res = "";
		ArrayList<Itinerary> itineraries = Client.getItinerariesSortedByCost(
				date, origin, destination);
		for (Itinerary itinerary : itineraries) {
			res += itinerary.toString() + "\n";
		}
		res = res.trim();
		return res;
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
	 * @return String of all possible itineraries sorted by total travel time,
	 *         form origin to destination leaving on date, with >=6 hours of
	 *         transfer time
	 */
	public static String getItinerariesSortedByTime(String date, String origin,
			String destination) {
		String res = "";
		ArrayList<Itinerary> itineraries = Client.getItinerariesSortedByTime(
				date, origin, destination);
		for (Itinerary itinerary : itineraries) {
			res += itinerary.toString() + "\n";
		}
		res = res.trim();
		return res;
	}
}
