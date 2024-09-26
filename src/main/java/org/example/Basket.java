package org.example;

import java.util.HashMap;

public class Basket implements Print {  //Single-Responsibility principle
    private final int kodBasket;
    private static int kodCounter = 0;
    private static HashMap<Product, Integer> basket;

    public Basket() {
        this.kodBasket = kodCounter++;
        basket = new HashMap<>();
    }

//    public static void printBasket() {
//        double resultSumm = 0;
//        if (!basket.isEmpty()) {
//            for (Product product : basket.keySet()) {
//                String name = product.getNameProduct();
//                double summ = product.getPrice() * basket.get(product);
//                System.out.println("Товар: " + name + ", кол-во: " + basket.get(product) + ", стоимость: " + summ);
//                resultSumm += summ;
//            }
//        } else {
//            System.out.println("Ваша корзина пуста!");
//        }
//        System.out.println("Итого: " + resultSumm);
//    }

    public static void addProduct(Product product, int quantity) {
        int minQuantity = 1; //МАГИЧЕСКИЕ ЧИСЛА
        if (quantity >= minQuantity) {
            basket.put(product, quantity);
        }
    }

    public static void deleteProduct(Product product) {
        basket.remove(product);
    }


    @Override
    public void consolePrint() {
        double resultSumm = 0;
        if (!basket.isEmpty()) {
            for (Product product : basket.keySet()) {
                String name = product.getNameProduct();
                double summ = product.getPrice() * basket.get(product);
                System.out.println("Товар: " + name + ", кол-во: " + basket.get(product) + ", стоимость: " + summ);
                resultSumm += summ;
            }
        } else {
            System.out.println("Ваша корзина пуста!");
        }
        System.out.println("Итого: " + resultSumm);
    }
}
