package com.example.hayleycall.boner;

import android.provider.Settings;

/**
 * Created by peyton on 3/1/15.
 */
public class MyProperties {
    private static MyProperties mInstance=null;

    public boolean otherPets;
    public boolean hasBackyard;
    public boolean hasKids;

    protected MyProperties(){}

    public static synchronized MyProperties getInstance()

    {
        if (null == mInstance) {
            mInstance = new MyProperties();
        }

        return mInstance;
    }

}
