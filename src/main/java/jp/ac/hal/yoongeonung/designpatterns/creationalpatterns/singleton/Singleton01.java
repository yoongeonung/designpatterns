package jp.ac.hal.yoongeonung.designpatterns.creationalpatterns.singleton;

public class Singleton01 {
    /**
     * TODO, 복습할 때 일본어로 번역
     * static하게 자기 자신을 없을경우 getInstance()를 이용하여 생성하여 가지고있는다.
     */
    private static Singleton01 instance;


    /**
     * 생성자를 private하게 바꿔서 외부에서 접근하지 못하게 한다.
     */
    private Singleton01() {
    }

    /**
     * 인스턴스를 생성하지 않아도 글로벌하게 메서드를 호출할수 있게
     * static으로 메서드를 작성한다.
     *
     * 만약 instance가 null일경우 새로 생성해서 반환하고
     * 아닐경우 새로 생성한다.
     */
    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }
    /**
     * getInstance() 멀티쓰레드 환경에서 안전하지 않다.
     * 새로 다른 두 쓰레드가 getInstance()를 동시에 호출할시
     * 객체가 두개 생성되어버리는 문제점이 있다.
     */
}
