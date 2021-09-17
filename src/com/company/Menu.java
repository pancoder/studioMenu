package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
//    ArrayList<App> apps = new ArrayList<>();
//
//    public void addApp(App app){
//        apps.add(app);
//    }

    private ArrayList<Menu_Item> items;
    private Date lastUpdated;

    public Menu(ArrayList<Menu_Item> items){
        this.items = items;
        this.lastUpdated = new Date ();
    }

    public ArrayList<Menu_Item> getItem() {
        return items;
    }

    public void setItem(ArrayList<Menu_Item> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // this method only looks for exceptions
    public boolean addItem(Menu_Item item){
        try {
            items.add(item);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    // adds item
    public void addItem(Menu_Item item){
        items.add(item);
    }


}
