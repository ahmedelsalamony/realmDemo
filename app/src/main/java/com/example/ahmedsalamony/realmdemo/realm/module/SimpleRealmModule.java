package com.example.ahmedsalamony.realmdemo.realm.module;

import com.example.ahmedsalamony.realmdemo.model.Item;
import com.example.ahmedsalamony.realmdemo.model.Stores;

import io.realm.annotations.RealmModule;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

@RealmModule(classes = {Item.class, Stores.class})
public class SimpleRealmModule {
}
