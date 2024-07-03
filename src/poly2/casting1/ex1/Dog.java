package poly2.casting1.ex1;

public class Dog extends Animal {
    public void eat() {
        System.out.println("강아지가 사료를 먹어요.");
    }
    @Override
    public void sound() {
        System.out.println("강아지가 멍멍");
    }
}
