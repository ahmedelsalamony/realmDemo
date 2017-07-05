package com.example.ahmedsalamony.realmdemo.app;

import android.app.Application;

import com.example.ahmedsalamony.realmdemo.realm.module.SimpleRealmModule;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class SimpleRealmApp extends Application {


    private static SimpleRealmApp instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        RealmConfiguration config = new RealmConfiguration.Builder(getApplicationContext()).setModules(new SimpleRealmModule()).build();
        Realm.setDefaultConfiguration(config);
    }

    public static SimpleRealmApp getInstance() {
        return instance;
    }
}
