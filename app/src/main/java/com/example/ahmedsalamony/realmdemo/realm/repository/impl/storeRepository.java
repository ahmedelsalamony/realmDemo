package com.example.ahmedsalamony.realmdemo.realm.repository.impl;

import com.example.ahmedsalamony.realmdemo.app.SimpleRealmApp;
import com.example.ahmedsalamony.realmdemo.model.Stores;
import com.example.ahmedsalamony.realmdemo.realm.repository.IStoreRepository;
import com.example.ahmedsalamony.realmdemo.realm.table.RealmTable;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class StoreRepository implements IStoreRepository {

    @Override
    public void addStore(Stores stores, OnSaveStoreCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        Stores u = realm.createObject(Stores.class);
        u.setId(UUID.randomUUID().toString());
        u.setStore_name(u.getStore_name());
        u.setStore_notification(u.getStore_location());
        u.setStore_location(u.getStore_location());
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }

    @Override
    public void deleteStoreById(String id, OnDeleteStoreCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        Stores stores = realm.where(Stores.class).equalTo(RealmTable.ID, id).findFirst();
        stores.removeFromRealm();
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }

    @Override
    public void deleteStoreByPosition(int position, OnDeleteStoreCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        RealmQuery<Stores> query = realm.where(Stores.class);
        RealmResults<Stores> results = query.findAll();
        results.remove(position);
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }

    @Override
    public void getAllStores(OnGetAllStoresCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        RealmQuery<Stores> query = realm.where(Stores.class);
        RealmResults<Stores> results = query.findAll();

        if (callback != null)
            callback.onSuccess(results);
    }

    @Override
    public void getStoreById(String id, OnGetStoreById callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        Stores result = realm.where(Stores.class).equalTo(RealmTable.ID, id).findFirst();

        if (callback != null)
            callback.onSuccess(result);
    }
}
