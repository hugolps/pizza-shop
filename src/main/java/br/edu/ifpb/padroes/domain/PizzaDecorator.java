package br.edu.ifpb.padroes.domain;

public class PizzaDecorator implements Pizza{
    Pizza wrapperPizza;

    public PizzaDecorator(Pizza wrapperPizza) {
        this.wrapperPizza = wrapperPizza;
    }

    @Override
    public Float getPrice() {
        return wrapperPizza.getPrice();
    }

    @Override
    public String getName() {
        return wrapperPizza.getName();
    }
}
