package ashitakalax.com.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    private final String TOAST_STR_HEADER = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button popularMovies = (Button)findViewById(R.id.PopularMovieButton);
        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my popular movies app!", Toast.LENGTH_SHORT).show();

            }
        });


        Button scoresAppButton = (Button)findViewById(R.id.ScoresAppButton);
        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my scores app!", Toast.LENGTH_SHORT).show();

            }
        });

        Button libraryAppButton = (Button)findViewById(R.id.LibraryAppButton);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my library app!", Toast.LENGTH_SHORT).show();

            }
        });

        Button buildItBiggerButton = (Button)findViewById(R.id.BuildItBiggerButton);
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my build it bigger app!", Toast.LENGTH_SHORT).show();

            }
        });

        Button xyzReaderButton = (Button)findViewById(R.id.XyzReaderButton);
        xyzReaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my xyz reader app!", Toast.LENGTH_SHORT).show();

            }
        });

        Button capstoneButton = (Button)findViewById(R.id.CapstoneAppButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //display toast
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my capstone app!", Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
