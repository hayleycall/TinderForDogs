package com.example.hayleycall.boner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class puppy2 extends ActionBarActivity {
    public boolean otherPets=true;
    public boolean hasBackyard=false;
    public boolean hasKids=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.puppy2);
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

    public void goToNextDog(View view){
        Intent intent = new Intent(this,puppy3.class);
        startActivity(intent);
    }

    public void match(View view){
        if(MyProperties.getInstance().otherPets==true && MyProperties.getInstance().hasBackyard==false
                && MyProperties.getInstance().hasKids==true){
            Intent intent = new Intent(this,FifthActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(this,puppy3.class);
            startActivity(intent);
        }

    }
}
