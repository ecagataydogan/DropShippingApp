public class SalesQuery {
    private SalesManagement salesManagement = new SalesManagement();

    public void mostProfitableProduct() {
        double profit = 0;
        Product product = null;
        for (int i = 0; i < salesManagement.getSales().length ; i++) {
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
    }

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
    }



}
