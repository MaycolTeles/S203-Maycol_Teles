package com.inatel.arquitetura;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    private void validateIngredient() {
        if (pizza.getFlagCheese() == false || pizza.getFlagPepperoni() == false)
            throw new IllegalStateException("Pizza não possui nenhum sabor.");
    }

    private void validateSize() {
        if (
            pizza.getSize() != 1
            && pizza.getSize() != 2
            && pizza.getSize() != 3
        )
            throw new IllegalStateException("Pizza não possui um tamanho válido.");
    }

    public PizzaBuilder addCheese() {
        pizza.setFlagCheese(true);
        return this;
    }

    public PizzaBuilder addPepperoni() {
        pizza.setFlagPepperoni(true);
        return this;
    }

    public PizzaBuilder setSize(Integer size) {
        pizza.setSize(size);
        return this;
    }

    public Pizza getPizza() {
        validateIngredient();
        validateSize();

        return pizza;
    }

}
