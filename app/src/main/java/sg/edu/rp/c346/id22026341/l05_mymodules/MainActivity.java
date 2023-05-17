package sg.edu.rp.c346.id22026341.l05_mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvC218;
    TextView tvC203;
    TextView tvC206;
    TextView tvC235;
    TextView tvC346;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC218 = findViewById(R.id.textViewC218);
        tvC203 = findViewById(R.id.textViewC203);
        tvC206 = findViewById(R.id.textViewC206);
        tvC235 = findViewById(R.id.textViewC235);
        tvC346 = findViewById(R.id.textViewC346);

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC218 = new Intent(MainActivity.this, DisplayModule.class);
                intentC218.putExtra("Code", "C218");
                intentC218.putExtra("Name","UI/UX");
                intentC218.putExtra("Year", 2);
                intentC218.putExtra("Sem", 1);
                intentC218.putExtra("Venue","W65C");
                startActivity(intentC218);
            }
        });
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC203 = new Intent(MainActivity.this, DisplayModule.class);
                intentC203.putExtra("Code", "C203");
                intentC203.putExtra("Name","Web app development in PHP");
                intentC203.putExtra("Year", 2);
                intentC203.putExtra("Sem", 1);
                intentC203.putExtra("Venue","W65C");
                startActivity(intentC203);
            }
        });
        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC206 = new Intent(MainActivity.this, DisplayModule.class);
                intentC206.putExtra("Code", "C206");
                intentC206.putExtra("Name","Software developement process");
                intentC206.putExtra("Year", 2);
                intentC206.putExtra("Sem", 1);
                intentC206.putExtra("Venue","W65C");
                startActivity(intentC206);
            }
        });
        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC235 = new Intent(MainActivity.this, DisplayModule.class);
                intentC235.putExtra("Code", "C235");
                intentC235.putExtra("Name","IT security and management");
                intentC235.putExtra("Year", 2);
                intentC235.putExtra("Sem", 1);
                intentC235.putExtra("Venue","W65C");
                startActivity(intentC235);
            }
        });
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentC346 = new Intent(MainActivity.this, DisplayModule.class);
                intentC346.putExtra("Code", "C346");
                intentC346.putExtra("Name","Mobile app development");
                intentC346.putExtra("Year", 2);
                intentC346.putExtra("Sem", 1);
                intentC346.putExtra("Venue","E63A");
                startActivity(intentC346);
            }
        });
    }
}