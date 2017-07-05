package com.example.ahmedsalamony.realmdemo.presenter;

import com.example.ahmedsalamony.realmdemo.model.Item;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public interface IItemPresenter extends IBasePresenter {

    void addItem(Item item);

    void addItemByStoreId(Item item, String storeId);

    void deleteItemByPosition(int position);

    void deleteItemById(String itemId);

    void getAllItems();

    void getAllItemsByStoresId(String id);

    void getItemById(String id);

    void getStoreById(String id);

}
