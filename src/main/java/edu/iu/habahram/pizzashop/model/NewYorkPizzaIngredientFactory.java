package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Garlic(),
                new Onions(),
                new Mushrooms(),
                new RedPeppers()
        };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni() {
        };
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
