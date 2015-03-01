package com.example.hayleycall.boner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;
/**
 * Created by peyton on 3/1/15.
 */
public class CustonOnItemSelectedListener implements OnItemSelectedListener {

    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        Toast.makeText(parent.getContext(),"OnItemSelectedListener: " + parent.getItemAtPosition(pos).toString(),
                Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0){

    }

}
