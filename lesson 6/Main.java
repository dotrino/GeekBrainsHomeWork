public class Main {
    public static void main(String[] args) {
        Animal animalCat = new Animal("CatsCategory");
        Cat cat = new Cat("Barsik", 200, false, 2);
        animalCat.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal animalDog = new Animal("Dogs");
        Dog dog = new Dog("Sharik", 500, 10, 0.5);
        animalDog.animalInfo();
        dog.animalInfo();
        dog.dogInfo();
    }
}
