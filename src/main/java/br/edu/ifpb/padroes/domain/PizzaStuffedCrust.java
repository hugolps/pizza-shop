package br.edu.ifpb.padroes.domain;

public class PizzaStuffedCrust extends PizzaDecorator{
    public PizzaStuffedCrust(Pizza wrappedPizza) {
        super(wrappedPizza);
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.2f;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
