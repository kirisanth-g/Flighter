package Phase2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * A client in the application.
 * 
 * @author zhouxiaohan
 * 
 */
public class Client extends User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4419384852690122401L;
	private String creditCardNum;
	private String expireDate;
	private List<Itinerary> bookedList;

	/**
	 * Creates a Client with the given last name, first name, email, address,
	 * credit credit number and expire date, then create an empty array list
	 * bookedList.
	 * 
	 * @param lastName
	 *            last name of the new Client.
	 * @param firstName
	 *            first name of the new Client.
	 * @param email
	 *            email of the new Client.
	 * @param address
	 *            address of the new Client.
	 * @param creditCardNum
	 *            credit card number of the new Client.
	 * @param expireDate
	 *            expire date of the credit card of the new Client.
	 */
	public Client(String lastName, String firstName, String email,
			String address, String creditCardNum, String expireDate) {
		super(lastName, firstName, email, address);
		this.creditCardNum = creditCardNum;
		this.expireDate = expireDate;
		this.bookedList = new ArrayList<Itinerary>();
	}

	/**
	 * Returns the credit card number of this Client.
	 * 
	 * @return the credit card number of this Client
	 */
	public String getCreditCardNum() {
		return creditCardNum;
	}

	/**
	 * Sets the credit card number of this Client to creditCardNum.
	 * 
	 * @param creditCardNum
	 *            the new credit card number of this Client
	 */
	public void setCreditCardNum(String creditCardNum) {
		this.creditCardNum = creditCardNum;
	}

	/**
	 * Returns the expire date of this Client.
	 * 
	 * @return the expire date of this Client
	 */
	public String getExpireDate() {
		return expireDate;
	}

	/**
	 * Sets the expire date of this Client to expireDate.
	 * 
	 * @param expiryDate
	 *            the new expire date of this Client
	 */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * Books an Itinerary by adding it to the list of booked Itineraries for
	 * this Client.
	 * 
	 * @param anIti
	 *            Itinerary that will be added for this Client
	 */
	public void bookItineraries(Itinerary anIti) {
		bookedList.add(anIti);
	}

	/**
	 * Returns an ArrayList of Itineraries that been booked this this Client.
	 * 
	 * @return an ArrayList of Itineraries that have been book by this Client
	 */
	public List<Itinerary> viewBookedItinerary() {
		return bookedList;
	}

	/**
	 * String representation of a Client that will show all their personal
	 * information.
	 * 
	 * @return String representation of Client.
	 **/
	@Override
	public String toString() {
		return super.toString() + "," + creditCardNum + "," + expireDate;
	}

}