package com.nextgen.assignment8a;
public class Order {
    private int id;
    private String number;
    private String  price;
    private String  height;
    private String width;


    public Order(int id, String number, String price, String width, String height) {
        this.id = id;
        this.number = number;
        this.price = price;
        this.height = height;
        this.width = width;


    }
    public int getId(){
        return id;
    }
    public String getNumber() {
        return number;
    }
    public String getPrice() {
        return price;
    }
    public String getWidth() {
        return width;
    }
    public String getHeight() {
        return height;
    }

}