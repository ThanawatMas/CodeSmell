package th.in.mas.thanawat.codesmell;

import th.in.mas.thanawat.codesmell.prototype.CodeSmellImpl;

public class MiddleMan extends CodeSmellImpl {
    @Override
    public String smellName() {
        return MiddleMan.class.getSimpleName();
    }

    public static void main(String[] args) {
        MiddleMan middleMan = new MiddleMan();
        middleMan.run();
    }

    @Override
    public void problem() {
        super.problem();

    }

    @Override
    public void solve() {
        super.solve();

    }
}
