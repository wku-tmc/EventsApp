package sg.edu.tmc.comp1661.eventsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Event event = getItem(position);


        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from
                    (getContext()).inflate(R.layout.event_layout, parent, false);
        }

        //align the data to the xml layout
        TextView textViewTitle = (TextView)
                convertView.findViewById(R.id.textViewTitle);
        TextView textViewLocation = (TextView)
                convertView.findViewById(R.id.textViewLocation);
        TextView textViewDateTime = (TextView)
                convertView.findViewById(R.id.textViewDateTime);
        TextView textViewOrganiser = (TextView)
                convertView.findViewById(R.id.textViewOrganiser);
        TextView textViewDescription = (TextView)
                convertView.findViewById(R.id.textViewDescription);

        textViewTitle.setText(event.getTitle());
        textViewLocation.setText(event.getLocation());
        textViewDateTime.setText(event.getDatetime());
        textViewOrganiser.setText(event.getOrganiser());
        textViewDescription.setText(event.getDescription());

        return convertView;
    }
}
