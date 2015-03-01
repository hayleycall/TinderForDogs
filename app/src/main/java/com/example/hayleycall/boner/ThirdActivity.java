package com.example.hayleycall.boner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.RadioButton;
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
    }
    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch(view.getId()) {
            case R.id.otherpet_yes:
                if (checked)MyProperties.getInstance().otherPets = true;
                break;
            case R.id.otherpet_no:
                if(checked)MyProperties.getInstance().otherPets=false;
                break;
            case R.id.kids_yes:
                if (checked)MyProperties.getInstance().hasKids = true;
                break;
            case R.id.kids_no:
                if(checked)MyProperties.getInstance().hasKids=false;
                break;
            case R.id.backyard_yes:
                if (checked)MyProperties.getInstance().hasBackyard = true;
                break;
            case R.id.backyard_no:
                if(checked)MyProperties.getInstance().hasBackyard=false;
                break;
            // Ninjas rule
        }
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
