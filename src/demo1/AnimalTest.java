package demo1;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Zwierze", "Czerwone");
        System.out.println(animal.getVoice());
        Dog dog = new Dog ("Azor", "Szary", 20);
        System.out.println(dog.getVoice());
    }
}
