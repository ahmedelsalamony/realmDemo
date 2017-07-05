package com.example.ahmedsalamony.realmdemo.realm.repository.impl;

import com.example.ahmedsalamony.realmdemo.app.SimpleRealmApp;
import com.example.ahmedsalamony.realmdemo.model.Item;
import com.example.ahmedsalamony.realmdemo.model.Stores;
import com.example.ahmedsalamony.realmdemo.realm.repository.IItemRepository;
import com.example.ahmedsalamony.realmdemo.realm.table.RealmTable;
import java.util.UUID;
import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class ItemsRepository implements IItemRepository {

    @Override
    public void addItem(Item student, OnSaveItemCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        Item realmitem = realm.createObject(Item.class);
        realmitem.setId(UUID.randomUUID().toString());
        realmitem.setItem_name(realmitem.getItem_name());
        realmitem.setItem_qty(realmitem.getItem_qty());
        realmitem.setItem_tag(realmitem.getItem_tag());
        realmitem.setItem_note(realmitem.getItem_note());
        realmitem.setItem_event(realmitem.getItem_event());
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }

    @Override
    public void addItemByStoreId(Item item, String StoreID, OnSaveItemCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        Item realmitem = realm.createObject(Item.class);
        realmitem.setId(UUID.randomUUID().toString());
        realmitem.setItem_name(realmitem.getItem_name());
        realmitem.setItem_qty(realmitem.getItem_qty());
        realmitem.setItem_tag(realmitem.getItem_tag());
        realmitem.setItem_note(realmitem.getItem_note());
        realmitem.setItem_event(realmitem.getItem_event());
        Stores stores = realm.where(Stores.class).equalTo(RealmTable.ID, StoreID).findFirst();
        stores.getItems().add(realmitem);
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }


    @Override
    public void deleteItemById(String id, OnDeleteItemCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        Item result = realm.where(Item.class).equalTo(RealmTable.ID, id).findFirst();
        result.removeFromRealm();
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }

    @Override
    public void deleteItemByPosition(int position, OnDeleteItemCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        realm.beginTransaction();
        RealmQuery<Item> query = realm.where(Item.class);
        RealmResults<Item> results = query.findAll();
        results.remove(position);
        realm.commitTransaction();

        if (callback != null)
            callback.onSuccess();
    }

    @Override
    public void getAllItems(OnGetAllItemsCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        RealmResults<Item> results = realm.where(Item.class).findAll();

        if (callback != null)
            callback.onSuccess(results);
    }

    @Override
    public void getAllItemsByStoreId(String id, OnGetItemsCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        Stores university = realm.where(Stores.class).equalTo(RealmTable.ID, id).findFirst();
        RealmList<Item> students = university.getItems();

        if (callback != null)
            callback.onSuccess(students);
    }

    @Override
    public void getItemById(String id, OnGetItemByIdCallback callback) {
        Realm realm = Realm.getInstance(SimpleRealmApp.getInstance());
        Item student = realm.where(Item.class).equalTo(RealmTable.ID, id).findFirst();

        if (callback != null)
            callback.onSuccess(student);
    }
}
