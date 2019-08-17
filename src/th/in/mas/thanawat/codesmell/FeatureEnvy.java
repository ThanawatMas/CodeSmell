package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

public class FeatureEnvy extends CodeSmellImpl {
    @Override
    public String smellName() {
        return FeatureEnvy.class.getSimpleName();
    }

    public static void main(String[] args) {
        FeatureEnvy featureEnvy = new FeatureEnvy();
        featureEnvy.run();
    }

    @Override
    public void problem() {
        super.problem();
        SnackComboWithFeatureEnvy snackComboWithFeatureEnvy = new SnackComboWithFeatureEnvy(
                "Fried With Cola", true, new Beverage1("Cola", 350));
        System.out.println(snackComboWithFeatureEnvy.beverageInfo());
    }

    class Beverage1 {
        String name;
        int capacity;

        public Beverage1(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        String getName() {
            return name;
        }

        int getCapacity() {
            return capacity;
        }
    }

    class SnackComboWithFeatureEnvy {
        String snackName;
        boolean serveWithBeverage;
        Beverage1 beverage;

        public SnackComboWithFeatureEnvy(String snackName, boolean serveWithBeverage, Beverage1 beverage) {
            this.snackName = snackName;
            this.serveWithBeverage = serveWithBeverage;
            this.beverage = beverage;
        }

        String beverageInfo() {
            return beverage.getName() + " sizes " + beverage.getCapacity() + " ml.";
        }
    }

    @Override
    public void solve() {
        super.solve();
        SnackComboWithoutFeatureEnvy snackComboWithoutFeatureEnvy = new SnackComboWithoutFeatureEnvy(
                "Fried With Cola", true, new Beverage2("Cola", 350));
        System.out.println(snackComboWithoutFeatureEnvy.beverageInfo());
    }


    class Beverage2 {
        String name;
        int capacity;

        public Beverage2(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        String getName() {
            return name;
        }

        int getCapacity() {
            return capacity;
        }

        String getInfo() {
            return name + " sizes " + capacity + " ml.";
        }
    }
    class SnackComboWithoutFeatureEnvy {
        String snackName;
        boolean serveWithBeverage;
        Beverage2 beverage;

        public SnackComboWithoutFeatureEnvy(String snackName, boolean serveWithBeverage, Beverage2 beverage) {
            this.snackName = snackName;
            this.serveWithBeverage = serveWithBeverage;
            this.beverage = beverage;
        }

        String beverageInfo() {
            return beverage.getInfo();
        }
    }
}
