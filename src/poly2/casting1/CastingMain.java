package poly2.casting1;

public class CastingMain {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.parentMethod();
        //parent.childMethod(); 실행안됌!!!
        //parent.childMethod();//parent를 child로 바꿔야함.

        Child poly = (Child) parent;
        poly.childMethod();


    }
}
