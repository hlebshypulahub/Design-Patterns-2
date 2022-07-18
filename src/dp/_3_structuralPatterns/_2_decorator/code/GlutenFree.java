package dp._3_structuralPatterns._2_decorator.code;

public class GlutenFree extends PizzaDecorator {
    public GlutenFree(PizzaBunga pizzaBunga) {
        super(pizzaBunga);
    }

    public double calculatePrice() {
        return super.calculatePrice() + 5.0;
    }

    public String getDescription() {
        return super.getDescription() + ", gluten free";
    }
}
