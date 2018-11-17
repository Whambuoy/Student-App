package com.example.whambuoy.myapplication;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;
import com.example.whambuoy.myapplication.models.User;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Configuration dbConfiguration = new Configuration
                .Builder(this)
                .setDatabaseName("student.db")
                .addModelClass(User.class) //<- add for every model.
                .create();
        ActiveAndroid.initialize(dbConfiguration);
    }
}
