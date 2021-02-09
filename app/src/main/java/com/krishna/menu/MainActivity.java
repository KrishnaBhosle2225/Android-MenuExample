package com.krishna.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id)
        {
            case R.id.first:
                Toast.makeText(this, "First Item is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.second:
                Toast.makeText(this, "Second Item is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.third:
                Toast.makeText(this, "Third Item is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.fourth:
                Toast.makeText(this, "Fourth Item is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.fifth:
                Toast.makeText(this, "Fifth Item is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.one:
                Toast.makeText(this, "Sub Item 1 is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.two:
                Toast.makeText(this, "Sub Item 2 is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.thee:
                Toast.makeText(this, "Sub Item 3 is Clicked", Toast.LENGTH_SHORT).show();
                break;


            case R.id.one1:
                Toast.makeText(this, "Sub Item 1 is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.two2:
                Toast.makeText(this, "Sub Item 2 is Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.thee3:
                Toast.makeText(this, "Sub Item 3 is Clicked", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}