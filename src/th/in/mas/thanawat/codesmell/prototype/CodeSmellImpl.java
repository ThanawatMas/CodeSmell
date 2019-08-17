package th.in.mas.thanawat.codesmell.prototype;

public abstract class CodeSmellImpl implements CodeSmell {
    public void run() {
        System.out.println("SmellName: " + smellName());
        problem();
        solve();
    }

    @Override
    public void problem() {
        System.out.println("============================");
        System.out.println("[          Problem          ]");
    }

    @Override
    public void solve() {
        System.out.println("============================");
        System.out.println("[           Solve           ]");
    }
}