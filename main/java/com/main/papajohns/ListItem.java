package com.main.papajohns;

public class ListItem {
    private int Id;
    private String Name;
    private int Img;
    private String Description;

    public ListItem(int id, String Name, int img, String description) {
        this.Id = id;
        this.Name = Name;
        this.Img = img;
        this.Description = description;
    }

    public int GetId() {
        return this.Id;
    }
    public String GetName() {
        return this.Name;
    }
    public int GetImg() {
        return this.Img;
    }
    public String GetDescription() {
        return this.Description;
    }
}
