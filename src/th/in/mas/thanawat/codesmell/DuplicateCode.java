package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

public class DuplicateCode extends CodeSmellImpl {
    @Override
    public String smellName() {
        return DuplicateCode.class.getSimpleName();
    }

    public static void main(String[] args) {
        DuplicateCode code = new DuplicateCode();
        code.run();
    }

    @Override
    public void problem() {
        super.problem();

        Product chocolateS = new Product("ChocolateS", 50.0, 6);
        Product chocolate = new Product("Chocolate", 120.0, 1);
        Product chocolateXL = new Product("ChocolateXL", 300.0, 2);

        final double chocolateSDiscountRate = 0.05;
        final double chocolateDiscountRate = 0.10;
        final double chocolateXLDiscountRate = 0.40;
        final double memberDiscountRate = 0.05;


        double chocolateSPrice = chocolateS.calculatePrice() * (1-chocolateSDiscountRate);
        double chocolatePrice = chocolate.calculatePrice() * (1-chocolateDiscountRate);
        double chocolateXLPrice = chocolateXL.calculatePrice() * (1-chocolateXLDiscountRate);

        double summaryPrice = (chocolateSPrice + chocolatePrice + chocolateXLPrice) * (1-memberDiscountRate);

        System.out.println("summaryPrice = " + summaryPrice);
    }

    @Override
    public void solve() {
       super.solve();

        Product chocolateS = new Product("ChocolateS", 50.0, 6);
        Product chocolate = new Product("Chocolate", 120.0, 1);
        Product chocolateXL = new Product("ChocolateXL", 300.0, 2);

        final double chocolateSDiscountRate = 0.05;
        final double chocolateDiscountRate = 0.10;
        final double chocolateXLDiscountRate = 0.40;
        final double memberDiscountRate = 0.05;

        double chocolateSPrice = chocolateS.calculatePriceWithDiscount(chocolateSDiscountRate);
        double chocolatePrice = chocolate.calculatePriceWithDiscount(chocolateDiscountRate);
        double chocolateXLPrice = chocolateXL.calculatePriceWithDiscount(chocolateXLDiscountRate);

        double summaryPrice = (chocolateSPrice + chocolatePrice + chocolateXLPrice) * (1-memberDiscountRate);

        System.out.println("summaryPrice = " + summaryPrice);
    }

    class Product {
        private String name;
        private Double price;
        private int qty;

        Product(String name, Double price, int qty) {
            this.name = name;
            this.price = price;
            this.qty = qty;
        }

        Double calculatePrice() {
            return price * qty;
        }

        Double calculatePriceWithDiscount(double discountRate) {
            return price * (1-discountRate) * qty;
        }
    }
}

