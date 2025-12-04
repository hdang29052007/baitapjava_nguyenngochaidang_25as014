package bai6.ex66;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Cat("Kitty");
        a1.greets();     // Meow

        Dog d1 = new Dog("Buddy");
        d1.greets();     // Woof

        Dog d2 = new Dog("Lucky");
        d1.greets(d2);   // Wooof

        BigDog bd1 = new BigDog("Titan");
        bd1.greets();     // Wooow

        BigDog bd2 = new BigDog("Maximus");
        bd1.greets(bd2);  // Woooooow

        bd1.greets(d1);   // Wooood  (big dog greeting a dog)
    }
}
