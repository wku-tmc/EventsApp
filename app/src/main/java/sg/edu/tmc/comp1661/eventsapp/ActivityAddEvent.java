package sg.edu.tmc.comp1661.eventsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityAddEvent extends AppCompatActivity {

    private SQLiteHelper sQLiteHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        sQLiteHelper = new SQLiteHelper(ActivityAddEvent.this); //starts the db

        final EditText editTextTitle = (EditText) findViewById(R.id.editTextEventTitle);
        final EditText editTextDateTime = (EditText) findViewById(R.id.editTextDateTime);
        final EditText editTextLocation = (EditText) findViewById(R.id.editTextLocation);
        final EditText editTextOrganiser = (EditText) findViewById(R.id.editTextOrganiser);
        final EditText editTextDescription = (EditText) findViewById(R.id.editTextDescription);

        Button button = (Button) findViewById(R.id.buttonInsertEvent);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editTextTitle.getText().toString();
                String datetime = editTextDateTime.getText().toString();
                String location = editTextLocation.getText().toString();
                String organiser = editTextOrganiser.getText().toString();
                String description = editTextDescription.getText().toString();
                Event e = new Event(title, location, datetime, organiser,description);
                sQLiteHelper.insertRecord(e);
            }
        });
    }
}
