package com.example.ahmedsalamony.realmdemo.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class Stores extends RealmObject {

    @PrimaryKey
    private String id;
    private String store_name,store_location,store_notification;
    private RealmList<Item> items;

    public RealmList<Item> getItems() {
        return items;
    }

    public void setItems(RealmList<Item> items) {
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getStore_location() {
        return store_location;
    }

    public void setStore_location(String store_location) {
        this.store_location = store_location;
    }

    public String getStore_notification() {
        return store_notification;
    }

    public void setStore_notification(String store_notification) {
        this.store_notification = store_notification;
    }
}
