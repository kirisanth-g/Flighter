/**
 * 
 */
package Phase2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouxiaohan
 *
 */
public class Admin extends Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2260163155583636262L;
	private static ArrayList<Client> clients = new ArrayList<Client>();


	public Admin(String lastName, String firstName, String email,
			String address, String creditCardNum, String expireDate) {
		super(expireDate, expireDate, expireDate, expireDate, expireDate, expireDate);
	}


	/**
	 * View personal and billing information for any client.
	 * @param clientNum
	 * @return the client at the specific position clientNum in clients list.
	 */
	public static Client getClients(int clientNum) {
		return clients.get(clientNum);
	}
	
	
	/**
	 * Edit personal and billing information for any client.
	 * @param lastName
	 * @param firstName
	 * @param email
	 * @param address
	 * @param creditCardNum
	 * @param expireDate
	 * @param clientNum the client at the specific position in clients list
	 */
	public void editClients(String lastName, String firstName, String email,
			String address, String creditCardNum, String expireDate, int clientNum) {
		Client aClient = clients.get(clientNum);
		aClient.setLastName(lastName);
		aClient.setFirstName(firstName);
		aClient.setEmail(email);
		aClient.setAddress(address);
		aClient.setCreditCardNum(creditCardNum);
		aClient.setExpireDate(expireDate);
	}
	
	
	/**
	 * Edit information for a given flight aFlight.
	 * @param flightNumber
	 * @param departureDateandTime
	 * @param arrivalDateandTime
	 * @param airline
	 * @param origin
	 * @param destination
	 * @param cost
	 * @param aFlight
	 */
	public void editFlight(String flightNumber, String departureDateandTime,
			String arrivalDateandTime, String airline, String origin,
			String destination, double cost, Flight aFlight){
		aFlight.setFlightNumber(flightNumber);
		aFlight.setDepartureDateandTime(departureDateandTime);
		aFlight.setArrivalDateandTime(arrivalDateandTime);
		aFlight.setAirline(airline);
		aFlight.setOrigin(origin);
		aFlight.setDestination(destination);
		aFlight.setCost(cost);
		
	}

	
	/**
	 * Select an Itinerary from the displayed for booking.
	 * @param date
	 * @param origin
	 * @param destination
	 * @param itineraryNum
	 * @return wantedItinerary the itinerary at the specific position in arrayList itineraryList.
	 */
	public Itinerary selectItinerary(String date, String origin,
			String destination, int itineraryNum){
		ArrayList<Itinerary> itineraryList = getItineraries(date, origin, destination);
		Itinerary wantedItinerary = itineraryList.get(itineraryNum);
		return wantedItinerary;
	}
	
	
	/**
	 * Book an itinerary anIti for the client aClient. 
	 * @param aClient
	 * @param anIti
	 */
	public void bookItineraries(Client aClient, Itinerary anIti) {
		for (Client client : clients){
			if(client == aClient){
				client.bookItineraries(anIti);
			}
		}
	}
	
	
	/**
	 * View booked itinerary for the client aClient.
	 * @param aClient
	 * @return bookedItinerary a list of booked itinerary for the client aClient
	 */
	public List<Itinerary> viewBookedItinerary(Client aClient) {
		List<Itinerary> bookedItinerary = null;
		for (Client client : clients){
			if(client == aClient){
				bookedItinerary = client.viewBookedItinerary();
			}
		}
		return bookedItinerary;
	}


}
