/**
 * 
 */
package Phase2;

import java.util.Comparator;

/**
 * A Comparator class for Itineraries that helps sort by total cost.
 * 
 * @author Kirisanth
 * 
 */
public class CostComparator implements Comparator<Itinerary> {

	/**
	 * Compares itinerary itin1 to the itinerary itin2 based on total travel
	 * cost.
	 * 
	 * @param itin1
	 *            an Itinerary that will be compared.
	 * @param itin2
	 *            another Itinerary that will be compared.
	 */
	@Override
	public int compare(Itinerary itin1, Itinerary itin2) {
		if (itin1.getTotalCost() < itin2.getTotalCost()) {
			return -1;
		}

		else if (itin1.getTotalCost() > itin2.getTotalCost()) {
			return 1;
		}

		return 0;
	}

}
