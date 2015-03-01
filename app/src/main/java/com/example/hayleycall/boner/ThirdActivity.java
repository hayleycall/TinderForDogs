package com.example.hayleycall.boner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.Spinner;
import android.content.SharedPreferences;
import android.widget.AdapterView;
public class ThirdActivity extends ActionBarActivity {
    private Spinner pets,backyard,kids;
    public boolean otherPets,hasBackyard,hasKids;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        pets = (Spinner)findViewById(R.id.otherpet_spinner);
        backyard=(Spinner)findViewById(R.id.backyard_spinner);
        kids = (Spinner)findViewById(R.id.kids_spinner);
        loadSavedPreferences();
    }
    public boolean onItemSelected(Spinner spinner){
            if (spinner.getSelectedItem().toString().equals("Yes"))return true;
            return false;
    }
    private void loadSavedPreferences() {
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        otherPets= onItemSelected(pets);
        hasBackyard= onItemSelected(backyard);
        hasKids= onItemSelected(kids);
        editor.putBoolean("pets",otherPets);
        editor.putBoolean("backyard", hasBackyard);
        editor.putBoolean("kids", hasKids);
        editor.commit();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_third, menu);
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

    public void goToMain(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
