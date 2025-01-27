package ie.atu.week1.sem2;

import java.util.ArrayList;

public class JustApp {
    public static void main(String[] args) {

        ArrayList<Food> items = new ArrayList<>();// can store objects of type food
        System.out.println("Welcome to Just App");
        System.out.println("This is your order...");
        // create an order
        Burger cheeseBurger = new Burger("CheeseBurger", 1.99, "Tasty");
        Burger veggie = new Burger("Veggie Burger", 2.99, "Not Tasty");// instance of the class burger
        Pizza tuna = new Pizza("tuna Pizza" ,8.99, "Not to bad ");
        Fries curry = new Fries("Curry fries", 2.99,"Amazing");
        Dessert applePie = new Dessert("Apple Pie", 2.50, "So good");
        // list all of food items like burgers, pizza and fries
        items. add(cheeseBurger);//adds them to the arrylist
        items. add(veggie);
        items.add(tuna);
        items.add(curry);
        items.add(applePie);
        // display details ot the user
        double totalPrice = 0 ;
        for(Food item : items ){
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            totalPrice += item.getPrice();
        }
        System.out.println("Total price: " +totalPrice);//
    }
}

