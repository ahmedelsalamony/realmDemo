package com.example.ahmedsalamony.realmdemo.model;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class Users_Stores extends RealmObject {

    @PrimaryKey
    private int id;
    private RealmList<Users> users;
    private RealmList<Stores> stores;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RealmList<Users> getUsers() {
        return users;
    }

    public void setUsers(RealmList<Users> users) {
        this.users = users;
    }

    public RealmList<Stores> getStores() {
        return stores;
    }

    public void setStores(RealmList<Stores> stores) {
        this.stores = stores;
    }
}
