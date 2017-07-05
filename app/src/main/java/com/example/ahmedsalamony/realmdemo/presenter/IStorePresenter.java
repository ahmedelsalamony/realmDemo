package com.example.ahmedsalamony.realmdemo.presenter;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public interface IStorePresenter extends IBasePresenter {

    void addStore(String storeName);

    void deleteStore(int position);

    void deleteStoreById(String Id);

    void getStoreById(String id);

    void getAllStores();

}
