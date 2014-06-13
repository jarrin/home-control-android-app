package nl.jarrin.homecontrol;


import java.util.ArrayList;
import java.util.Arrays;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
/**
 * A placeholder fragment containing a simple view.
 */
public class TabLightsControl extends Fragment {

    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabLightsControl newInstance() {
    	TabLightsControl fragment = new TabLightsControl();
        return fragment;
    }

	private ListView mainListView;
	private ArrayAdapter<String> listAdapter;

    public TabLightsControl() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        
        mainListView = (ListView) getActivity().findViewById( R.id.listViewMain );
        
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",  
                "Jupiter", "Saturn", "Uranus", "Neptune"};    
		ArrayList<String> planetList = new ArrayList<String>();  
		planetList.addAll( Arrays.asList(planets) );  
		
		// Create ArrayAdapter using the planet list.  
		listAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listviewrows, planetList);  
		
		// Add more planets. If you passed a String[] instead of a List<String>   
		// into the ArrayAdapter constructor, you must not add more items.   
		// Otherwise an exception will occur.  
		listAdapter.add( "Ceres" );  
		listAdapter.add( "Pluto" );  
		listAdapter.add( "Haumea" );  
		listAdapter.add( "Makemake" );  
		listAdapter.add( "Eris" );  
		
		// Set the ArrayAdapter as the ListView's adapter.  
		mainListView.setAdapter( listAdapter );        
		
        return rootView;
    }
}
