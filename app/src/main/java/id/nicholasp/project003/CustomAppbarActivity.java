package id.nicholasp.project003;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class CustomAppbarActivity extends AppCompatActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_appbar);

        toolbar = findViewById(R.id.toolbar_display_activity);
        setSupportActionBar(toolbar);
    }

    //menampilkan options menu pada toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.custom_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //ketika salah satu options menu dipilih

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_contact:
                startActivity(new Intent(this, ContactActivity.class));
                Toast.makeText(this, "Menu Contact is Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_gallery:
                startActivity(new Intent(this, GalleryActivity.class));
                Toast.makeText(this, "Menu Gallery is Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_search:
                Toast.makeText(this, "Menu Search is Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_settings:
                startActivity(new Intent(this, SettingActivity.class));
                Toast.makeText(this, "Menu Settings is Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.menu_share:
                startActivity(new Intent(this, ShareActivity.class));
                Toast.makeText(this, "Menu Share is Selected", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, "No Menu is selected", Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}