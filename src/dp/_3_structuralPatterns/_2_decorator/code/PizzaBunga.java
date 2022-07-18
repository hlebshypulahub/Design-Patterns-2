package dp._3_structuralPatterns._2_decorator.code;

/**
 * 
 * TASK 3.2 - Capgemini employees found out about the "Pizza Bunga" Pizzeria.
 * The order system for this pizzeria did not expect that customers would like to buy
 * pizzas with extra ingredients or even gluten-free. Currently adding a new topping involves 
 * a change of the the base {@link PizzaBunga} class. Rewrite this code using "Decorator" pattern. 
 * 
 * @author mibejm
 *
 */
public interface PizzaBunga {

	String getDescription();
	double calculatePrice();
}
