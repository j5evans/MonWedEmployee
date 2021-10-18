package comp.comp152;

public abstract class Employee {

    public final void fileW2Forms() {
        System.out.println("Here are your W2 forms.");
    }

    public void withholdTaxes() {
        System.out.println("Removing " + calculateBiWeeklyPay() * 0.1 +  " of your pay for taxes.");
    }

    public abstract double calculateBiWeeklyPay();
}
