package com.example.ahmedsalamony.realmdemo.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class Store_item extends RealmObject {

    @PrimaryKey
    private int id;
    private RealmList<Stores> stores;
    private RealmList<Item> items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RealmList<Stores> getStores() {
        return stores;
    }

    public void setStores(RealmList<Stores> stores) {
        this.stores = stores;
    }

    public RealmList<Item> getItems() {
        return items;
    }

    public void setItems(RealmList<Item> items) {
        this.items = items;
    }
}
