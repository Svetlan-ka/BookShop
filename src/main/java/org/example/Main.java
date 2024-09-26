package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Product> catalog = Catalog.getInstanse();
        Scanner scan = new Scanner(System.in);
        Basket basket;

        //Liskov substitution principle
        Product bookJava2020 = new Book(" Книга 'Java-разработчик'", 1250, CategoryBook.EDUCATIONAL, "noName", "noName", 2020, 259);
        Product pencilBlackCrauser = new OfficeSupplies("Карандаш черный для рисования 3 шт.", 17, CategoryStationery.FOR_DRAWING, 3);
        Product notebookCat48page = new OfficeSupplies("Блокнот черный с рисунком 'кот' 48 листов", 319, CategoryStationery.FOR_WRITING, 1);
        catalog.add(bookJava2020);
        catalog.add(pencilBlackCrauser);
        catalog.add(notebookCat48page);

        ///////////////////////////////////////////////////////////

        System.out.println("Добро пожаловать в книжный магазин!");
        System.out.print("Введите имя: ");
        String name = scan.nextLine();
        System.out.print("Введите фамилию: ");
        String surname = scan.nextLine();
        System.out.print("Введите email: ");
        String email = scan.nextLine();
        Client client = new Client(name, surname, email);
        basket = client.getBasket();


        ShopBook.printMenu();
        System.out.print("Введите номер меню: ");
        int numberMenu = Integer.parseInt(scan.nextLine());


        while (true) {
            switch (numberMenu) {
                case 1:
                    Catalog.printCatalog();
                    break;
                case 2:
                    basket.consolePrint();  //DRY
                    break;
                case 3:

                    System.out.print("Введите артикул товара: ");
                    int article1 = Integer.parseInt(scan.nextLine());
                    Product product1 = Catalog.getProductByKod(article1);
                    System.out.print("Введите необходимое количество товара: ");
                    int quantity1 = Integer.parseInt(scan.nextLine());
                    basket.addProduct(product1, quantity1);
                    break;
                case 4:
                    System.out.print("Введите артикул товара: ");
                    int article2 = Integer.parseInt(scan.nextLine());
                    Product product2 = Catalog.getProductByKod(article2);
                    basket.deleteProduct(product2);
                    break;
                case 5:
                    Order order = new Order(client);
                    System.out.print("Для оформления заказа введите Ваш номер телефона: ");
                    long telephone = Long.parseLong(scan.nextLine());
                    order.setOrder(client, telephone);
                    break;
                case 0:
                    System.out.println("Магазин закрывается. Всего доброго!");
                    return;
            }
            ShopBook.printMenu();  //DRY
            System.out.print("Введите номер меню: ");
            numberMenu = Integer.parseInt(scan.nextLine());
        }
    }
}