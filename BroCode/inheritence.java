public class inheritence {
    public static void main(String[] args) {
   
        // Inheritance = One class inherits the attributes and    methods
        // from another class.
        // Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        System.out.println(plant.isAlive);

        dog.eat();
        cat.eat();
        plant.photosysnthesize();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speaks();
        cat.speaks();
    }
}
