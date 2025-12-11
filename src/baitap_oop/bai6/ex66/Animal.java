package baitap_oop.bai6.ex66;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
