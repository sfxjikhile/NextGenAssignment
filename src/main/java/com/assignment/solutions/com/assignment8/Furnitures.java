package com.assignment.solutions.com.assignment8;

import java.util.Scanner;

public class Furnitures implements Furniture {
    private static final int MAX_ORDER = 1000;
    private static int numOrder = 0;
    private static final Order[] orders = new Order[MAX_ORDER];

    public void bookshelfInfo() {
        Scanner enter = new Scanner(System.in);
        System.out.print("input an id: ");
        int id = enter.nextInt();
        System.out.print("input number of bookshelf of the same attribute you want: ");
        String number = enter.next();
        System.out.print("please input a desired price: ");
        String price = enter.next();
        System.out.print("Enter the width of your choice: ");
        String width = enter.next();
        System.out.print("Enter the height of your choice: ");
        String height = enter.next();

        Order bookShelf1 = new Order(id, number, price, width, height);
        orders[numOrder++] = bookShelf1;
    }
    public void chairInfo() {
        Scanner enter = new Scanner(System.in);
        System.out.println("input an id: ");
        int id = enter.nextInt();
        System.out.println("input number of chair of the same attribute: ");
        String number = enter.next();
        System.out.println("please input a desired price: ");
        String price = enter.next();
        System.out.print("Enter the width of your choice: ");
        String width = enter.next();
        System.out.print("Enter the height of your choice: ");
        String height = enter.next();
        Order chair1 = new Order(id, number, price, width, height);
        orders[numOrder++] = chair1;
    }
    public static void checkData(Order furniture) {
        System.out.println("your id is: " + furniture.getId());
        System.out.println("the quantity you ordered: " + furniture.getNumber());
        System.out.println("the price you choose to go with is: " + furniture.getPrice());
        System.out.println("width of your choice is: " + furniture.getWidth());
        System.out.println("height of your choice is: " + furniture.getHeight());
    }
    private void viewOrder() {
        Scanner print = new Scanner(System.in);
        System.out.println("Enter identification(id) to view order: ");
        int id = print.nextInt();
        boolean orderFound = false;
        for (int i = 0; i < numOrder; i++) {
            if (orders[i].getId() == id) {
                checkData(orders[i]);
                orderFound = true;
                break;
            }
        }
        if (!orderFound) {
            System.out.println("no order found");
        }
    }

    public static void main(String[] args) {
        int details;
        Furnitures order = new Furnitures();
        Scanner enter = new Scanner(System.in);
        do {
            System.out.println("Select an option\n1: Place an order for chair" +
                    "\n2: Place order " + "for bookshelf\n3: to view order\n4: to exit");
            details = enter.nextInt();
            switch (details) {
                case 1:
                    order.bookshelfInfo();
                    System.out.println("Thank you\nyour request has been submitted successfully\n" +
                            "Press 4 to exit the application ");
                    break;
                case 2:
                    order.chairInfo();
                    System.out.println("Thank you\nyour request has been submitted successfully\n" +
                            "Press 4 to exit the application ");
                    break;
                case 3:
                    order.viewOrder();
                    break;
                case 4:
                    System.out.println("logging out...");
                    break;
                default:
                    System.out.println("invalid input, try again");
                    break;
            }
        } while (details != 4);
    }
}
