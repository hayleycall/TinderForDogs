package com.example.hayleycall.boner;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.Button;

import java.util.jar.Attributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by peyton on 3/1/15.
 */
public class MyAndroidAppActivity extends Activity {

    private EditText emailEditText,passEditText, nameEditText,addressEditText;
    private Spinner gender_spinner;
    private Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceStance){
        super.onCreate(savedInstanceStance);
        setContentView(R.layout.form);

        nameEditText=(EditText) findViewById(R.id.editText_name);
        emailEditText = (EditText) findViewById(R.id.editText_email);
        passEditText = (EditText) findViewById(R.id.editText_password);
        addressEditText = (EditText) findViewById(R.id.editText_address);

        addItemsOnGenderSpinner();
        addListenerOnButton();
        findViewById(R.id.btnSubmit).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                final String email = emailEditText.getText().toString();
                if (!isValidEmail(email)) {
                    emailEditText.setError("Invalid Email");
                }

                final String pass = passEditText.getText().toString();
                if (!isValidPassword(pass)) {
                    passEditText.setError("Invalid Password");
                }
                final String address = addressEditText.getText().toString();
                if(!isValidAddress(address)){
                    passEditText.setError("Invalid Address");
                }
                final String name = nameEditText.getText().toString();
                if(!isValidName(name)){
                    passEditText.setError("Invalid Name");
                }

            }
        });
    }
    private boolean isValidName(String name) {
        String NAME_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-])"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }
    private boolean isValidAddress(String address) {
        String ADDRESS_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(ADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(address);
        return matcher.matches();
    }
    private boolean isValidEmail(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPassword(String pass) {
        if (pass != null && pass.length() > 6) {
            return true;
        }
        return false;
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



    public void addListenerOnButton() {
        gender_spinner = (Spinner) findViewById(R.id.gender_spinner);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MyAndroidAppActivity.this,
                        "OnClick Listener: " +
                                "\nGender: " + String.valueOf(gender_spinner.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

}
