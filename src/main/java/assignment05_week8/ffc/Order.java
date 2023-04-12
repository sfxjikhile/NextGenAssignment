package assignment05_week8.ffc;

import assignment05_week8.ffc.FurnitureTypes;

public class Order {
    FurnitureTypes furniture;

    String orderID;

    String customer;
    double price;
    double width;
    double height;

    public Order(FurnitureTypes furniture, String orderID, String customer, double price, double width, double height){
        this.furniture = furniture;
        this.orderID = orderID;
        this.customer = customer;
        this.price = price;
        this.width = width;
        this.height = height;
    }
}
