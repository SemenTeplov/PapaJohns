package com.main.papajohns;

import java.util.ArrayList;

public class OrdeList {
    private ArrayList<ListItem> order = new ArrayList<>();
    private static OrdeList instance = null;

    public static OrdeList getInstance() {
        if (instance == null) {
            instance = new OrdeList();
        }
        return instance;
    }

    public void add(ListItem item) {
        order.add(item);
    }
    public void remove(int id) {
        for (int i = 0; i < order.size(); i++) {
            ListItem item = order.get(i);

            if (item.GetId() == id) {
                order.remove(item);
            }
        }
    }
    public ArrayList<ListItem> getItems() {
        return new ArrayList<>(order);
    }
}
