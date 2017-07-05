package com.example.ahmedsalamony.realmdemo.presenter.impl;

import com.example.ahmedsalamony.realmdemo.MainActivity;
import com.example.ahmedsalamony.realmdemo.model.Item;
import com.example.ahmedsalamony.realmdemo.presenter.IItemPresenter;
import com.example.ahmedsalamony.realmdemo.realm.repository.IItemRepository;
import com.example.ahmedsalamony.realmdemo.realm.repository.IStoreRepository;
import com.example.ahmedsalamony.realmdemo.realm.repository.impl.ItemsRepository;
import com.example.ahmedsalamony.realmdemo.realm.repository.impl.StoreRepository;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class ItemPresenter implements IItemPresenter {

    private MainActivity view;

    private IItemRepository.OnDeleteItemCallback onDeleteItemCallback;
    private IItemRepository.OnSaveItemCallback onSaveItemCallback;
    private IItemRepository.OnGetAllItemsCallback onGetAllItemsCallback;
    private IItemRepository.OnGetItemByIdCallback onGetItemByIdCallback;
    private IItemRepository.OnGetItemsCallback onGetItemsCallback;
    private IStoreRepository.OnGetStoreById onGetStoreById;

    private ItemsRepository itemsRepository;
    private StoreRepository storeRepository;

    public ItemPresenter(MainActivity view) {
        this.view = view;
        itemsRepository = new ItemsRepository();
        storeRepository = new StoreRepository();
    }

    @Override
    public void addItem(Item item) {
          itemsRepository.addItem(item,onSaveItemCallback);
    }

    @Override
    public void addItemByStoreId(Item item, String storeId) {

    }

    @Override
    public void deleteItemByPosition(int position) {

    }

    @Override
    public void deleteItemById(String itemId) {

    }

    @Override
    public void getAllItems() {

    }

    @Override
    public void getAllItemsByStoresId(String id) {

    }

    @Override
    public void getItemById(String id) {

    }

    @Override
    public void getStoreById(String id) {

    }

    @Override
    public void subscribeCallbacks() {

    }

    @Override
    public void unSubscribeCallbacks() {

    }
}
