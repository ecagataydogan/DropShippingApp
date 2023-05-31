package DropShipping;

public class SalesQuery {
    private SalesManagement salesManagement = new SalesManagement();

    //Get sales from DropShipping.SalesManagement calculates profits of products. Find most profitable product.
    public void mostProfitableProduct() {
        double profit = 0;
        Product product = null;
        for (int i = 0; i < salesManagement.getSales().length ; i++) {
            //Specific suplier sales
            Sales[] sSales = salesManagement.getSales()[i];
            for(int j = 0 ; j < sSales.length; j++) {
                if (profit < (sSales[j].calculateProfit())) {
                    profit = sSales[j].calculateProfit();
                    product = sSales[j].getProduct();
                }
            }
        }
        System.out.println("Most profitable product is");
        System.out.println(product.getId() + " " + product.getTitle() + " " + product.getRate() + " " +
        product.getNumberOfReviews() + " " + product.getPrice() + "=> " + profit + " TL profit ");
        System.out.println("*".repeat(30));
    }

    //Get sales from DropShipping.SalesManagement calculates most expensive product according the sales prices.
    public void mostExpensiveProduct() {
        double mostExpensive = 0;
        Product product = null;
        for (int i = 0; i < salesManagement.getSales().length ; i++) {
            Sales[] sSales = salesManagement.getSales()[i];
            for(int j = 0; j < salesManagement.getSales()[i].length;j++) {
                Sales sales = salesManagement.getSales()[i][j];
                if(sales.getSalesPrice() > mostExpensive) {
                    mostExpensive = sales.getSalesPrice();
                    product = sales.getProduct();
                }
            }
        }
        System.out.println("Most expensive product is");
        System.out.println(product.getId() + " " + product.getTitle() + " " + product.getRate() + " " +
                product.getNumberOfReviews() + " " + product.getPrice() + "=> " + "with sales price " +  mostExpensive + " TL");
        System.out.println("*".repeat(30));
    }

    //Get sales from DropShipping.SalesManagement calculates total profits of all products
    public void totalProfits() {
        double profit = 0;
        for (int i = 0; i < salesManagement.getSales().length ; i++) {
            Sales[] sSales = salesManagement.getSales()[i];
            for(int j = 0 ; j < sSales.length; j++) {
                profit += sSales[j].calculateProfit();
            }
        }
        System.out.println("All profits " + (int)profit + "TL");
        System.out.println("*".repeat(30));
    }

    //Get sales from DropShipping.SalesManagement calculates least-profit product of S1,S2 or S3
    public void leastProfit(String supplierName) {
        //To specify supplier
        int suplierIndex = -1;
        Product product = null;
        double profit = Integer.MAX_VALUE;
        if(supplierName.equals("s1")) {
            suplierIndex = 0;
        } else if (supplierName.equals("s2")) {
            suplierIndex = 1;
        } else if (supplierName.equals("s3")) {
            suplierIndex = 2;
        }
        //Gets sales of specified supplier
        Sales[] sSales = salesManagement.getSales()[suplierIndex];
        for(Sales sales : sSales) {
            if(sales.calculateProfit() < profit) {
                profit = sales.calculateProfit();
                product = sales.getProduct();
            }
        }
        System.out.println(product.getId() + " " + product.getTitle() + " " + product.getRate() + " "+
                product.getNumberOfReviews() + " " +
                product.getPrice() + " => " + profit + " TL profit");
        System.out.println("*".repeat(30));

    }

}

