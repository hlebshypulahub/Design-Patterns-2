package dp._3_structuralPatterns._2_decorator.code;

/**
 * @author mibejm
 */
public class MonteCarlo implements PizzaBunga {

    @Override
    public String getDescription() {
        return "Monte Carlo";
    }

    @Override
    public double calculatePrice() {
        return 15.9;
    }
}
