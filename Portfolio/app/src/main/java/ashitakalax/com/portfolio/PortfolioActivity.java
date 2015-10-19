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

/**
 * @author Levi.Balling
 *
 * This is the Portfolio project zero app for the Udacity Nano Degree
 * Implemented Code review suggestions from BingTao. It saved a lot of code space.
 *
 */
public class PortfolioActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TOAST_STR_HEADER = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.PopularMovieButton:
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my popular movies app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.ScoresAppButton:
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my scores app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.LibraryAppButton:
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my library app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.BuildItBiggerButton:
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my build it bigger app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.XyzReaderButton:
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my xyz reader app!", Toast.LENGTH_SHORT).show();
                return;
            case R.id.CapstoneAppButton:
                Toast.makeText(getApplicationContext(), TOAST_STR_HEADER+"my capstone app!", Toast.LENGTH_SHORT).show();
                return;
        }
    }
}
