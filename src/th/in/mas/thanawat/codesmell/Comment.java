package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Comment extends CodeSmellImpl {
    @Override
    public String smellName() {
        return Comment.class.getSimpleName();
    }

    public static void main(String[] args) {
        Comment code = new Comment();
        code.run();
    }


    @Override
    public void problem() {
        super.problem();
        //check bill
        List<Food> orderList = getOrderList();

        //calculate food price
        double totalFoodPrice = calculateTotalFoodPrice(orderList);

        //calculate service charge
        double serviceCharge = calculateServiceCharge(totalFoodPrice);

        //calculate tax
        double tax = calculateTax(totalFoodPrice, serviceCharge);

        //calculate summary
        double summary = calculateSummary(totalFoodPrice, serviceCharge, tax);

        //receive money
        double receive = 2000;
        System.out.println("\nReceive = " + receive);


        //return money
        double change = getChange(summary, receive);

        //check customer
        isEnoughMoney(change);
    }

    @Override
    public void solve() {
        super.solve();

        List<Food> orderList = getOrderList();

        double totalFoodPrice = calculateTotalFoodPrice(orderList);
        double serviceCharge = calculateServiceCharge(totalFoodPrice);
        double tax = calculateTax(totalFoodPrice, serviceCharge);
        double summary = calculateSummary(totalFoodPrice, serviceCharge, tax);

        double receive = 2000;
        System.out.println("\nReceive = " + receive);
        double change = getChange(summary, receive);
        isEnoughMoney(change);
    }

    private List<Food> getOrderList() {
        List<Food> orderList = new ArrayList<>();
        orderList.add(new Food("Som-Tum-Poo-Plara", 40.0, 2));
        orderList.add(new Food("Pla-Pow", 180.0, 2));
        orderList.add(new Food("Jim-Joom", 260.0, 2));
        orderList.add(new Food("Kho-Moo-Yang", 60.0, 4));
        orderList.add(new Food("Tom-Sab", 60.0, 1));
        orderList.add(new Food("Sticky Rice", 10.0, 8));
        orderList.add(new Food("Ice", 40.0, 2));
        orderList.add(new Food("Water", 20.0, 3));
        return orderList;
    }

    private double calculateTotalFoodPrice(List<Food> orderList) {
        double total = 0;
        for(Food food: orderList) {
            double foodTotalPrice = food.getPrice() * food.getQuantity();
            System.out.println(food.getName() + "\t\t\t" + food.getQuantity() + "*" + food.getPrice() + "=" + foodTotalPrice);
            total += foodTotalPrice;
        }
        System.out.println("\nTotal = " + total);
        return total;
    }

    private double calculateServiceCharge(double totalFoodPrice) {
        double serviceCharge = totalFoodPrice * 10 / 100;
        System.out.println("ServiceCharge = " + serviceCharge);
        return serviceCharge;
    }

    private double calculateTax(double totalFoodPrice, double serviceCharge) {
        double tax = (totalFoodPrice + serviceCharge) * 7 / 100;
        System.out.println("Tax = " + tax);
        return tax;
    }

    private double calculateSummary(double total, double serviceCharge, double tax) {
        double summary = total + serviceCharge + tax;
        System.out.println("Summary = " + summary);
        return summary;
    }

    private void isEnoughMoney(double change) {
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        if (change < 0) {
            System.out.println("There aren't enough money for billing, Please give us more money which is " +formatter.format(Math.abs(change)) + " baht");
        } else {
            System.out.println("Thank you, This is you change " + formatter.format(change) + " baht.");
        }
    }

    private double getChange(double summary, double receive) {
        DecimalFormat formatter = new DecimalFormat("#,##0.00");
        double change = receive - summary;
        System.out.println("Change = " +  formatter.format(change) );
        return change;
    }

    class Food {
        private String name;
        private double price;
        private int quantity;

        Food(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        String getName() {
            return name;
        }

        double getPrice() {
            return price;
        }

        int getQuantity() {
            return quantity;
        }
    }
}


