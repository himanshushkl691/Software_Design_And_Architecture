public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
    OldCoffeeMachine oldVendingMachine = null;

    public void attachVendingMachine(OldCoffeeMachine oldVendingMachine) {
        this.oldVendingMachine = oldVendingMachine;
    }

    public void chooseFirstSelection() {
        this.oldVendingMachine.selectA();
    }

    public void chooseSecondSelection() {
        this.oldVendingMachine.selectB();
    }
}