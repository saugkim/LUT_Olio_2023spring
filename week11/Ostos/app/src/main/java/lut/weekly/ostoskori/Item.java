package lut.weekly.ostoskori;

import androidx.annotation.NonNull;

public class Item {

    String name;
    String info = null;
    String date;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(String.format("\nDate: %s", date));
        if (info != null) {
            sb.append(String.format("\nMuista: %s", info));
        }
        return sb.toString();
    }
}
