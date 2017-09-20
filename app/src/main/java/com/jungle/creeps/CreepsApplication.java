package com.jungle.creeps;

import android.app.Application;


public class CreepsApplication extends Application {
    private static CreepsApplication mInstance;

    public CreepsApplication() {
        mInstance = this;
    }

    public static CreepsApplication getInstances() {
        if (null == mInstance) {
            mInstance = new CreepsApplication();
        }
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
