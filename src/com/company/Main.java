package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> order = new ArrayList<>();
        System.out.println("Choose your size> ");
        String size = s.next();
        order.add(size);
        boolean more = true;
        while (more) {
            System.out.println("Enter the topping> ");
            String topping = s.next();
            order.add(topping);
            System.out.println("Do you want another? (Yes,No)> ");
            if (!s.next().equalsIgnoreCase("Yes")) {
                break;
            }

        }
        System.out.println("your final order is " + order);
        double sizePrice = 0;
        if (order.get(0) == "Small"){
            sizePrice = sizePrice + 7.99;
        }
        else if (order.get(0) == "Medium"){
            sizePrice = sizePrice + 10.99;
        }
        else {
            sizePrice = sizePrice + 13.99;
        }
        double toppingsCharged = (order.size() - 3) ;
        if (toppingsCharged < 0) {
            System.out.println("There is no additional price for toppings");
        }
        else{
            double toppingsPrice = toppingsCharged * 1.25;
        }
        double total = toppingsCharged + sizePrice;
        System.out.println(total);
    }
}
