package jp.ac.hal.yoongeonung.designpatterns.creationalpatterns.singleton;

public class Singleton03 {
    /**
     * Synchronized(동기화)를 사용
     *
     * 장점 :
     * 멀티쓰레드 환경에서 안전하게 만들수 있다.
     *
     * 단점 :
     * 동기화 처리 작업으로 인한 성능상 불이익이 존재할수 있다.
     */
    private static Singleton03 instance;

    public static synchronized Singleton03 getInstance() {
        if (instance == null) {
            instance = new Singleton03();
        }
        return instance;
    }
}
