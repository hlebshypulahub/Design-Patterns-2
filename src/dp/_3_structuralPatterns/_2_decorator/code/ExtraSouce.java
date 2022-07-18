package dp._3_structuralPatterns._2_decorator.code;

public class ExtraSouce extends PizzaDecorator {
    public ExtraSouce(PizzaBunga pizzaBunga) {
        super(pizzaBunga);
    }

    public double calculatePrice() {
        return super.calculatePrice() + 2.0;
    }

    public String getDescription() {
        return super.getDescription() + ", extra souce";
    }
}