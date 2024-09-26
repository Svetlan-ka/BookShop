package org.example;

public class Product {  //Open-closed principle
    private final int kodProduct;
    private static int kodCounter = 0;
    private String nameProduct;
    private double price;

    public Product(String nameProduct, double price) {
        this.kodProduct = kodCounter++;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[Артикул: " + kodProduct +
                ", Наименование: " + "'" + nameProduct + "'" +
                ", Стоимость: " + price + " руб.]";
    }

    public int getKodProduct() {
        return kodProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
