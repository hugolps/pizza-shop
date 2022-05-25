package br.edu.ifpb.padroes.domain;

public class PizzaPanDough extends PizzaDecorator{
    public PizzaPanDough(Pizza wrappedPizza) {
        super(wrappedPizza);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.15f;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
