package sg.edu.tmc.comp1661.eventsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityListAllEvents extends AppCompatActivity {

    private SQLiteHelper sQLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all_events);
        sQLiteHelper = new SQLiteHelper(ActivityListAllEvents.this);

        // Construct the data source
        ArrayList<Event> events = sQLiteHelper.getAllRecords();
        // Create the adapter to convert the array to views
        EventAdapter adapter = new EventAdapter(this, events);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Event e = (Event) parent.getItemAtPosition(position);
                Toast.makeText(ActivityListAllEvents.this, "Selected: " + e.getTitle(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
