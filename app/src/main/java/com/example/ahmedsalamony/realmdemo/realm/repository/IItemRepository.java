package com.example.ahmedsalamony.realmdemo.realm.repository;

import com.example.ahmedsalamony.realmdemo.model.Item;

import io.realm.RealmList;
import io.realm.RealmResults;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public interface IItemRepository {

    interface OnSaveItemCallback {
        void onSuccess();
        void onError(String message);
    }

    interface OnDeleteItemCallback {
        void onSuccess();
        void onError(String message);
    }

    interface OnGetItemByIdCallback {
        void onSuccess(Item item);
        void onError(String message);
    }

    interface OnGetAllItemsCallback {
        void onSuccess(RealmResults<Item> items);
        void onError(String message);
    }

    interface OnGetItemsCallback{
        void onSuccess(RealmList<Item> items);
        void onError(String message);
    }
    void addItem(Item student, OnSaveItemCallback callback);

    void addItemByStoreId(Item item, String StoreID, OnSaveItemCallback callback);

    void deleteItemById(String id, OnDeleteItemCallback callback);

    void deleteItemByPosition(int position, OnDeleteItemCallback callback);

    void getAllItems(OnGetAllItemsCallback callback);

    void getAllItemsByStoreId(String id, OnGetItemsCallback callback);

    void getItemById(String id, OnGetItemByIdCallback callback);

}
