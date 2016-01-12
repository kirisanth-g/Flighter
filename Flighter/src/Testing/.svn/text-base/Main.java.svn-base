/**
 * 
 */
package Testing;

import java.io.FileNotFoundException;

import Phase2.Driver;

/**
 * This is used for testing purposes! Do not mark!
 * 
 * @author Kirisanth
 */
public class Main {

	public static void main(String[] args) {
		try {
			Driver.uploadFlightInfo("C:/Users/Kirisanth/School/CSCB07/group_0346/PII/FlightBookingApp/src/Testing/Flights3.csv");
			Driver.uploadClientInfo("C:/Users/Kirisanth/School/CSCB07/group_0346/PII/FlightBookingApp/src/Testing/Clients.csv");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(Driver.getFlights("2014-12-13", "3", "2"));
		System.out.println(Driver.getClient("a@A"));
//		System.out.println(Driver.getItineraries("2014-12-13", "1", "2"));
//		System.out.println("Change!!!!");
//		System.out.println(Driver.getItinerariesSortedByCost("2014-12-13", "1",
//				"2"));
//		System.out.println("Change!!!!");
//		System.out.println(Driver.getItinerariesSortedByTime("2014-12-13", "1",
//				"2"));
	}
}
