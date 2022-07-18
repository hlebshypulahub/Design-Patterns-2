package dp._3_structuralPatterns._2_decorator.test;

import static org.junit.Assert.assertEquals;

import dp._3_structuralPatterns._2_decorator.code.*;
import org.junit.Test;

public class PizzaBungaTest {
	
	private static final double epsilon = 0.001;

	@Test
	public void shouldCalculatePriceForGlutenFreeCortinaWithExtraSouce() {
		// given
		 PizzaBunga pizza = new Cortina();
		 pizza = new GlutenFree(pizza);
		 pizza = new ExtraSouce(pizza);
		
		// when
		double price = pizza.calculatePrice();

		// then
		assertEquals(24.9, price, epsilon);
	}
	
	@Test
	public void shouldGetDescriptionForGlutenFreeCortinaWithExtraSouce() {
		// given
		PizzaBunga pizza = new Cortina();
		pizza = new ExtraSouce(pizza);
		pizza = new GlutenFree(pizza);
		
		// when
		String description = pizza.getDescription();

		// then
		assertEquals("Cortina, extra souce, gluten free", description);
	}
	
	@Test
	public void shouldCalculatePriceForPampelona() {
		// given
		PizzaBunga pizza = new Pampelona();
		
		// when
		double price = pizza.calculatePrice();

		// then
		assertEquals(9.9, price, epsilon);
	}
	
	@Test
	public void shouldGetDescriptionForPampelona() {
		// given
		PizzaBunga pizza = new Pampelona();
		
		// when
		String description = pizza.getDescription();

		// then
		assertEquals("Pampelona", description);
	}
	
	@Test
	public void shouldCalculatePriceForMonteCarloWithExtraCheese() {
		// given
		PizzaBunga pizza = new MonteCarlo();
		pizza = new ExtraCheese(pizza);
		
		// when
		double price = pizza.calculatePrice();

		// then
		assertEquals(16.9, price, epsilon);
	}
	
	@Test
	public void shouldGetDescriptionForMonteCarloWithExtraCheese() {
		// given
		PizzaBunga pizza = new MonteCarlo();
		pizza = new ExtraCheese(pizza);
		
		// when
		String description = pizza.getDescription();

		// then
		assertEquals("Monte Carlo, extra cheese", description);
	}
}
