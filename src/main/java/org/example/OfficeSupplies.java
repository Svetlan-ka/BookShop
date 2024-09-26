package org.example;

public class OfficeSupplies extends Product{
    private final CategoryStationery category;
    private int piecesInSet;  //кол-во штук в наборе

    public OfficeSupplies(String nameProduct, double price, CategoryStationery category, int piecesInSet) {
        super(nameProduct, price);
        this.category = category;
        this.piecesInSet = piecesInSet;
    }
}
