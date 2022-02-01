package yoongeonung.designpattern.creationalpatterns.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton04 {
    /**
     * double checking locking 사용
     *
     * 장점 :
     * 멀티쓰레드 환경에서 안전하게 만들수 있다.
     * instance가 있을경우 synchronized를 사용하지 않기 때문에
     * 성능상 나쁘지 않다.
     * instance를 필요로하는 그 시점에 생성할수 있다.(lazy loading)
     *
     * 메서드 자체에 synchronized가 붙었을때는 매번 synchronized, 즉 동기화가 진행되어야하지만
     * double checked locking의 경우 어쩌다 필요한 동시에 진입되었을때 거기에 인스턴스가 없었을때에만
     * synchronized구문에 접근하기 때문에 성능상 훨씬 유리하다.
     *
     *
     * 단점 :
     * 자바 1.5이상 부터 volatile을 이용하여
     * double checking locking이 작동한다.
     * volatile을 이해하려면
     * 자바 1.4 이하의 JVM의 메모리관구조에 대한 이해가 별도로 필요하다.
     */

    private static volatile Singleton04 instance;

    public static Singleton04 getInstance() {
        if (instance == null) {
            synchronized (Singleton04.class) {
                instance = new Singleton04();
            }
        }
        return instance;
    }
}
