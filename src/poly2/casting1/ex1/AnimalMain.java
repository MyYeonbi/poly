package poly2.casting1.ex1;

public class AnimalMain {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        Dog dog2 = (Dog) dog;
        dog2.eat();


        ((Dog) dog).sound();
        ((Cat) cat).sound();
        ((Cat) cat).eat();



    }
}
