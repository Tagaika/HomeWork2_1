package com.company;

public class Children extends Parents {
    private Hasan hasan;
    private String skin;

    public String getSkin() {
        return skin;
    }

    public Children(String address, int countOfChildren, String skin) {
        super(address, countOfChildren);
        this.skin = skin;
    }




    public Hasan getHasan() {
        return hasan;
    }

    @Override
    public void floors() {
        System.out.println("Hello");
    }
}
