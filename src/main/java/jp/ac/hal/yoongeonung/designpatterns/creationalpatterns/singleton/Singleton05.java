package jp.ac.hal.yoongeonung.designpatterns.creationalpatterns.singleton;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton05 {
    /**
     * static inner 클래스 사용
     *
     * 장점 :
     * 멀티쓰레드 환경에서 안전
     * Lazy loading 도 가능
     *
     * 단점 :
     * 완벽하지 않다. 이 패턴을 깨트릴수있는 방법이 존재
     */

    private static class Singleton05Holder {
        private static final Singleton05 INSTANCE = new Singleton05();
        /**
         * static class의 효용성?
         */
    }

    public static Singleton05 getInstance() {
        return Singleton05Holder.INSTANCE;
    }
}
