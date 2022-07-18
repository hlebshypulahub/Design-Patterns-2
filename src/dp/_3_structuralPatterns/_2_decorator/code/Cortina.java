package dp._3_structuralPatterns._2_decorator.code;

public class Cortina implements PizzaBunga {

	@Override
	public String getDescription() {
		return "Cortina";
	}
	
	@Override
	public double calculatePrice() {
		return 17.9;
	}
}
