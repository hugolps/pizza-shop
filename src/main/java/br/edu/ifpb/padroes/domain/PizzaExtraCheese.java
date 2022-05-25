package br.edu.ifpb.padroes.domain;

public class PizzaExtraCheese extends PizzaDecorator{
    public PizzaExtraCheese(Pizza wrappedPizza) {
        super(wrappedPizza);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.10f;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
