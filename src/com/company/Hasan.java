package com.company;

public final class Hasan  extends Children {
    private int year;

    public Hasan(String address, int countOfChildren, String skin, int year) {
        super(address, countOfChildren, skin);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

}

