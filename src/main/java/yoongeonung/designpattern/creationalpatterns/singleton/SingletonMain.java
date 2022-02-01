package yoongeonung.designpattern.creationalpatterns.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton06 instance = Singleton06.INSTANCE;
        System.out.println("instance = " + instance);
    }
}
