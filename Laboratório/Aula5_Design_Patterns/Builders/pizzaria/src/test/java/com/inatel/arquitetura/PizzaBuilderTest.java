package com.inatel.arquitetura;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for PizzaBuilder class.
 */
public class PizzaBuilderTest 
{

    @Test
    public void deveConstruirPizzaValida() {
        Pizza pizza = new PizzaBuilder()
            .setSize(3)
            .addCheese()
            .addPepperoni()
            .getPizza();

        assertNotNull(pizza);
        assertNotNull(pizza.getSize());
        assertNotNull(pizza.getFlagCheese());
        assertNotNull(pizza.getFlagPepperoni());
    }

    @Test
    public void deveInvalidarPizzaComTamanhoInvalido() {

        try {
            Pizza pizza = new PizzaBuilder()
                .setSize(5)
                .addCheese()
                .addPepperoni()
                .getPizza();

            fail("Deveria ter lançado uma exception");

        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deveInvalidarPizzaSemIngrediente() {

        try {
            Pizza pizza = new PizzaBuilder()
                .setSize(3)
                .getPizza();

            fail("Deveria ter lançado uma exception");

        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

}
