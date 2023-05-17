package sg.edu.rp.c346.id22026341.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayModule extends AppCompatActivity {
    TextView tvShowModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_module);
        tvShowModule = findViewById(R.id.showModule);

        Intent intentReceivedCode = getIntent();
        Intent intentReceivedName = getIntent();
        Intent intentReceivedYear = getIntent();
        Intent intentReceivedSem = getIntent();
        Intent intentReceivedVenue = getIntent();

        String code = intentReceivedCode.getStringExtra("Code");
        String name = intentReceivedName.getStringExtra("Name");
        int year = intentReceivedYear.getIntExtra("Year", 2);
        int sem = intentReceivedSem.getIntExtra("Sem", 1);
        String venue = intentReceivedVenue.getStringExtra("Venue");

        tvShowModule.setText("Module Code: " + code + "\nModule Name: " + name + "\nYear: " + year + "\nSemester: " + sem + "\nVenue: " + venue);
    }
}