package com.example.hayleycall.boner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;


/**
 * Created by peyton on 3/1/15.
 */
public class MyAndroidAppActivity extends Activity {

    private Spinner gender_spinner,activity_spinner;
    private Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceStance){
        super.onCreate(savedInstanceStance);
        setContentView(R.layout.form);

        addItemsOnGenderSpinner();
        addItemsOnActivitySpinner();
        addListenerOnButton();


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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

    public void addItemsOnGenderSpinner(){
        gender_spinner=(Spinner)findViewById(R.id.gender_spinner);
    }

    public void addItemsOnActivitySpinner(){
        activity_spinner=(Spinner)findViewById(R.id.activity_spinner);
    }

    public void addListenerOnButton() {
        gender_spinner = (Spinner) findViewById(R.id.gender_spinner);
        activity_spinner = (Spinner) findViewById(R.id.activity_spinner);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAndroidAppActivity.this,
                        "OnClick Listener: " +
                        "\nGender: " + String.valueOf(gender_spinner.getSelectedItem()) +
                        "\nActivity Level: " + String.valueOf(activity_spinner.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }




}
