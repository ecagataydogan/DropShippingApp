package DropShippingApp;

import DropShipping.SalesQuery;

public class DropShippingApp {
    public static void main(String[] args) {
        SalesQuery sq = new SalesQuery();
        sq.mostProfitableProduct();
        sq.mostExpensiveProduct();
        sq.totalProfits();
        sq.leastProfit("s1");
    }
}
