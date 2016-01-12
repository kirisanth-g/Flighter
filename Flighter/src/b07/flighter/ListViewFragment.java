/**
 * 
 */
package b07.flighter;

import java.util.ArrayList;

import Phase2.User;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import Phase2.Flight;

/**
 * @author Kirisanth
 *
 */
public class ListViewFragment extends Fragment {
	
	private View rootView;
	private ListView lv;

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_listview, container, false);
		lv = (ListView) getView().findViewById(R.id.listviewer);
		@SuppressWarnings("unchecked")
		ArrayList<Flight> flights = (ArrayList<Flight>) getArguments().get(GetFlightsFragment.FLIGHTS);
//		ArrayAdapter<Flight> arrayAdapter = new ArrayAdapter<Flight>(
//                this, 
//                android.R.layout.simple_list_item_1,
//                flights );
        return rootView;
    }

}
