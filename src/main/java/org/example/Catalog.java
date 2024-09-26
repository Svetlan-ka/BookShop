package org.example;

import java.util.HashSet;

public class Catalog {  //Single-Responsibility principle
    private static HashSet<Product> catalog;

    private Catalog() {
    }

    public static HashSet<Product> getInstanse() {
        if (catalog == null) catalog = new HashSet<Product>();
        return catalog;
    }

    public static void printCatalog() {
        for (Product product : catalog) {
            System.out.println(product);
        }
    }

    public static void addProduct(Product product) {
        catalog.add(product);
    }

    public static void deleteProduct(Product product) {
        catalog.remove(product);
    }

    public static Product getProductByKod(int kod) {
        for (Product product : catalog) {
            if (product.getKodProduct() == kod) return product;
        }
        return null;
    }

}