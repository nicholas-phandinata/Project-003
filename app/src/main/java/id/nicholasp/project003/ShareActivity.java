package id.nicholasp.project003;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class ShareActivity extends AppCompatActivity {
    ActionBar settingsActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        //custom ActionBar
        settingsActionBar = getSupportActionBar();
        settingsActionBar.setTitle("Share");

        //memunculkan back button
        settingsActionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        onBackPressed();
        return true;
    }
}