package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Toy {
    double price;
    String color;

    Toy(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

public class Test2 {
    public static void main(String[] args) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("red", 10));
        toys.add(new Toy("yellow", 10));
        toys.add(new Toy("red", 10));

        double totalPrice = toys.stream()
                .filter(e -> Objects.equals(e.getColor(), "red"))
                .mapToDouble(Toy::getPrice).sum();

        System.out.println("Total price of red toys : " + totalPrice);

    }
}

