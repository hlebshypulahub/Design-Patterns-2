package dp._3_structuralPatterns._2_decorator.code;

public class Pampelona implements PizzaBunga {

    @Override
    public String getDescription() {
        return "Pampelona";
    }

    @Override
    public double calculatePrice() {
        return 9.9;
    }
}
