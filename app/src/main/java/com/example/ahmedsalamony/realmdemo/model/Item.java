package com.example.ahmedsalamony.realmdemo.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Ahmed Salamony on 7/5/2017.
 */

public class Item extends RealmObject {

    @PrimaryKey
    private String id;
    private String item_name,item_tag,item_qty,item_note,item_event;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_tag() {
        return item_tag;
    }

    public void setItem_tag(String item_tag) {
        this.item_tag = item_tag;
    }

    public String getItem_qty() {
        return item_qty;
    }

    public void setItem_qty(String item_qty) {
        this.item_qty = item_qty;
    }

    public String getItem_note() {
        return item_note;
    }

    public void setItem_note(String item_note) {
        this.item_note = item_note;
    }

    public String getItem_event() {
        return item_event;
    }

    public void setItem_event(String item_event) {
        this.item_event = item_event;
    }
}
