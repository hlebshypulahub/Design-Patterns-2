package dp._3_structuralPatterns._2_decorator.code;

public abstract class PizzaDecorator implements PizzaBunga {

    private final PizzaBunga pizzaBunga;

    public PizzaDecorator(PizzaBunga pizzaBunga) {
        this.pizzaBunga = pizzaBunga;
    }

    public double calculatePrice() {
        return pizzaBunga.calculatePrice();
    }

    public String getDescription() {
        return pizzaBunga.getDescription();
    }
}
