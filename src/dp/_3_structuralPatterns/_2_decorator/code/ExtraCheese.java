package dp._3_structuralPatterns._2_decorator.code;

public class ExtraCheese extends PizzaDecorator {
    public ExtraCheese(PizzaBunga pizzaBunga) {
        super(pizzaBunga);
    }

    public double calculatePrice() {
        return super.calculatePrice() + 1.0;
    }

    public String getDescription() {
        return super.getDescription() + ", extra cheese";
    }
}
