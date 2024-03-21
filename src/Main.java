public class Main {
    public static void main(String[] args){
        Dog dogTom = new Dog();
        Cat catBars = new Cat();

        dogTom.run(150);
        dogTom.swim(7);

        catBars.run(100);
        catBars.swim(3);

        System.out.println("Cats: " + Cat.getCatCount());
        System.out.println("Dogs: " + Dog.getDogCount());
    }
}