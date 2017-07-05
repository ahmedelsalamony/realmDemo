package com.example.ahmedsalamony.realmdemo.realm.repository;

import com.example.ahmedsalamony.realmdemo.model.Stores;

import io.realm.RealmList;
import io.realm.RealmResults;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public interface IStoreRepository {

    interface OnSaveStoreCallback{
        void onSuccess();
        void onError(String message);
    }

    interface OnDeleteStoreCallback{
        void onSuccess();
        void onError(String message);
    }

    interface OnGetStoreById{
        void onSuccess(Stores stores);
        void onError(String message);
    }

    interface OnGetAllStoresCallback {
        void onSuccess(RealmResults<Stores> stores);
        void onError(String message);
    }

  /*  interface OnGetStoresCallback{
        void onSuccess(RealmList<Stores> stores);
        void onError(String message);
    }*/

    void addStore(Stores stores, OnSaveStoreCallback callback);

    void deleteStoreById(String id, OnDeleteStoreCallback callback);

    void deleteStoreByPosition(int position, OnDeleteStoreCallback callback);

    void getAllStores(OnGetAllStoresCallback callback);

    void getStoreById(String id, OnGetStoreById callback);
}
