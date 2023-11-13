public class Main {
    public static void main(String[] args) {
        Dog doggie = new Dog();
        Cat catsie = new Cat();

        doggie.makeSound();
        catsie.makeSound();

        doggie.eat("dogfood");
        catsie.eat("fish");
    }
}
