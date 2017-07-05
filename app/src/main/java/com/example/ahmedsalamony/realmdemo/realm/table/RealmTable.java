package com.example.ahmedsalamony.realmdemo.realm.table;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public interface RealmTable {


    String ID = "id";

    interface users {
        String EMAIL = "email";
        String PASSWORD = "password";
    }

    interface stores {
        String STORE_NAME = "storeName";
        String STORE_LOCATION = "storeLocation";
        String STORE_NOTIFICATION = "storeNotification";
    }

    interface items {
        String ITEM_NAME = "itemName";
        String ITEM_TAG = "itemTag";
        String ITEM_QTY = "itemQnt";
        String ITEM_NOTE = "itemNote";
        String ITEM_EVENT = "event";
    }
}
