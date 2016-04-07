package sg.edu.tmc.comp1661.eventsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddEvent = (Button) findViewById(R.id.buttonAddEvent);
        Button buttonListAllEvents = (Button) findViewById(R.id.buttonListAllEvents);

        buttonAddEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityAddEvent.class);
                startActivity(i);
            }
        });

        buttonListAllEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityListAllEvents.class);
                startActivity(i);
            }
        });
    }
}
