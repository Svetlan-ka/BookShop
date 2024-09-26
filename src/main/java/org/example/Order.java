package org.example;

import java.time.LocalDate;
import java.util.Date;
import java.util.OptionalInt;

public class Order implements Print {
    private final int kodOrder;
    private static int kodCounter = 0;
    private final Client client;
    private Date dateOrder;
    private static Basket basket;

    public Order(Client client) {
        this.kodOrder = kodCounter++;
        this.client = client;
        this.dateOrder = new Date();
        this.basket = client.getBasket();
    }

    public void setOrder(Client client, long telephone) {
        client.setTelephone(telephone);
        consolePrint(); //DRY
        System.out.println("Ваш заказ успешно оформлен!");
    }

    @Override
    public void consolePrint() {
        System.out.println(client.getName() + "\n" +
                client.getSurname() + "\n" +
                client.getEmail() + "\n" +
                client.getTelephone() + "\n"
        );
        System.out.println(dateOrder);
        basket.consolePrint(); //DRY
    }
}
