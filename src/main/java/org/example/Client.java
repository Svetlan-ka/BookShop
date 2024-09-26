package org.example;

import java.util.HashMap;

public class Client {
    private final int idClient;
    private static int idCounter = 0; //МАГИЧЕСКИЕ ЧИСЛА
    private final String name;
    private final String surname;
    private String email;
    private long telephone;
    private final Basket basket;

    public Client(String name, String surname, String email) {
        this.idClient = idCounter++;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.basket = new Basket();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }


    public Basket getBasket() {
        return basket;
    }
}
