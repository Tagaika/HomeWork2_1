package com.company;

public class Parents extends House{

    private int countOfChildren;

    public enum CHILDRENS {
        HASAN, TAGAY, NURSULTAN, ATAY
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public Parents(String address, int countOfChildren) {
        super(address);
        this.countOfChildren = countOfChildren;
    }     public void floors(){
        System.out.println("More than three");
    }
    public final String floors (String quality){
        return quality;
    }
    public int floors (int area){
        return area;
    }


}
