package com.main.papajohns;

import java.util.ArrayList;

public class Database {
    private ArrayList<ListItem> ItemsPizzas = new ArrayList<>();
    private ArrayList<ListItem> ItemsPastas = new ArrayList<>();
    private ArrayList<ListItem> ItemsStores = new ArrayList<>();

    public Database() {
        ItemsPizzas.add(new ListItem(1,
                "Томатная с креветками",
                R.drawable.ca7e52823f6dfa5bfddae8391588e36f,
                "Томатная с креветками: яркий вкус креветок, фирменного томатного соуса, сыра моцарелла, свежих томатов и мягкого молодого сыра."));
        ItemsPizzas.add(new ListItem(2,
                "Пепперони Грин",
                R.drawable.a159a80338bf7e2745d8efb3e3a8e05ff,
                "Пикантная пепперони, сладкий перец, Моцарелла с фирменным томатным соусом"));
        ItemsPizzas.add(new ListItem(3,
                "Цыплёнок Грин",
                R.drawable.a717c70cd1e5ddce84459cd528dd845c9,
                "Сочное куриное филе,сыр моцарелла, сладкий перец, соус «Чесночный рэнч», чеснок и томаты."));

        ItemsPastas.add(new ListItem(1,
                "Мамина паста, спагетти",
                R.drawable.e8aabd519337031f2c5da13a9cf1026e,
                "Паста, томатный соус, сыр моцарелла, сыр реджанито"));
        ItemsPastas.add(new ListItem(2,
                "Паста Примавера, пенне",
                R.drawable.a5786ab727738b2a9f33b732692f5a688,
                "Паста, томатный соус, куриная грудка, овощи, сыр моцарелла, сыр реджанито"));
        ItemsPastas.add(new ListItem(3,
                "Паста Примавера, спагетти",
                R.drawable.a5786ab727738b2a9f33b732692f5a688,
                "Паста, томатный соус, куриная грудка, овощи, сыр моцарелла, сыр реджанито"));

        ItemsStores.add(new ListItem(1,
                "ул. Машинистов 1",
                R.drawable.m1,
                "Пн - Вс 11:00 - 23:00"));
        ItemsStores.add(new ListItem(2,
                "ул. Гагарина, 33",
                R.drawable.g33,
                "Пн - Вс 11:00 - 23:00"));
        ItemsStores.add(new ListItem(3,
                "ул. Вильгельма де Геннина, 40",
                R.drawable.a40,
                "Пн - Вс 11:00 - 23:00"));
    }

    public ArrayList<ListItem> GetPizzas() {
        return ItemsPizzas;
    }
    public ArrayList<ListItem> GetPastas() {
        return ItemsPastas;
    }
    public ArrayList<ListItem> GetStores() {
        return ItemsStores;
    }

}
