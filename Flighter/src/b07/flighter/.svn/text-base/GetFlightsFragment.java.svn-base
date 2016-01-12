/**
 * 
 */
package b07.flighter;

import java.util.ArrayList;

import Phase2.Flight;
import Phase2.User;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

/**
 * @author Kirisanth
 *
 */
public class GetFlightsFragment extends Fragment {
	
	private View rootView;
	private User user;
	static final String FLIGHTS = "flights";

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_get_flight, container, false);
		//Get User
		user = (User) getArguments().get(LoginActivity.USERKEY);
		//Add Button Listener
		Button mButton = (Button) rootView.findViewById(R.id.searchbutton);
	       mButton.setOnClickListener(new OnClickListener() {
	          public void onClick(View v) {
	      		search(v);
	          }
	       });
        return rootView;
    }
	
	public void search(View view){
		EditText dateEditText = (EditText) getView().findViewById(R.id.depart_date);
		EditText originEditText = (EditText) getView().findViewById(R.id.origin);
		EditText destinationEditText = (EditText) getView().findViewById(R.id.destination);
		String date = dateEditText.getText().toString();
		String origin = originEditText.getText().toString();
		String destination = destinationEditText.getText().toString();
		ArrayList<Flight> flights = User.getFlights(date, origin, destination);
		Bundle bundle = new Bundle();
		bundle.putSerializable(FLIGHTS, flights);
		ListViewFragment lvf = new ListViewFragment();
		lvf.setArguments(bundle);
		FragmentManager manager = getFragmentManager();
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.replace(R.id.getflight, lvf);
		transaction.commit();
	}

}
