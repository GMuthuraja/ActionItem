package com.example.app.actionitem;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
git
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar = getSupportActionBar();
        bar.setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int selectedItem = item.getItemId();
            switch (selectedItem){
                case android.R.id.home:
                    Toast.makeText(MainActivity.this, "You clicked back button!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.icon1:
                    Toast.makeText(MainActivity.this, "You just clicked Email!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.icon2:
                    Toast.makeText(MainActivity.this, "You just clicked Camera!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.icon3:
                    Toast.makeText(MainActivity.this, "You just clicked Info!", Toast.LENGTH_LONG).show();
                    break;

                case R.id.icon4:
                    Toast.makeText(MainActivity.this, "You just clicked Add!", Toast.LENGTH_LONG).show();
                    break;
            }
        return true;
    }
}
