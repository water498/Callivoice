package com.example.callivoice;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;

public class CalliVoice extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
